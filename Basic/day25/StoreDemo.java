package day25;

abstract class Product {
    final String id;
    String name;
    double price;

    Product(String id, String name, double price) {
        this.id = id; this.name = name; this.price = price;
    }

    double getDisount() { return 0; }
    double getFinalPrice() { return price * (1 - getDisount() / 100.); }

    abstract double getDiscount();

    String getType() { return "Product";}
}

class PhysicalProduct extends Product {
    double weight;
    PhysicalProduct(String id, String name, double price, double weight) {
        super(id, name, price); this.weight = weight;
    }
    @Override double getDiscount() { return price > 1000 ? 5 : 0; }
    @Override String getType() { return "Physical"; }
}

class DigitalProduct extends Product {
    String filesize;
    DigitalProduct(String id, String name, double price, String filesize) {
        super(id, name, price); this.filesize = filesize;
    }
    @Override double getDiscount() { return 10; }
    @Override String getType() { return "Digital"; }
}

class Cart {
    Product[] items; int count = 0;
    Cart(int capacity) { items = new Product[capacity]; }

    void addProduct(Product p) {
        if( count <  items.length) items[count++] = p; }

    void addProducts(Product p) {
        if (count < items.length) items[count++] = p;
    }
    void checkout () {
        System.out.println("--- Your Cart ---");
        double total = 0;
        for ( int i = 0; i < count; i++ ) {
            Product p = items[i];
            double final_ = p.getFinalPrice();
            System.out.printf("%-15s (%-8s) Rs.%8.0f disc %2.0f%% | Rs.%.1f%n",
                    p.name, p.getType(), p.price, p.getDiscount(), final_);
            total += final_;
        }
        System.out.printf("Total: Rs.%.1f%n", total);
    }
}
public class StoreDemo {
    public static void main(String[] args) {
        Cart cart = new Cart(10);
        cart.addProduct(new PhysicalProduct("P001", "Laptop", 50000, 2.5));
        cart.addProduct(new DigitalProduct("D001", "Ebook", 500, "5MB"));
        cart.addProduct(new PhysicalProduct("P002", "Smartphone", 15000, 0.3));
        cart.addProduct(new DigitalProduct("D002", "Music Album", 300, "50MB"));
        cart.checkout();
    }
}
