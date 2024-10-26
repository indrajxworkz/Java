package com.xworkz.music;

import com.xworkz.music.songs.Songs;
import com.xworkz.music.spotify.Spotifyapp;

public class SpotifyRunner {

    public static void main(String[] args){

        Spotifyapp app = new Spotifyapp();

        Songs songs = new Songs();

        songs.songName = "Tum Hi Ho";
        songs.durationMin =4.5;
        songs.type = "melody";
        songs.movieName=" Aashiqui 2";
        songs.year=2013;
       // songs.displayDetails();
        System.out.println("");


        Songs songs1 = new Songs();

        songs1.songName = "Chaiyya Chaiyya";
        songs1.durationMin =6.33;
        songs1.type = "dance";
        songs1.movieName=" Dil Se";
        songs1.year=1998;

       // songs1.displayDetails();


       app.playSongs(songs);
       app.playSongs(songs1);


    }



}
