package com.mysticarts.movietickt.pvr;

import com.mysticarts.movietickt.bookmyshow.BookMyShow;

public class PvrBooking implements BookMyShow {
    @Override
    public boolean theaterCondition() {
        return true;
    }

    @Override
    public int minBooking() {
        return 75;
    }
}
