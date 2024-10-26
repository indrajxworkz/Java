package com.xworkz.musicapp.song;

public class Songs {


    private String songName;
    private double durationInMins;


    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setDurationInMins(double durationInMins) {
        this.durationInMins = durationInMins;
    }

    public double getDurationInMins() {
        return durationInMins;
    }

    public void displayDetails() {

        System.out.println("The Song Name is " + this.songName);
        System.out.println("The duration of song is " + this.durationInMins);
    }
}