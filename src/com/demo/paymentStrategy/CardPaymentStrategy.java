package com.demo.paymentStrategy;

public class CardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CardPaymentStrategy(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public void processPayment(double amount) {
        // Perform credit card payment processing logic
        System.out.println("Processing card payment of $" + amount + " using card number " + cardNumber);
    }
}