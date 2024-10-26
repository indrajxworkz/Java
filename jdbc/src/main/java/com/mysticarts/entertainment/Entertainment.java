package com.mysticarts.entertainment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Entertainment {
    public static void main(String[] args)  {
        try {
            //load and register
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("loaded and registered successfully ");

         }catch (ClassNotFoundException e){
            throw  new RuntimeException(e);
        }
        try {
           Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/entertainment" ,"root","Xworkzodc@123Indru");
            System.out.println("connected");
            Statement statement = connection.createStatement();
            String query = "Insert into movie values(1,'Devara','Srinivas','Teleugu')";
          boolean result =  statement.execute(query);
            System.out.println(result);
            String query1 = "Insert into movie values(2,'Captain America', 'Marvels','English')";
            statement.execute(query1);
            String query2 = "Insert into movie values(3,'DeadPoolVSVolverine', 'Marvels','English')";
            statement.execute(query2);
            String query3 = "Insert into movie values(4,'Moon Kinght', 'Marvels','English')";
            statement.execute(query3);
            String query4 = "Insert into movie values(5,'SpiderMan', 'Marvels','English')";
            statement.execute(query4);
            String query5 = "Insert into movie values(6,'Iron Man', 'Marvels','English')";
            statement.execute(query5);
            String query6 = "Insert into movie values(7,'Hawk Eye', 'Marvels','English')";
            statement.execute(query6);
            String query7 = "Insert into movie values(8,'Wanda', 'Marvels','English')";
            statement.execute(query7);
            String query8 = "Insert into movie values(9,'Hulk', 'Marvels','English')";
            statement.execute(query8);
            String query9 = "Insert into movie values(10,'Thor', 'Marvels','English')";
            statement.execute(query9);
            String query10 = "Insert into movie values(11,'Dr Strange', 'Marvels','English')";
            statement.execute(query10);
            String query11 = "Insert into movie values(12,'Shang  Chi', 'Marvels','English')";
            statement.execute(query11);
            String query12 = "Insert into movie values(13,'Black Panther', 'Marvels','English')";
            statement.execute(query12);
            String query13 = "Insert into movie values(14,'Dr Doom','Marvel','English')";
            statement.execute(query13);

            System.out.println("data inserted successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
