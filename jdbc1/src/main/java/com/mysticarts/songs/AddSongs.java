package com.mysticarts.songs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddSongs {
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("loaded successfully......................");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/song2" ,"root","Xworkzodc@123Indru");
            System.out.println("Connected");
            Statement statement = connection.createStatement();
            String qurey = "Insert into playlist2 values (1,'Chuttamele','Anirudh','Telugu')";
            boolean result = statement.execute(qurey);
            System.out.println(result);
            String query1 ="Insert into playlist2 values(2,'Millionaire','Honey Singh','Hindi')";
            statement.execute(query1);
            String query2 ="Insert into playlist2 values (3,'Nangansiddu 2','Rahul Ditto','Kannada')";
            statement.execute(query2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
