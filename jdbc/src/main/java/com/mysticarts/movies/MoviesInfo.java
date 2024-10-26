package com.mysticarts.movies;

public interface MoviesInfo {
    public void readDataFromExcelAndInsertIntoDatabase();
    public void readDataFromDatabaseAndInsertIntoExcel();

    /*
    *  long start = System.currentTimeMillis();
        try (FileInputStream inputStream = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(inputStream);
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO movie_details(Movie_Name, Director_Name) VALUES (?, ?)")) {

            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = firstSheet.iterator();

            // Skip header
            if (rowIterator.hasNext()) {
                rowIterator.next();
            }

            int batchSize = 10;
            int count = 0;

            while (rowIterator.hasNext()) {
                Row nextRow = rowIterator.next();
                String moveName = null;
                String directorName = null;


                if (nextRow.getCell(0) != null && nextRow.getCell(0).getCellType() == CellType.STRING) {
                    moveName = nextRow.getCell(0).getStringCellValue();
                }
                if (nextRow.getCell(1) != null && nextRow.getCell(1).getCellType() == CellType.STRING) {
                    directorName = nextRow.getCell(1).getStringCellValue();
                    System.out.println(directorName);
                }else
                    System.out.println("Your condition is not satisfying..");




                if (moveName != null && directorName != null) {
                    preparedStatement.setString(1, moveName);
                    preparedStatement.setString(2, directorName);
                    preparedStatement.addBatch();
                    System.out.println("process is going on..!");

                    if (++count % batchSize == 0) {
                        preparedStatement.executeBatch();
                    }
                    System.out.println("Data for movie '" + moveName + "' inserted successfully.");
                }



            }
            preparedStatement.executeBatch(); // Execute the last batch
            connection.commit();

            long end = System.currentTimeMillis();
            System.out.printf("Import done in %d ms \n", (end - start));

        } catch (IOException e) {
            System.err.println("Error reading the Excel file: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                System.err.println("Rollback failed: " + ex.getMessage());
            }
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Connection closing failed: " + e.getMessage());
            }
        }
    * */
}
