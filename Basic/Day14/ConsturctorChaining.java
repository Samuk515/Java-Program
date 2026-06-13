package Day14;

class Burger {
    String size, bun, topping;
    double price;

    //All other constructors chain to this one
    Burger(String size, String bun, String topping, double price) {
        this.size = size;
        this.bun = bun;
        this.topping = topping;
        this.price = price;
        System.out.println("Burger created: " + size + " " + topping);
    }

    Burger(String size) {
        this(size, "Regular", "Cheese", 500);
    }

    Burger() {
        this("Medium");
    }

    void display() {
        System.out.println(size + " | " + bun + " | " + topping + " | Rs." + price);
    }
}

public class ConsturctorChaining {
    public static void main(String[] args) {
        Burger b1 = new Burger();
        Burger b2 = new Burger("Large");
        Burger b3 = new Burger("Small", "Sesame", "Bacon", 650);

        b1.display();
        b2.display();
        b3.display();
    }
}
