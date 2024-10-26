package com.mysticarts.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductPreparedInsert {

    public static void main(String[] args) {

        //Multiple insert wit a single query
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
        String query = "INSERT INTO PRODUCT(product_id,product_name,category) values(?,?,?)";

        try {
            Connection connection =  DriverManager.getConnection(url, userName, password);
            System.out.println("connection is established the succesfuuly");
            PreparedStatement preparedStatement =  connection.prepareStatement(query);

            preparedStatement.setInt(1,10);
            preparedStatement.setString(2,"Laptop");
            preparedStatement.setString(3,"Electronics");
            preparedStatement.execute();

            preparedStatement.setInt(1,11);
            preparedStatement.setString(2,"Smartphone");
            preparedStatement.setString(3,"Electronics");
            preparedStatement.execute();

            preparedStatement.setInt(1,12);
            preparedStatement.setString(2,"Table");
            preparedStatement.setString(3,"Furniture");
            preparedStatement.execute();

            preparedStatement.setInt(1,13);
            preparedStatement.setString(2,"Book");
            preparedStatement.setString(3,"Stationery");
            preparedStatement.execute();

            preparedStatement.setInt(1,14);
            preparedStatement.setString(2,"Chair");
            preparedStatement.setString(3,"Furniture");
            preparedStatement.execute();

            preparedStatement.setInt(1,15);
            preparedStatement.setString(2,"Notebook");
            preparedStatement.setString(3,"Stationery");
            preparedStatement.execute();

            preparedStatement.setInt(1,16);
            preparedStatement.setString(2,"Pen");
            preparedStatement.setString(3,"Stationery");
            preparedStatement.execute();

            preparedStatement.setInt(1,17);
            preparedStatement.setString(2,"Refrigerator");
            preparedStatement.setString(3,"Appliances");
            preparedStatement.execute();

            preparedStatement.setInt(1,18);
            preparedStatement.setString(2,"Washing Machine");
            preparedStatement.setString(3,"Appliances");
            preparedStatement.execute();

            preparedStatement.setInt(1,19);
            preparedStatement.setString(2,"T-shirt");
            preparedStatement.setString(3,"Clothing");
            preparedStatement.execute();

            preparedStatement.setInt(1,20);
            preparedStatement.setString(2,"Jeans");
            preparedStatement.setString(3,"Clothing");
            preparedStatement.execute();

            preparedStatement.setInt(1,21);
            preparedStatement.setString(2,"Shoes");
            preparedStatement.setString(3,"Footwear");
            preparedStatement.execute();


            preparedStatement.setInt(1,22);
            preparedStatement.setString(2,"Television");
            preparedStatement.setString(3,"Electronics");
            preparedStatement.execute();

            preparedStatement.setInt(1,23);
            preparedStatement.setString(2,"Air Conditioner");
            preparedStatement.setString(3,"Appliances");
            preparedStatement.execute();

            preparedStatement.setInt(1,24);
            preparedStatement.setString(2,"eraser");
            preparedStatement.setString(3,"statinary");
            preparedStatement.execute();


            System.out.println("inserted the data successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}