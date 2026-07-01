package Day23;

// 1. final variable
class config {
    final double TAX_RATE = 0.13;
    final String APP_Name = "MyApp";
    // TAX_RATE = 0.15; // COMPILE ERROR: cannot assign a final variable
}

// 2. final method
class BankAccount {
    double balance;
    BankAccount(double balance) { this.balance = balance; }

    final double calculateInterest() { // cannot be overridden
        return balance * 0.05;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) { super(balance); }
    // double calculateInterest() { return 0;}
    // Cannot override the final method from BankAccount
}

// 3. final class - cannot be extended
final class SSN {
    private String value;
    SSN(String value) { this.value = value; }
    String getMasked() { return "***-***" + value.substring(value.length() - 4); }
}
//class FakeSSN extends SSN {} // COMPILE ERROR : cannot subclass final class
public class FinalDemo {
    public static void main(String[] args) {
        config cfg = new config();
        System.out.println("App  : " + cfg.APP_Name);
        System.out.println("Tax Rate: " + cfg.TAX_RATE);

        BankAccount acc = new BankAccount(10000);
        System.out.println("Interest: Rs." + acc.calculateInterest());

        SSN snn = new SSN("123456789");
        System.out.println("SSN   : " + snn.getMasked());
    }
}
