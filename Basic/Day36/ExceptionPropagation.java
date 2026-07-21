package Day36;

public class ExceptionPropagation {

    // level 4 - throws exception
    static void checkBalance(double balance, double amount) {
        if (balance < amount) {
            throw new IllegalStateException(
                    "Insufficient funds: need " + amount + ", have " + balance);
        }
        System.out.println("[checkBalance] Balance OK: " + balance);
    }

    // Level 3 - catches and  wraps
    static void validatePayment(double balance, double amount) {
        try {
            checkBalance(balance, amount);
            System.out.println("[validatePayment] Payment validated");
        } catch (IllegalStateException e) {
            System.out.println("[ validatePayment] Error: " + e.getMessage());
            // wrap in a new exception, preserving cause
            throw new RuntimeException("[Payment validate failed]", e);
        }
    }

    // Level 2 - handles gracefully
    static boolean processOrder(String item, double balance, double price) {
        try {
            System.out.println("[processOrder] Processing : " + item );
            validatePayment(balance, price);
            System.out.println("[processOrder] Order successful");
            return true;
        } catch (RuntimeException e) {
            System.out.println("[processOrder] Order failed: " + e.getMessage());
            // Access the root cause
            if (e.getCause() != null) {
                System.out.println("[processOrder] Root cause: " + e.getCause().getMessage());
            }
            return false;
        }
    }

    // Level 1 - main
    public static void main(String[] args) {
        System.out.println("=== Order 1: Sufficient Funds ===");
        boolean ok = processOrder("Laptop", 10000, 5000);
        System.out.println("[main] Result: " + (ok ? "Success" : "Failed"));

        System.out.println("\n=== Order 2: Insufficient funds ===");
        ok = processOrder("Phone", 2000, 5000);
        System.out.println("[main] " + (ok ? "Order placed!" : "Order could not be processed. Please try again."));
    }

}
