package com.mysticarts.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductUpdateOpUsingPreparedStatement {
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
        String query = "UPDATE  PRODUCT set product_name = ?,  category = ? where product_id = ? ";
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("The connection is accessed ");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"i-Pad");

            preparedStatement.setString(2,"Tablet");
            preparedStatement.setInt(3,19);
            preparedStatement.executeUpdate();

           // String query = "UPDATE PRODUCT set product_name = ? , category = ? where product_id = ? ";

          /*  PreparedStatement preparedStatement = connection.prepareStatement(query);*/

            preparedStatement.setString(1, "Laptop");
            preparedStatement.setString(2, "Electronics");
            preparedStatement.setInt(3, 1);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Smartphone");
            preparedStatement.setString(2, "Electronics");
            preparedStatement.setInt(3, 2);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Coffee Maker");
            preparedStatement.setString(2, "Appliances");
            preparedStatement.setInt(3, 3);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Headphones");
            preparedStatement.setString(2, "Electronics");
            preparedStatement.setInt(3, 4);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Blender");
            preparedStatement.setString(2, "Appliances");
            preparedStatement.setInt(3, 5);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Clock");
            preparedStatement.setString(2, "Accessories");
            preparedStatement.setInt(3, 6);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Speaker");
            preparedStatement.setString(2, "Electronics");
            preparedStatement.setInt(3, 7);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Table Lamp");
            preparedStatement.setString(2, "Furniture");
            preparedStatement.setInt(3, 10);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Table");
            preparedStatement.setString(2, "Furniture");
            preparedStatement.setInt(3, 12);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Book");
            preparedStatement.setString(2, "Stationery");
            preparedStatement.setInt(3, 13);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Chair");
            preparedStatement.setString(2, "Furniture");
            preparedStatement.setInt(3, 14);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Notebook");
            preparedStatement.setString(2, "Stationery");
            preparedStatement.setInt(3, 15);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Pen");
            preparedStatement.setString(2, "Stationery");
            preparedStatement.setInt(3, 16);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Refrigerator");
            preparedStatement.setString(2, "Appliances");
            preparedStatement.setInt(3, 17);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "Washing Machine");
            preparedStatement.setString(2, "Appliances");
            preparedStatement.setInt(3, 18);
            preparedStatement.executeUpdate();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
