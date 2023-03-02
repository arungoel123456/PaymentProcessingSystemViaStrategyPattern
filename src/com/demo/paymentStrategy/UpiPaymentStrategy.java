package com.demo.paymentStrategy;

public class UpiPaymentStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public UpiPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void processPayment(double amount) {
        // Perform PayPal payment processing logic
        System.out.println("Processing UPI payment of $" + amount + " using email " + email);
    }
}
