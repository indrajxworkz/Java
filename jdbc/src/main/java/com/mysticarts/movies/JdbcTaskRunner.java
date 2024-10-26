package com.mysticarts.movies;



public class JdbcTaskRunner {
    public static void main(String[] args) {
        MoviesInfo moviesInfo = new MoviesDaoIImpl();
        moviesInfo.readDataFromExcelAndInsertIntoDatabase();
        moviesInfo.readDataFromDatabaseAndInsertIntoExcel();
    }
}
