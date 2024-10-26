package com.mysticarts.jdbc2.service;


import com.mysticarts.jdbc2.movie.dto.MovieDto;

public class ServiceRunner {

        public static void main(String[] args) {

            //insert
            MovieDto movieDto = new MovieDto();
            movieDto.setId(21);
            movieDto.setName("");
            movieDto.setDirector("antony");
            movieDto.setLanguage("telugu");

            EnternimentService enternimentService = new EnternimentServiceImpl();
            enternimentService.insertMovie(movieDto);

            //update
            MovieDto movieDto1 = new MovieDto();
            movieDto1.setName("");
            movieDto1.setId(1);

            EnternimentService enternimentService1 = new EnternimentServiceImpl();
            enternimentService1.updateMovieNameById(movieDto1.getName(), movieDto1.getId());

            //delete
            MovieDto movieDto2 = new MovieDto();
            movieDto2.setId(21);

            EnternimentService enternimentService2 = new EnternimentServiceImpl();
            enternimentService2.deleteId(movieDto2.getId());

            //read
            MovieDto movieDto3 = new MovieDto();
            movieDto3.setId(7);
            movieDto3.setName("JanathaGarage");

            EnternimentService enternimentService3 = new EnternimentServiceImpl();
            enternimentService3.read(movieDto3.getName(), movieDto3.getId());

            //get no of movies

            EnternimentService enternimentService4 = new EnternimentServiceImpl();
            enternimentService4.getNoOfMovies();




        }
    }

