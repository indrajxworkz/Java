package com.mysticarts.movietickt.ticketagency;

import com.mysticarts.movietickt.bookmyshow.BookMyShow;

public class TicketBooking {
    BookMyShow bookMyShow;
    public boolean booking(BookMyShow bookMyShow){

        System.out.println("The booking has begin");
        boolean isBooked = false;
        if (bookMyShow != null){
            System.out.println("Checking if Seat available or not ");
            boolean isOpen = bookMyShow.theaterCondition();
            if (isOpen){
                this.bookMyShow = bookMyShow;
                isBooked = true;
                System.out.println("The theater is open");
                System.out.println("The booking confirmed");
            }else System.out.println("Theater is closed");
        }else System.out.println("Seat unavailable booking full");

        System.out.println("Booking has ended");
        return isBooked;
    }
}
