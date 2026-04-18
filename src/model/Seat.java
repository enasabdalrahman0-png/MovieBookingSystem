package model;

public class Seat {
    private String seatId;
    private boolean available;

    public Seat(String seatId) {
        this.seatId = seatId;
        this.available = true;
    }

    public void reserve() {
        available = false;
        System.out.println("Seat " + seatId + " reserved.");
    }

    public void release() {
        available = true;
        System.out.println("Seat " + seatId + " released.");
    }

    public boolean isAvailable() {
        return available;
    }

    public String getSeatId() {
        return seatId;
    }
}