package com.xworkz.music.spotify;

import com.xworkz.music.songs.Songs;

public class Spotifyapp {

    Songs songs;

    public void playSongs(Songs songs){

        this.songs = songs;
        this.songs.displayDetails();
    }



}
