package com.mysticarts.songs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Songs {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/Song";
        String root = "root";
        String password = "Xworkzodc@123Indru";
        try{
            Connection connection = DriverManager.getConnection(url,root,password);
            System.out.println("Connected successfully");
            Statement statement = connection.createStatement();
            String qurey = "update playlist set singer = '' where name = 'Shang  Chi'";
            int result =  statement.executeUpdate(qurey);
            System.out.println(result);
            System.out.println("data updated successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
