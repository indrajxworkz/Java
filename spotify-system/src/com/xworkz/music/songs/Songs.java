package com.xworkz.music.songs;

public class Songs {

    public String songName;
    public double durationMin;
    public String movieName;
    public String type;
    public int year;

    public void displayDetails(){
        System.out.println("Song Name      : " + this.songName);
        System.out.println("Song duration  : " + this.durationMin);
        System.out.println("Movie Name     : " + this.movieName);
        System.out.println("Type of song   : " + this.type);
        System.out.println("Year           : " + this.year);

    }
}
