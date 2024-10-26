package com.mysticarts.product;

import java.sql.*;

    public class ProductFetch {

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

                /*select the where from column */

                String query = "select * from PRODUCT where product_name = 'Coffee Maker'";
                ResultSet result = statement.executeQuery(query);
                System.out.println(result);

                if(result.next()){

                    System.out.println("-----product details ----- ");

                    int id = result.getInt("product_id");
                    System.out.println(id);

                    String product_name = result.getString("product_name");
                    System.out.println(product_name);

                    String category = result.getString("category");
                    System.out.println(category);


                    System.out.println("--------");
                }else {
                    System.out.println("data is not found");
                }

                System.out.println("fetched the database successfully");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

