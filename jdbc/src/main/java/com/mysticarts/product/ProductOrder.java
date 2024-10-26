package com.mysticarts.product;

import java.sql.*;

    public class ProductOrder {

        public static void main(String[] args) {

            //loaded and register
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("loaded and register successfully");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            // establish the connection
            String url = "jdbc:mysql://localhost:3306/PRODUCT";
            String userName = "root";
            String password = "Xworkzodc@123Indru";

            try {
                Connection connection = DriverManager.getConnection(url, userName, password);
                System.out.println("connection is established successfully");

                //create a statement

                Statement statement = connection.createStatement();

                //excute  the  query

                String query = "SELECT * FROM PRODUCT ORDER BY product_id DESC ";

                String query1 = "SELECT * FROM PRODUCT ORDER BY product_id ASC";

                ResultSet result = statement.executeQuery(query);
                System.out.println(result);

                while (result.next()) {

                    System.out.println("-----PRODUCT details in descending order ----- ");

                    int id = result.getInt("product_id");
                    System.out.println(id);

                    String product_name = result.getString("product_name");
                    System.out.println(product_name);

                    String category = result.getString("category");
                    System.out.println(category);

                    System.out.println("----fetched the data in descending order successfully----");

                }

                ResultSet result1 = statement.executeQuery(query1);
                System.out.println(result1);

                while (result1.next()) {

                    System.out.println("-----product details in ascending order ----- ");
                    int id = result1.getInt("product_id");
                    System.out.println(id);

                    String product_name = result1.getString("product_name");
                    System.out.println(product_name);

                    String category = result1.getString("category");
                    System.out.println(category);

                    System.out.println("----fetched the data in ascending order successfully----");

                }

                System.out.println("fetched the database   successfully");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

