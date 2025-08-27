package Models.Payment;

public class UPIPayment implements PaymentStratergy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed using UPI for amount: "+amount);
    }
}
