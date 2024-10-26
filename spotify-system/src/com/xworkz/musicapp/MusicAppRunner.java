package com.xworkz.musicapp;

import com.xworkz.musicapp.music.MusicApp;
import com.xworkz.musicapp.song.Songs;
import com.xworkz.musicapp.spotify.Spotify;

public class MusicAppRunner {


    public static void main(String[] args) {
   // Polymo
        MusicApp musicApp = new Spotify();

        Songs ref = new Songs();
        ref.setSongName("aasa kooda");
        ref.setDurationInMins(4.3);
        // has a relationship
        musicApp.playSongs(ref);


        Spotify spotify = (Spotify) new MusicApp();

        Songs song = new Songs();
        song.setSongName("Illuminati");
        song.setDurationInMins(3.5);
        // has a relationship
        spotify.playSongs(song);

    }
}
