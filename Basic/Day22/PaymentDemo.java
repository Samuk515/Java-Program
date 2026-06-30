package Day22;

class Payment{
    double amount;

    Payment(double amount) { this.amount = amount; }
    double processPayment() { return amount; }
    void getRecipt() {
        System.out.println("Payment processed; Rs. " + processPayment());
    }
}

class CreditCardPayment extends Payment{
    String cardNumber;

 CreditCardPayment(double amount, String cardNumber){
    super(amount);
    this.cardNumber = cardNumber;
 }
 @Override
    double processPayment(){
     double total = amount * 1.20; // 2% fee
     System.out.println("CreditCard: Rs. " + total + " charged (incl. 2% fee) | Card: " + cardNumber.substring(cardNumber.length()-4));
     return total;
 }
}
class UPIPayment extends Payment{
    String upiId;

    UPIPayment(double amount, String upiId){
        super(amount);
        this.upiId = upiId;
    }
    @Override
    double processPayment(){
        System.out.println("UPI: Rs." + amount + " transferred to " + upiId + " (free)");
        return amount;
    }
}

class CashPayment extends Payment{
    CashPayment(double amount){ super(amount); }

    @Override
    double processPayment(){
        System.out.println("Cash: Rs. " + amount + " received");
        return amount;
    }

}
public class PaymentDemo {
    public static void main(String[] args) {
        Payment[] payments = {
                new CreditCardPayment(1000, "1234-5678-9012-3456"),
                new UPIPayment(500, "arjun@up"),
                        new CashPayment(1000)
        };
        for (Payment payment : payments) {
            payment.getRecipt(); // calls overridden processPayment() for each
        }
    }
}
