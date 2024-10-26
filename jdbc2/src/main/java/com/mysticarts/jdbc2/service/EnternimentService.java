package com.mysticarts.jdbc2.service;


import com.mysticarts.jdbc2.movie.dto.MovieDto;

public interface EnternimentService {

        void insertMovie(MovieDto movieDto);

        boolean updateMovieNameById(String name, int id);

        boolean deleteId(int id);

        boolean read(String name, int id);

        int getNoOfMovies();

        boolean orderBy();
    }

