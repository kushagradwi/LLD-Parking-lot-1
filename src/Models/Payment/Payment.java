package Models.Payment;

public class Payment {
    int amount;
    PaymentStratergy paymentStratergy;
    public Payment(int amount, PaymentStratergy paymentStratergy) {
        this.amount = amount;
        this.paymentStratergy = paymentStratergy;
    }
    public void processPayment(){
        if(amount>0){
            paymentStratergy.processPayment(amount);
        }else{
            System.out.println("Invalid Payment amount");
        }
    }
}
