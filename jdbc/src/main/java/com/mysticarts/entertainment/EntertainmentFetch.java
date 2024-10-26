package com.mysticarts.entertainment;

import java.sql.*;

public class EntertainmentFetch {
    public static void main(String[] args) {
      // EntertainmentFetch movie[]  = new EntertainmentFetch[];
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection Established..............!!!!!!!!!!!!!!!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // establish a connection to database
        try {
        Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/entertainment","root","Xworkzodc@123Indru");
            System.out.println("Access Granted to the DataBase..............!!!!!!!!!!!!!!!!!!!!!!");
            Statement statement = connection.createStatement();
            String query = "select * from movie";
            ResultSet result  = statement.executeQuery(query);
            System.out.println(result);

            while (result.next()) {
                System.out.println("Fetching the Details From the Database !!!!!!!!!!!!!!!!!!!!!!!!.............................");

                int id  = result.getInt("id");
                System.out.println(id);
                String name  =  result.getString("name");
                System.out.println(name );
                String director = result.getString("director");
                System.out.println(director);
                String language  = result.getString("language");
                System.out.println(language);



            }




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
