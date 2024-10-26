package com.mysticarts.jdbc2.movie.dto;


import com.mysticarts.jdbc2.movie.dao.EnternimentDao;
import com.mysticarts.jdbc2.movie.dao.EnternimentDaoImpl;

public class MovieRunner {

        public static void main(String[] args) {

            MovieDto movieDto = new MovieDto();
            movieDto.setId(14);
            movieDto.setName("saalar 2");
            movieDto.setDirector("antony");
            movieDto.setLanguage("telugu");

            EnternimentDao enternimentDao = new EnternimentDaoImpl();
            enternimentDao.insertMovie(movieDto);

            //update the database
            MovieDto movieDto1 = new MovieDto();
            movieDto1.setName("mathuvadulara");
            movieDto1.setId(5);

            EnternimentDao enternimentDao1 = new EnternimentDaoImpl();
            enternimentDao1.updateMovieNameById(movieDto1.getName(), movieDto1.getId());

            //delete the database

            MovieDto movieDto2 = new MovieDto();
            movieDto2.setId(6);

            EnternimentDao enternimentDao2 = new EnternimentDaoImpl();
            enternimentDao2.deleteId(movieDto2.getId());


            //read the database

            MovieDto movieDto3 = new MovieDto();
            movieDto3.setName("Hawk Eye");
            movieDto3.setId(7);

            EnternimentDao enternimentDao3 = new EnternimentDaoImpl();
            enternimentDao3.read(movieDto3.getName(), movieDto3.getId());


            //get no of movies
            MovieDto movieDto4 = new MovieDto();

            EnternimentDao enternimentDao4 = new EnternimentDaoImpl();
            int getMovies = enternimentDao4.getNoOfMovies();
            System.out.println(getMovies);

            //order by


            EnternimentDao enternimentDao5 = new EnternimentDaoImpl();
            boolean orderBy = enternimentDao5.orderBy();
            System.out.println(orderBy);




        }


    }

