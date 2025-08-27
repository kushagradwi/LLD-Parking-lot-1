package Models.Payment;

public class Payment {
    double amount;
    Boolean isProcessed;
    public Boolean getIsProcessed() {
        return isProcessed;
    }
    public void setIsProcessed(Boolean isProcessed) {
        this.isProcessed = isProcessed;
    }
    PaymentStratergy paymentStratergy;
    public Payment(double amount, PaymentStratergy paymentStratergy) {
        this.amount = amount;
        this.isProcessed=false;
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
