package Day14;

class BankAccount {
    String owner;
    String accountNo;
    double balance;
    static int totalAccounts = 0;

    BankAccount(String owner, String accountNo) {
        this.owner     = owner;
        this.accountNo = accountNo;
        this.balance   = 0;
        totalAccounts++;
        System.out.println("Account created: " + owner + " (" + accountNo + ") | Balance: " + balance);
    }

    BankAccount(String owner, String accountNo, double initialDeposit) {
        this(owner, accountNo); // chain to first constructor
        deposit(initialDeposit);
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) System.out.println("Insufficient funds.");
        else balance -= amount;
    }

    void printStatement() {
        System.out.println(owner + " (" + accountNo + ") Balance: Rs." + balance);
    }

    static int getTotalAccounts() {
        return totalAccounts;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Arjun", "NP-001");
        BankAccount a2 = new BankAccount("Priya", "NP-002", 10000);

        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());

        a1.deposit(5000);
        a1.withdraw(1000);
        a1.printStatement();
        a2.printStatement();
    }

}
