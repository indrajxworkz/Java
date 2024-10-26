package com.mysticarts.product;

import com.mysticarts.product.exception.ProductIdNotFOundException;

import java.sql.*;

public class Product {

        public static void main(String[] args) {

            //loaded and register
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("loaded and register successfully");

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            //Establish a connection to database
            String url = "jdbc:mysql://localhost:3306/PRODUCT";
            String userName = "root";
            String password = "Xworkzodc@123Indru";
            try {
                Connection connection =  DriverManager.getConnection(url, userName, password);
                System.out.println("connection is established to database successfully");

                //Create a statement or platform
                Statement statement = connection.createStatement();
                String sql = "SELECT * FROM PRODUCT WHERE product_id = 1f";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                int id = 0;
                if (resultSet.next()){
                    id = resultSet.getInt("product_id");
                    System.out.println("Id is : " + id);
                    System.out.println("Product Name : " + resultSet.getString("product_name"));
                }else {
                    ProductIdNotFOundException productIdNotFOundException = new ProductIdNotFOundException("Id is not found");
                    throw  productIdNotFOundException;
                }
                if (id ==0 ){
                    ProductIdNotFOundException productIdNotFOundException = new ProductIdNotFOundException("Id is not found");
                    throw  productIdNotFOundException;
                }

                // insert the india

                String query1 = "INSERT INTO PRODUCT VALUES(1, 'Laptop', 'Electronics')";
                //excute the sql queries
                //statement.execute(query1);
                String query2 = "INSERT INTO PRODUCT VALUES(2, 'Smartphone', 'Electronics')";
              //  statement.execute(query2);
                String query3 = "INSERT INTO PRODUCT VALUES(3, 'Coffee Maker', 'Appliances')";
               // statement.execute(query3);
                String query4 = "INSERT INTO PRODUCT VALUES(4, 'Headphones', 'Electronics')";
               // statement.execute(query4);
                String query5 = "INSERT INTO PRODUCT VALUES(5, 'Blender', 'Appliances')";
                //statement.execute(query5);
                String query6 = "INSERT INTO PRODUCT VALUES(6, 'Watch', 'Accessories')";
                //statement.execute(query6);
                String query7 = "INSERT INTO PRODUCT VALUES(7, 'Keyboard', 'Electronics')";
                //statement.execute(query7);
                String query8 = "INSERT INTO PRODUCT VALUES(8, 'Mouse', 'Electronics')";
                //statement.execute(query8);
                String query9 = "INSERT INTO PRODUCT VALUES(9, 'Desk Chair', 'Furniture')";
               // statement.execute(query9);
                String query10 = "INSERT INTO PRODUCT VALUES(10, 'Table Lamp', 'Furniture')";
                //statement.execute(query10);

                System.out.println("inserted data successfully");

                //Update the databse
                String query = "update PRODUCT set product_name = 'Speaker' where product_name = 'Keyboard' ";
                String query11 = "update PRODUCT set product_name = 'clock' where product_id = 6 ";

                // single query multiple input........................................................


                int result = statement.executeUpdate(query);
                System.out.println(result);

                boolean result1  = statement.execute(query11);
                System.out.println(result1);

                System.out.println("update the database successfully ");

                //DELETE THE DATABASE

                String query12 = "delete from PRODUCT where product_name ='Mouse' ";
                int result3 = statement.executeUpdate(query12);
                System.out.println(result3);

                String query13 = "delete from PRODUCT where product_id = 9";
                int result4 = statement.executeUpdate(query13);
                System.out.println(result4);

                System.out.println("deleted the data successfully");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }
    }

