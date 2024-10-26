package com.mysticarts.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDeleteOp {
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
        //?-placeholder
        String query = "DELETE FROM  PRODUCT  where product_id = '20' ";
        String query1 = "DELETE FROM PRODUCT  where product_name  = 'Laptop'";
        String query3 = "DELETE FROM PRODUCT WHERE category IN ('Electronics', 'Furniture', 'Stationery', 'Clothing', 'Footwear', 'Statinary')";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("The connection is accessed ");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            PreparedStatement preparedStatement1  = connection.prepareStatement(query1);
            PreparedStatement preparedStatement2 = connection.prepareStatement(query3);
            preparedStatement1.executeUpdate();
            preparedStatement.executeUpdate();
            preparedStatement2.executeUpdate();
            //
           // PreparedStatement preparedStatement2 = connection.prepareStatement(query3);
            preparedStatement.executeUpdate();
            System.out.println("Data Erased hehehehe          ;)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
