package com.xworkz.localfile;
import java.io.FileWriter;
import java.io.IOException;


    public class SaveTextFile {
        public static void main(String[] args) {
            String filepath = "D:\\Downloads/example.txt";
            String content = "Hi this the file which is being saved by a writing code .\n ";
            String content1 = " This contains the details of employees of an organization.\n ";

            try {
                FileWriter writer = new FileWriter(filepath);
                writer.write(content);

                writer.write(content1);
                writer.write("Hey guys");
                writer.close();  // Always close the writer to save the file
                System.out.println("File saved successfully!");
            } catch (IOException e) {
                System.out.println("An error occurred while saving the file.");
                e.printStackTrace();
            }
        }
    }


