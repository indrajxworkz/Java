package com.mysticarts.entertainment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EntertainmentDeleteOp {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Loaded and registered");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/entertainment";
        String root = "root";
        String password = "Xworkzodc@123Indru";
        try{
            Connection connection = DriverManager.getConnection(url,root,password);
            System.out.println("Connected successfully");
            Statement statement = connection.createStatement();
            String qurey1 = "delete from  movie where director = 'Russ Brother '  ";
            int result =  statement.executeUpdate(qurey1);
            System.out.println(result);
            System.out.println("data deleted successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

