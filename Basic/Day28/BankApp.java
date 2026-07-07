package Day28;

class Account {
    String id, owner;
    double balance;

    Account(String id,String owner,double balance){
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }
}

class BankUtils {
    static String format(double amount) {
        // Simple formatting: Rs.1,234.56
        return String.format("Rs.%,.2f", amount);
    }
}
class AccountService{
    void deposit(Account acc, double amount){
        if (amount <= 0) { System.out.println("Invalid amount"); return; }
        acc.balance += amount;
        System.out.println("Deposit " + BankUtils.format(amount)
        + " to " + BankUtils.format(acc.balance));
    }
    void withdraw(Account acc, double amount){
        if ( amount <= 0) { System.out.println("Insufficient balance"); return; }
        acc.balance -= amount;
        System.out.println("Withdraw " + BankUtils.format(amount) + " from " + BankUtils.format(acc.balance));
    }

    void printStatement(Account acc) {

    }

    public void printStatment(Account acc) {
    }
}
public class BankApp {
    public static void main(String[] args) {
        Account acc =  new Account("ACC-001", "Arjun", 5000);
        AccountService svc = new AccountService();
        
        svc.printStatment(acc);
        svc.deposit(acc, 2000);
        svc.withdraw(acc, 500);
        svc.printStatement(acc);
    }
}
