package Day29;

import java.time.LocalDateTime;

class Order {
    static final String[] STATUS_FLOW = {"PENDING", "CONFIRMED", "SHIPPED", "DELIVERED"};

    private final String orderId;
    private final String createdAt;
    private String customerId;
    private double[] items;
    private int itemCount;
    private int statusRank;
    private static final int MAX_ITEMS = 100;

    Order(String orderId) {
        this.orderId = orderId;
        this.createdAt = LocalDateTime.now().toString();
        this.items = new double[MAX_ITEMS];
        this.itemCount = 0;
        this.statusRank = 0;
    }

    // Read-only getters
    public String getOrderId() { return orderId; }
    public String getCreatedAt() { return createdAt; }
    public String getStatus() { return STATUS_FLOW[statusRank]; }

    // Write-once setter
    public void setCustomerId(String id) {
        if (this.customerId != null) {
            System.out.println("Error: Customer already assigned to this order");
            return;
        }
        this.customerId = id;
        System.out.println("Customer assigned: " + id);
    }

    // Computed property — sum of added items
    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < itemCount; i++) sum += items[i];
        return sum;
    }

    public void addItem(double price) {
        if (itemCount < items.length) items[itemCount++] = price;
        else System.out.println("Cannot add more items to the order");
    }

    // Controlled status transition — forward only
    public void advanceStatus() {
        if (statusRank >= STATUS_FLOW.length - 1) {
            System.out.println("Order already delivered");
            return;
        }

        String old = getStatus();
        statusRank++;
        System.out.println("Status: " + old + " → " + getStatus() + " ✓");
    }

    public void setStatus(String target) {
        int targetRank = -1;
        for (int i = 0; i < STATUS_FLOW.length; i++)
            if (Order.STATUS_FLOW[i].equals(target)) { targetRank = i; break; }

        if (targetRank == -1) {
            System.out.println("Unknown status: " + target);
            return;
        }

        if (targetRank <= statusRank) {
            System.out.println("Status: " + getStatus() + " → " + target + " ✗ (cannot go backward)");
        } else {
            statusRank = targetRank;
            System.out.println("Status: → " + getStatus() + " ✓");
        }
    }

    public void display() {
        System.out.println("Order #" + orderId + " | Status: " + getStatus()
                + " | Total: Rs." + getTotal() + " | Customer: " + customerId);
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Order order = new Order("ORD-001");
        order.setCustomerId("CUST-42");
        order.setCustomerId("CUST-99"); // write-once: error
        order.addItem(2500); order.addItem(1200); order.addItem(800);
        order.display();

        order.advanceStatus(); // PENDING → CONFIRMED
        order.setStatus("PENDING"); // backward: error
        order.advanceStatus(); // CONFIRMED → SHIPPED
        order.display();
    }
}
