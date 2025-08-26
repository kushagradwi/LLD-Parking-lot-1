package Service;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

import Models.Payment.CashPayment;
import Models.Payment.CreditCardPayment;
import Models.Payment.Payment;
import Models.Payment.UPIPayment;
public class PaymentService {
    Scanner scanner;

    public PaymentService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void PaymentMethod(int amount){
        choosePaymentMethod(amount);
            }
        
    private void choosePaymentMethod(int amount) {
            System.out.println("Choose Payment method: 1. Cash 2. CreditCard 3. UPI");
            
            int input=scanner.nextInt();
            Payment payment;
            switch (input) {
                case 1:
                    payment= new Payment(amount, new CashPayment());
                    break;
                case 2:
                    payment= new Payment(amount, new CreditCardPayment());
                    break;
                case 3:
                    payment= new Payment(amount, new UPIPayment());
                    break;    
            
                default:
                    System.out.println("Invalid payment. Resolving to default as cash");
                    payment= new Payment(amount, new CashPayment());
                    break;
            }
            payment.processPayment();
              
            }

}
