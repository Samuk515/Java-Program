package Day29;

class BankAccount{
    private final String accountNo;
    private String owner;
    private double balance;
    private int transactionCount;
    
    
    public BankAccount(String accountNo,String owner, double initialDeposit){
        this.accountNo=accountNo;
        this.balance=initialDeposit;
        this.transactionCount=0;
        this.owner = owner;
        
    }
    // Getter only - no setter for balance or accountNo
    public String getAccountNo(){ return accountNo; }
    public String getOwner(){ return owner; }
    public double getBalance(){ return balance; }
    public int getTransactionCount(){ return transactionCount; }
    
    //Setter only for owner (name can change legally)
    public void setOwner(String owner) {
        if ( owner == null || owner.trim().isEmpty()) {
            System.out.println("Error: Owner name cannot be empty"); return;
        }
        this.owner = owner;
    }
    public void setBalance(double amount) {
        // keep backward-compatibility: delegate to deposit
        deposit(amount);
    }

    // deposit method (used by callers)
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        transactionCount++;
        System.out.println("Deposited Rs." + amount + " | Balance: Rs." + balance);
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        balance -= amount;
        transactionCount++;
        System.out.println("Withdrew Rs." + amount + " | Balance: Rs." + balance);
    }
    public void display() {
        System.out.println("Account:" + accountNo + " | Owner:" + owner + " | Balance:" + balance + " | Txns:" + transactionCount);
    }
}

public class BankerDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", "Arjun", 5000);
        acc.display();
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.display();
    }
}
