package com.mysticarts.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductPreparedDelete {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("loaded and register successfully");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/PRODUCT";
        String userName = "root";
        String password = "Xworkzodc@123Indru";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("connection is established successfully");

            //delete the prepared statement
            String query = "DELETE FROM PRODUCT WHERE category IN ('Electronics', 'Furniture', 'Stationery', 'Clothing', 'Footwear', 'Statinary')";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();



            System.out.println("deleted the database using prepared statement ");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}