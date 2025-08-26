package Models.Payment;

public class CreditCardPayment implements PaymentStratergy{
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment processed using Credit Card for amount: "+amount);
    }
}
