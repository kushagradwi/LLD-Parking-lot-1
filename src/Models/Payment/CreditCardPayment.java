package Models.Payment;

public class CreditCardPayment implements PaymentStratergy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed using Credit Card for amount: "+amount);
    }
}
