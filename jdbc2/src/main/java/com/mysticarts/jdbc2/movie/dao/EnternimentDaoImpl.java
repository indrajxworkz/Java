package com.mysticarts.jdbc2.movie.dao;

import com.mysticarts.jdbc2.movie.dto.MovieDto;
import com.mysticarts.jdbc2.exception.MovieNotFoundException;

import java.sql.*;

    public class EnternimentDaoImpl implements EnternimentDao {

        MovieDto movieDto;

        @Override
        public void insertMovie(MovieDto movieDto) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("loaded and register successfully");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String url = "jdbc:mysql://localhost:3306/enterniment";
            String userName = "root";
            String password = "Xworkzodc@123Indru";

            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                connection = DriverManager.getConnection(url, userName, password);
                System.out.println("connection is establish successfully");

                String query = "INSERT INTO movie(id,name,director,language) values(?,?,?,?)  ";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, movieDto.getId());
                preparedStatement.setString(2, movieDto.getName());
                preparedStatement.setString(3, movieDto.getDirector());
                preparedStatement.setString(4, movieDto.getLanguage());

                preparedStatement.execute();
                System.out.println("insert the  data  successfully");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("closing ");
                try {
                    if(connection != null){
                        System.out.println("establish connection");
                        connection.close();
                    }

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }

        }

        @Override
        public boolean updateMovieNameById(String name, int id) throws MovieNotFoundException {


            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("loaded and register successfully");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String url = "jdbc:mysql://localhost:3306/enterniment";
            String userName = "root";
            String password = "Xworkzodc@123Indru";

            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                connection = DriverManager.getConnection(url, userName, password);
                System.out.println("connection is established successfully");

                String query = "UPDATE movie set name = ?  where id = ? ";

                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();

                System.out.println("update the database using prepared statement successfully");


            } catch (SQLException e) {
                throw new RuntimeException(e);

            } finally {
                System.out.println("closing ");
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                return false;
            }

        }

        @Override
        public boolean deleteId(int id) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("loaded and register successfully");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String url = "jdbc:mysql://localhost:3306/enterniment";
            String userName = "root";
            String password = "Xworkzodc@123Indru";

            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                connection = DriverManager.getConnection(url, userName, password);
                System.out.println("connection is established successfully");

                String query = " DELETE FROM movie WHERE id = ?  ";

                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();

                System.out.println("delete the database using prepared statement successfully");


            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("closing ");
                try {
                    connection.close();

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

                return false;
            }

        }

        @Override
        public boolean read(String name, int id) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("loaded and register successfully");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String url = "jdbc:mysql://localhost:3306/enterniment";
            String userName = "root";
            String password = "Xworkzodc@123Indru";

            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try {
                connection = DriverManager.getConnection(url, userName, password);
                System.out.println("connection is established successfully");

                String query = "select * from movie WHERE name = ? AND id = ?";

                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, id);

                resultSet = preparedStatement.executeQuery();


                while (resultSet.next()) {

                    System.out.println("<-----movie details ------>");

                    int readId = resultSet.getInt("id");
                    System.out.println(readId);

                    String readName = resultSet.getString("name");
                    System.out.println(readName);

                    String readDirector = resultSet.getString("director");
                    System.out.println(readDirector);

                    String readLanguage = resultSet.getString("language");
                    System.out.println(readLanguage);

                    System.out.println("<------end--------->");

                }

                System.out.println("fetched the data successfully");


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            return false;
        }

        /**
         * @return Method for getting number of movies;
         */
        @Override
        public int getNoOfMovies() {
            int count = 0;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("loaded and register successfully");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String url = "jdbc:mysql://localhost:3306/enterniment";
            String userName = "root";
            String password = "Xworkzodc@123Indru";

            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                connection = DriverManager.getConnection(url, userName, password);
                System.out.println("connection is established successfully");

                String query = "SELECT COUNT(*) AS count FROM movie ";

                preparedStatement = connection.prepareStatement(query);

                ResultSet resultSet =  preparedStatement.executeQuery();

                if (resultSet.next()) {
                    System.out.println(" <----- get the no of movies----> ");
                    count = resultSet.getInt("count");
                }

                System.out.println("The No of movies are : " + count);


            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("closing ");
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }


                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

                return  0;
            }

        }

        /**
         * @return  Ase
         */
        @Override
        public boolean orderBy() {

            //loaded and register
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("loaded and register successfully");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            // establish the connection
            String url = "jdbc:mysql://localhost:3306/enterniment";
            String userName = "root";
            String password = "Xworkzodc@123Indru";

            Connection connection = null;
            ResultSet resultSet = null;
            Statement statement = null;
            try {
                connection = DriverManager.getConnection(url, userName, password);
                System.out.println("connection is established successfully");

               statement = connection.createStatement();

                String query = " SELECT * FROM movie ORDER BY id DESC ";

                String query1 = "SELECT * FROM movie ORDER BY id ASC";

                ResultSet result = statement.executeQuery(query);
                System.out.println(result);


                while (result.next()) {

                    System.out.println("-----movie info in descending order ----- ");

                    int id = result.getInt("id");
                    System.out.println(id);

                    String stateName = result.getString("name");
                    System.out.println(stateName);

                    String director = result.getString("director");
                    System.out.println(director);

                    String language = result.getString("language");
                    System.out.println(language);


                    System.out.println("----fetched the data in descending order successfully----");

                }

                ResultSet result1 = statement.executeQuery(query1);
                System.out.println(result1);

                while (result1.next()) {

                    System.out.println("-----movie info in ascending order ----- ");

                    int id = result1.getInt("id");
                    System.out.println(id);

                    String stateName = result1.getString("name");
                    System.out.println(stateName);

                    String director = result1.getString("director");
                    System.out.println(director);

                    String language = result1.getString("language");
                    System.out.println(language);

                    System.out.println("----fetched the data in ascending order successfully----");

                }

                System.out.println("fetched the database   successfully");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            finally {
                System.out.println("Closing");
                try{
                    connection.close();
                }catch (SQLException e){
                    throw  new RuntimeException(e);
                }
                try{
                    statement.close();

                }catch (SQLException e ){
                    throw  new RuntimeException(e);
                }

            }
            return false;
        }

    }

