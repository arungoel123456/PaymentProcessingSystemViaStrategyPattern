import com.demo.paymentProcessor.*;
import com.demo.paymentStrategy.*;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Card payment
        PaymentStrategy creditCardPaymentStrategy = new CardPaymentStrategy("1234 5678 9012 3456", "123", "12/24");
        paymentProcessor.setPaymentStrategy(creditCardPaymentStrategy);
        paymentProcessor.processPayment(100.00);

        // UPI payment
        PaymentStrategy payPalPaymentStrategy = new UpiPaymentStrategy("johndoe@example.com", "mypassword");
        paymentProcessor.setPaymentStrategy(payPalPaymentStrategy);
        paymentProcessor.processPayment(50.00);
    }
}