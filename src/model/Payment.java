package model;

public class Payment {
    private String paymentId;
    private String bookingId;
    private double amount;
    private String status;

    public Payment(String paymentId, String bookingId, double amount) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.status = "PENDING";
    }

    public boolean processPayment() {
        System.out.println("Processing payment...");
        status = "PAID";
        return true;
    }

    public boolean refund() {
        System.out.println("Refund processed...");
        status = "REFUNDED";
        return true;
    }

    public String getStatus() {
        return status;
    }
}