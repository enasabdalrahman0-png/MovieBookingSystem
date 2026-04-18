package main;

import model.*;
import service.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // create seats
        Seat s1 = new Seat("A1");
        Seat s2 = new Seat("A2");

        List<Seat> seats = new ArrayList<>();
        seats.add(s1);
        seats.add(s2);

        // create booking service
        BookingService bookingService = new BookingService();

        // create booking
        Booking booking = bookingService.createBooking(
                "B1",
                "C1",
                "S1",
                seats
        );

        // cancel booking (test flow)
        if (booking != null) {
            bookingService.cancelBooking(booking);
        }
    }
}