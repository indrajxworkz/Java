package com.mysticarts.movietickt;

import com.mysticarts.movietickt.bookmyshow.BookMyShow;
import com.mysticarts.movietickt.pvr.PvrBooking;
import com.mysticarts.movietickt.ticketagency.TicketBooking;
import com.mysticarts.movietickt.trishul.TrishulBooking;

public class TicketRunner {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();
        BookMyShow pvr = new PvrBooking();
        BookMyShow trishul = new TrishulBooking();
        ticketBooking.booking(pvr);
        ticketBooking.booking(trishul);
    }
}
