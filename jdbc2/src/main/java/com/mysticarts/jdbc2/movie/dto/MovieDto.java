package com.mysticarts.jdbc2.movie.dto;


    public class MovieDto {

        private int id;

        private String name;

        private String director;

        private String language;

        public MovieDto(){

        }

        public MovieDto(int id, String name, String director, String language){

            this.id = id;
            this.name = name;
            this.director = director;
            this.language = language;

        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDirector() {
            return director;
        }

        public String getLanguage() {
            return language;
        }


    }

