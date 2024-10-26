package com.xworkz.newsapp.dao;

import com.xworkz.newsapp.dto.NewsPaperDto;
import com.xworkz.newsapp.exception.DateNotFoundException;
import com.xworkz.newsapp.exception.IdNotFoundException;
import com.xworkz.newsapp.exception.LanguageNotFoundException;

import javax.naming.NameNotFoundException;
import java.sql.*;

public class NewsPaperDaoImpl implements NewsPaperDao{
    NewsPaperDto newsPaperDto = new NewsPaperDto();

    @Override
    public boolean saveNewsPaper(NewsPaperDto newsPaperDto) {
        System.out.println("saveNewsPaper started");
        boolean isAdded = false;

        // Step 1: Load and register the driver (optional)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Loaded and Registered Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Step 2: Establish connection to the database
        String url = "jdbc:mysql://localhost:3306/newspaper";
        String userName = "root";
        String password = "Xworkzodc@123Indru";
        String query = "INSERT INTO newspaper_details(newspaper_id, newspaper_name, editor_name, newspaper_price, num_of_pages, num_of_articles, date, newspaper_language) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            System.out.println("Connection to the database is established");

            // Step 3: Set parameters
            preparedStatement.setInt(1, newsPaperDto.getId());
            preparedStatement.setString(2, newsPaperDto.getName());
            preparedStatement.setInt(3, newsPaperDto.getNoOfPages());
            preparedStatement.setString(4, newsPaperDto.getLang());
            preparedStatement.setDouble(5, newsPaperDto.getPrice());
            preparedStatement.setString(6, newsPaperDto.getEditorName());
            preparedStatement.setString(7, newsPaperDto.getDate());
            preparedStatement.setInt(8, newsPaperDto.getNoOfArticles());

            // Step 4: Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                isAdded = true;
                System.out.println("Newspaper added successfully");
            } else {
                System.out.println("Failed to add newspaper");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("saveNewsPaper ended");
        return isAdded;
    }

    @Override

    public NewsPaperDto[] getAllNewsPaper() {
        System.out.println("getAllNewsPaper started");

        NewsPaperDto[] newsPaperDto = null;
        int index = 0;
        Connection connection = null;
        Statement statement = null;
        ResultSet result =null;
        try {
            // Step 2: Establish connection with the database
            connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/newspaper", "root", "Xworkzodc@123Indru");

            // Step 3: Create a statement
            statement = connection.createStatement();

            String query = "select * from Newspaperlist";
            result = statement.executeQuery(query);
            int count = 0;
            while (result.next()){
                count++;
            }
            System.out.println(count);
            newsPaperDto =new NewsPaperDto[count];
            String query1 = "select * from Newspaperlist";
            result = statement.executeQuery(query1);
               while (result.next()) {
                   NewsPaperDto newsPaperDto1 =new NewsPaperDto();
                   newsPaperDto1.setId(result.getInt("id"));
                   newsPaperDto1.setName(result.getString(2));
                   newsPaperDto1.setNoOfPages(result.getInt(3));
                   newsPaperDto1.setLang(result.getString(4));
                   newsPaperDto1.setPrice(result.getDouble(5));
                   newsPaperDto1.setEditorName( result.getString(6));
                   newsPaperDto1.setDate(result.getString(7));
                   newsPaperDto1.setNoOfArticles( result.getInt(8));
                   newsPaperDto[index++] = newsPaperDto1;
               }
        }
        catch (SQLException e)
        {
            e.printStackTrace();

        }try {
            if (result != null) result.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("getAllNewsPaper ended");
        return newsPaperDto;
    }

    @Override
    public boolean getNewsPaperByDate(String newspaperdate) {
        System.out.println("getNewsPaperByDate started");
        boolean isNewsPaperRetrieved = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "SELECT * FROM Newspaperlist WHERE newspaperdate = ?";
        try {
            connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");;
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1,newspaperdate);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                NewsPaperDto dto = new NewsPaperDto();
                dto.setId(resultSet.getInt("id"));
                dto.setName(resultSet.getString("name"));
                dto.setNoOfPages(resultSet.getInt("noOfPages"));
                dto.setLang(resultSet.getString("lang"));
                dto.setPrice(resultSet.getDouble("price"));
                dto.setEditorName(resultSet.getString("editor"));
                dto.setDate(resultSet.getString("newspaperdate"));
                dto.setNoOfArticles(resultSet.getInt("noOfArticles"));
                System.out.println(dto);
            }
            if(newspaperdate==null){
                throw new DateNotFoundException("please provide valid date");
            }
        }
        catch (SQLException | DateNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("getNewsPaperByDate ended");
        return isNewsPaperRetrieved;
    }

    @Override
    public boolean getNewsPaperByLang(String lang) {
        System.out.println("getNewsPaperByLang started");
        boolean isNewsPaperRetrieved = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "SELECT * FROM Newspaperlist WHERE lang = ?";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");
            ;
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, lang);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                NewsPaperDto dto = new NewsPaperDto();
                dto.setId(resultSet.getInt("id"));
                dto.setName(resultSet.getString("name"));
                dto.setNoOfPages(resultSet.getInt("noOfPages"));
                dto.setLang(resultSet.getString("lang"));
                dto.setPrice(resultSet.getDouble("price"));
                dto.setEditorName(resultSet.getString("editor"));
                dto.setDate(resultSet.getString("newspaperdate"));
                dto.setNoOfArticles(resultSet.getInt("noOfArticles"));
                System.out.println(dto);
            }
            if(lang==null)
            {
                throw new LanguageNotFoundException("please provide valid Language");
            }
        }
        catch (SQLException | LanguageNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("getNewsPaperByLang ended");
        return isNewsPaperRetrieved;

    }

    @Override
    public boolean getNewsPaperById(Integer id) {
        System.out.println("getNewsPaperById started");
        boolean isNewsPaperRetrieved = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "SELECT * FROM Newspaperlist WHERE id = ?";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");
            ;
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                NewsPaperDto dto = new NewsPaperDto();
                dto.setId(resultSet.getInt("id"));
                dto.setName(resultSet.getString("name"));
                dto.setNoOfPages(resultSet.getInt("noOfPages"));
                dto.setLang(resultSet.getString("lang"));
                dto.setPrice(resultSet.getDouble("price"));
                dto.setEditorName(resultSet.getString("editor"));
                dto.setDate(resultSet.getString("newspaperdate"));
                dto.setNoOfArticles(resultSet.getInt("noOfArticles"));
                System.out.println(dto);
            }
            if(id<=0)
            {
                throw new IdNotFoundException("please provide valid id");
            }
        }
        catch (SQLException | IdNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("getNewsPaperById ended");
        return isNewsPaperRetrieved;
    }

    @Override
    public Integer getNumberOfPagesByLang(String lang) {
        System.out.println("getNumberOfPagesByLang started");
        Integer pages = 0 ;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "SELECT noofpages FROM Newspaperlist WHERE lang = ?";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, lang);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                NewsPaperDto dto = new NewsPaperDto();
                pages = resultSet.getInt("noOfPages");
                System.out.println(pages);
            }
            if(lang==null)
            {
                throw new LanguageNotFoundException("please provide valid Language");
            }
        }
        catch (SQLException |LanguageNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("getNumberOfPagesByLang ended");
        return pages;

    }

    @Override
    public String getDateById(Integer id) {
        System.out.println("getNumberOfPagesByLang started");
        String date = null ;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "SELECT newspaperdate FROM Newspaperlist WHERE id = ?";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                NewsPaperDto dto = new NewsPaperDto();
                date = resultSet.getString("newspaperdate");
                System.out.println(date);
            }
            if(id<=0)
            {
                throw new IdNotFoundException("please provide valid id");
            }
        }
        catch (SQLException | IdNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("getNumberOfPagesByLang ended");
        return date;
    }

    @Override
    public boolean updateNoOfArticlesByDate(Integer noOfArticles, String newspaperdate) {
        System.out.println("UpdateNoOfArticlesByDate started");
        boolean isUpdated = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "UPDATE Newspaperlist SET noofarticles = ? WHERE newspaperdate = ?";
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");;
                preparedStatement = connection.prepareStatement(query);

                preparedStatement.setInt(1, noOfArticles);
                preparedStatement.setString(2, newspaperdate);
                preparedStatement.executeUpdate();
                isUpdated = true;

                if(newspaperdate==null)
                {
                    throw new DateNotFoundException("please provide valid Date");
                }
            }

            catch (SQLException | DateNotFoundException e) {
                e.printStackTrace();
            }
        System.out.println("UpdateNoOfArticlesByDate ended");
        return isUpdated;
    }

    @Override
    public void deleteNewsPaperById(Integer id) {
        System.out.println("deleteNewsPaperById started");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "DELETE FROM Newspaperlist WHERE id = ?";
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            if(id<=0)
            {
                throw new IdNotFoundException("please provide valid id");
            }
        }
        catch (SQLException |IdNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("deleteNewsPaperById ended");
    }

    @Override
    public String getPaperNameById(Integer id) {
        System.out.println("getPaperNameById Started");
        String pName=null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
            String query = "SELECT name FROM Newspaperlist WHERE id = ?";
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");
                  preparedStatement = connection.prepareStatement(query);

                preparedStatement.setInt(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next())
                {
                    pName = resultSet.getString("name");
                    System.out.println(pName);
                }
                if(id<=0)
                {
                    throw new IdNotFoundException("please provide valid id");
                }
            }
            catch (SQLException | IdNotFoundException e)
            {
                e.printStackTrace();
            }
        System.out.println("getPaperNameById ended");
        return pName;
    }

    @Override
    public String getPaperNameByLang(String lang) {
        System.out.println("getPaperNameByLang Started");
        String pName=null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "SELECT name FROM Newspaperlist WHERE lang = ?";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, lang);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                pName = resultSet.getString("name");
                System.out.println(pName);
            }
            if(lang==null)
            {
                throw new LanguageNotFoundException("please provide valid Language");
            }
        }
        catch (SQLException | LanguageNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("getPaperNameByLang ended");
        return pName;
    }

    @Override
    public String getEditorNameByPaperName(String name) {
        System.out.println("getEditorNameByPaperName Started");
        String eName=null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String query = "SELECT editorName FROM Newspaperlist WHERE name = ?";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsPaper", "root", "Bharath@7579.");
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                eName =  resultSet.getString("editor");
                System.out.println(eName);
            }
            if(name==null)
            {
                throw new NameNotFoundException("please provide valid Language");
            }
        } catch (SQLException | NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}