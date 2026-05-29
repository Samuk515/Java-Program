package Day11;

class BankAccount {
    String owner;
    String accountNo;
    double balance;

    void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Invaild deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance:" + balance);
    }
    void withdraw( double amount){
        if ( amount > balance){
            System.out.println("Insufficient funds. Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

    public void printStatement() {
        System.out.println("Owner :" + owner);
        System.out.println("Account Number :" + accountNo);
        System.out.println("Balance :" + balance);
    }
}

public class BankDemo {
    static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.owner = "Arjun";
        acc.accountNo = "NP-001";
        acc.balance = 0;

        System.out.println("Account opened for " + acc.owner + ". Balance:" + acc.balance);
        acc.deposit(5000);
        acc.withdraw(1500);
        acc.withdraw(4000);
        acc.withdraw(4000);
        acc.printStatement();

    }
}
