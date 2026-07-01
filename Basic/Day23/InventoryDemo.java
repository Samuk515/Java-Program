package Day23;

class Product{
    final String SKU; //final field - cannot change after set
    String name;
    double price;

    Product(String sku, String name, double price){
        this.SKU = sku;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.printf("SKU:%-5s %-8s Rs.%-10.1f", SKU, name, price);
    }
}

class Electronics extends Product {
    int warrantyMonths;

    Electronics(String sku, String name, double price, int warrantyMonths) {
        super(sku, name, price); // call Product constructor with proper args
        this.warrantyMonths = warrantyMonths;
    }
    @Override
    void display(){
        super.display();    // super method
        System.out.println("| Warranty: " + warrantyMonths + " months");
    }
}
class Food extends Product {
    String expiryDate;

    Food(String sku, String name, double price, String expiryDate){
        super(sku, name, price);
        this.expiryDate = expiryDate;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Expiry : " + expiryDate);
    }
}
public class InventoryDemo {
    public static void main(String[] args) {
        Product[] inventory = {
                new Electronics("E001", "Laptop", 85000, 24),
                new Food("F001", "Rice", 120, "2025-12"),
                new Electronics("E002", "Phone", 25000, 12),
                new Food("F002", "Bread", 60, "2024-11")
        };

        System.out.println("=== Full Inventory ===");
        for (Product p : inventory) {
            p.display();
        }

        System.out.println("\n=== Electronics with Warranty >12 months ===");
        for (Product p : inventory) {
            if (p instanceof Electronics) {
                Electronics e = (Electronics) p;
                if (e.warrantyMonths > 12) e.display();
            }
        }

        System.out.println("\n=== Food Expiring Soon ====");
        for (Product p : inventory) {
            if (p instanceof Food) {
                ((Food) p).display();
            }
        }
    }
}
