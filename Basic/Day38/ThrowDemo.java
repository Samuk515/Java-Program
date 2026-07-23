package Day38;

class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double initial){
        setOwner(owner);
        if ( initial < 0) throw new IllegalArgumentException("Initial balance cannot be  negative");
        this.balance = initial;
    }
    void setOwner(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Owner name cannot be null or empty");
        this.owner = name;
    }
    void deposit(double amount){
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        balance += amount;
        System.out.println("Deposit OK: Rs." + balance);
    }

    void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        if (amount > balance)
            throw new ArithmeticException(
                    "Insufficient funds. Balance: " + balance + ", Requested: " + amount);
        balance -= amount;
        System.out.println("Withdraw Ok: Rs." + amount + " | Balance: Rs." + balance);

    }
}

public class ThrowDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Samir Singh", 5000);

        // Valid operations
        try { acc.deposit(5000); } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }

        //Invalid deposit
        try { acc.deposit(-500); } catch (IllegalArgumentException e) { System.out.println("Error: " + e.getMessage()); }

        //Overdraft
        try { acc.withdraw(8000); } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }

        //valid withdrawal
        try { acc.withdraw(2000);} catch (Exception e) { System.out.println("Error: " + e.getMessage()); }

        // Invalid owner
        try {acc.setOwner("");} catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }
}
