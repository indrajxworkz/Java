package com.xworkz.musicapp.music;

import com.xworkz.musicapp.song.Songs;

public class MusicApp {

     // has a relationship
    Songs songs;


        //method(DataType ref)
        public  void  playSongs(Songs songs){

            this.songs = songs;
            this.songs.displayDetails();
            }
}
