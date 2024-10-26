package com.mysticarts.movies;

import lombok.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Iterator;

@ToString

public class MoviesDaoIImpl implements MoviesInfo {

    private static String DB_URL = "jdbc:mysql://localhost:3306/spotify_management_system?useSSL=false";
    private static String USERNAME = "root";
    private static String PASSWORD = "AbhiVarun@7204736095";
    private Connection connection;
    private static String excelFilePath = "D:\\Movie_Information.xlsx";
    private static String excelFilePathR = "D:\\Read_DataFromDatabase_And_DisplayIntoExcel.xlsx";

    int batchSize = 10;
    public MoviesDaoIImpl(){
        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            connection.setAutoCommit(false);
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Database connection is successfully connected.!");
            System.out.println("---------------------------------------------------------------------------------------");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readDataFromExcelAndInsertIntoDatabase() {
        long start = System.currentTimeMillis();
        try {
            FileInputStream inputStream = new FileInputStream(excelFilePath);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = firstSheet.iterator();

            String sql = "INSERT INTO movie_details(Movie_Name, Director_Name) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            int count = 0;
            rowIterator.next(); //skip the header row

            while (rowIterator.hasNext()){
                Row nextRow = rowIterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();

                while (cellIterator.hasNext()){
                    Cell nextCell = cellIterator.next();
                    int columnIndex = nextCell.getColumnIndex();
                    switch (columnIndex){
                        case 0:
                            String Movie_Name = nextCell.getStringCellValue();
                            preparedStatement.setString(1, Movie_Name);
                            break;


                        case 2:
                            String Director_Name = nextCell.getStringCellValue();
                            preparedStatement.setString(2, Director_Name);

                    }
                }
                preparedStatement.addBatch();
                if (++count % batchSize == 0){
                    preparedStatement.executeBatch();
                }
            }
            System.out.println("Your data inserted successfully.");

            workbook.close();;

            preparedStatement.executeBatch();
            connection.commit();
            connection.close();
            long end = System.currentTimeMillis();
            System.out.printf("Import done in %d ms\n", (end-start));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println("Error reading file" + e.getMessage());
        }catch (SQLException e){
            System.out.println("Database error"  + e.getMessage());
        }


    }

    @Override
    public void readDataFromDatabaseAndInsertIntoExcel() {
        try {
            Statement statement = connection.createStatement();
            String sql = "Select * FROM movie_details";
            ResultSet resultSet = statement.executeQuery(sql);

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Reviews");
            writeHeaderLine(sheet);
            writeDataLines(resultSet, workbook, sheet);
            FileOutputStream outputStream = new FileOutputStream(excelFilePathR);
            workbook.write(outputStream);
            workbook.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    private void writeDataLines(ResultSet resultSet, XSSFWorkbook workbook, XSSFSheet sheet) throws SQLException{
        int rowCount = 1;

        while (resultSet.next()){
            String movieName = resultSet.getString("Movie_Name");

            String directorName = resultSet.getString("Director_Name");

            Row row = sheet.createRow(rowCount++);

            int columnCount = 0;
            Cell cell = row.createCell(columnCount++);
            cell.setCellValue(movieName);

            cell = row.createCell(columnCount);
            cell.setCellValue(directorName);


        }
    }

    private void writeHeaderLine(XSSFSheet sheet) {
        Row headerRow = sheet.createRow(0);
        Cell headerCell = headerRow.createCell(0);

        headerCell.setCellValue("Move_Name");

        headerCell = headerRow.createCell(1);
        headerCell.setCellValue("Director_Name");

        System.out.println("Your data retrieve successfully.!");
    }
}
