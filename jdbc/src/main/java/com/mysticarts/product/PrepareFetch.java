package com.mysticarts.product;

import java.sql.*;

public class PrepareFetch {
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
            Connection connection = DriverManager.getConnection(url,userName,password);
            String query = "select * from PRODUCT where product_id= ? and product_name = ?";
            connection.prepareStatement(query);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(2,"Coffee Maker");
            preparedStatement.setInt(1,3);

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);

            if (resultSet.next()){
                System.out.println(resultSet.getString("product_name"));
                System.out.println(resultSet.getInt("product_id"));
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));

            }
            System.out.println("Match Found from Database        ;) !!!!!!!!!!!!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
