package model;

import java.util.List;

public class Booking {
    private String bookingId;
    private String customerId;
    private String showtimeId;
    private List<Seat> seats;
    private String status;

    public Booking(String bookingId, String customerId, String showtimeId, List<Seat> seats) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.showtimeId = showtimeId;
        this.seats = seats;
        this.status = "PENDING";
    }

    public void confirm() {
        status = "CONFIRMED";
        System.out.println("Booking confirmed!");
    }

    public void cancel() {
        status = "CANCELLED";
        System.out.println("Booking cancelled!");
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public String getBookingId() {
        return bookingId;
    }
}