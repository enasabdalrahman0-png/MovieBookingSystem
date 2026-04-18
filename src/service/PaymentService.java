package service;

import model.Payment;

public class PaymentService {

    public boolean processPayment(Payment payment) {
        return payment.processPayment();
    }

    public boolean refundPayment(Payment payment) {
        return payment.refund();
    }
}