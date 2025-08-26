package Models.Payment;

public class UPIPayment implements PaymentStratergy {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment processed using UPI for amount: "+amount);
    }
}
