package service;

import model.*;
import java.util.List;

public class BookingService {

    private PaymentService paymentService = new PaymentService();

    public Booking createBooking(String bookingId, String customerId, String showtimeId, List<Seat> seats) {

        // check seats availability
        for (Seat seat : seats) {
            if (!seat.isAvailable()) {
                System.out.println("Seat " + seat.getSeatId() + " is not available!");
                return null;
            }
        }

        // reserve seats
        for (Seat seat : seats) {
            seat.reserve();
        }

        // create booking
        Booking booking = new Booking(bookingId, customerId, showtimeId, seats);

        // create payment
        Payment payment = new Payment("P1", bookingId, 50.0);

        boolean paid = paymentService.processPayment(payment);

        if (paid) {
            booking.confirm();
        }

        return booking;
    }

    public void cancelBooking(Booking booking) {

        // release seats
        for (Seat seat : booking.getSeats()) {
            seat.release();
        }

        // refund payment
        Payment payment = new Payment("P1", booking.getBookingId(), 50.0);
        paymentService.refundPayment(payment);

        // cancel booking
        booking.cancel();
    }
}