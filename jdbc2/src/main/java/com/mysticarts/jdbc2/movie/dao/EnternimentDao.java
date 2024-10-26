package com.mysticarts.jdbc2.movie.dao;

import com.mysticarts.jdbc2.movie.dto.MovieDto;

public interface EnternimentDao {


        void insertMovie(MovieDto movieDto);

        boolean updateMovieNameById(String name, int id);

        boolean deleteId(int id);

        boolean read(String name, int id);

        int getNoOfMovies();

        boolean orderBy();
    }



