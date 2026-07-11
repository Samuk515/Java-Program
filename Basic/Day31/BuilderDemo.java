package Day31;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    // All fields private final - immutable after creation
    private final String size;
    private final String crust;
    private final String sauce;
    private final boolean extraCheese;
    private final String[] toppings;

    // Private constructor - only Builder can create Pizza
    private Pizza(Builder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.sauce = builder.sauce;
        this.extraCheese = builder.extraCheese;
        this.toppings = builder.toppings.toArray(new String[0]);
    }

    void display() {
        System.out.println(" === Your Pizza ===");
        System.out.println("Size : " + size);
        System.out.println("Crust : " + crust);
        System.out.println("Sauce : " + sauce);
        System.out.println("Cheese : " + (extraCheese ? "Extra" : "Regular"));
        System.out.println("Toppings: ");
        if (toppings.length == 0) {
            System.out.println("  (none)");
        } else {
            for (String t : toppings) System.out.println("  " + t);
        }
        System.out.println();
    }

    // Static nested Builder
    static class Builder {
        private final String size;
        private String crust = "Regular";
        private String sauce = "Tomato";
        private boolean extraCheese = false;
        private final List<String> toppings = new ArrayList<>();

        Builder(String size) {
            if (size == null || size.isEmpty()) throw new IllegalArgumentException("size is required");
            this.size = size;
        }

        Builder crust(String crust) {
            this.crust = crust;
            return this;
        }

        Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        Builder cheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        Builder topping(String t) {
            if (t != null) this.toppings.add(t);
            return this;
        }

        Builder toppings(String... items) {
            if (items != null) {
                for (String it : items) if (it != null) this.toppings.add(it);
            }
            return this;
        }

        Pizza build() {
            return new Pizza(this);
        }
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Large")
                .crust("Thin")
                .sauce("BBQ")
                .cheese(true)
                .topping("Pepperoni")
                .topping("Mushrooms")
                .topping("Olives")
                .build();

        pizza.display();

        // Minimal pizza — only size required
        Pizza simple = new Pizza.Builder("Small").build();
        simple.display();
    }
}
