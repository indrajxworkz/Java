package com.mysticarts.movietickt.trishul;

import com.mysticarts.movietickt.bookmyshow.BookMyShow;

public class TrishulBooking implements BookMyShow {
    @Override
    public boolean theaterCondition() {
        return true;
    }

    @Override
    public int minBooking() {
        return 80;
    }
}
