package Models.Payment;

public class CashPayment implements PaymentStratergy {

    @Override
    public void processPayment(int amount) {
        System.out.println("Payment processed using Cash for amount: "+amount);
    }
    
}
