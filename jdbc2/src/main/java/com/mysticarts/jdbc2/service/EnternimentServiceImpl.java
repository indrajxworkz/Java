package com.mysticarts.jdbc2.service;


import com.mysticarts.jdbc2.exception.MovieNotFoundException;
import com.mysticarts.jdbc2.movie.dao.EnternimentDao;
import com.mysticarts.jdbc2.movie.dao.EnternimentDaoImpl;
import com.mysticarts.jdbc2.movie.dto.MovieDto;

public class EnternimentServiceImpl implements EnternimentService {

        @Override
        public void insertMovie(MovieDto movieDto) {

            if (movieDto != null && movieDto.getName() != null
                    && !movieDto.getName().isEmpty()) {

                EnternimentDao enternimentDao = new EnternimentDaoImpl();

                //dao
                enternimentDao.insertMovie(movieDto);

            } else {
                System.out.println("movie name is empty");
            }

        }

        @Override
        public boolean updateMovieNameById(String name, int id)throws MovieNotFoundException {
            boolean isUpdated = false;
            if (name != null && !name.isEmpty() && id > 0) {
                System.out.println("Valid name and ID, successfully updating the info...");

                EnternimentDao enternimentDao = new EnternimentDaoImpl();

                enternimentDao.updateMovieNameById(name, id);
            } else {
                System.out.println("movie name is empty");
            }
            if(id <= 0){
                System.out.println("movie id is invalid");
            }
            if (id == 0){
                MovieNotFoundException movieNotFoundException = new MovieNotFoundException("Given details are not found");
                movieNotFoundException.printStackTrace();
            }

            return false;
        }

        @Override
        public boolean deleteId(int id) {

            if(id > 0){

                System.out.println("deleting the id ");

                EnternimentDao enternimentDao = new EnternimentDaoImpl();
                enternimentDao.deleteId(id);

            }else {
                System.out.println("movie id is invalid");
            }

            return false;
        }

        @Override
        public boolean read(String name, int id) {

            if(name != null && !name.isEmpty() && id > 0 ){

                System.out.println("Fetcthing the movie details...");

                EnternimentDao enternimentDao = new EnternimentDaoImpl();

                enternimentDao.updateMovieNameById(name, id);
            } else {
                System.out.println("movie name is empty");
            }

            return false;
        }

        @Override
        public int getNoOfMovies() {

            EnternimentDao enternimentDao = new EnternimentDaoImpl();
            enternimentDao.getNoOfMovies();

            return 0;
        }

        @Override
        public boolean orderBy() {

            return false;
        }
    }

