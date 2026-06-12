package Day14;

class  Pizza {
    String size, crust, topping;
    double price;

    Pizza() {
        size = "Medium"; crust = "Thin";
        topping = "Chesse"; price = 500;

    }
    Pizza(String size){
        this.size = size;
        crust = "Thin"; topping ="Chesse"; price = 500;

    }
    Pizza(String size, String crust, String topping, double price){
        this.size = size;
        this.crust = crust;
        this.topping = topping;
        this.price = price;

    }
    void display(){
        System.out.println(size + " | " + crust + " | " + topping + " | " + price);

    }

        }

public class ConstructorOverloading {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza("Small", "Thick", "Pepperoni", 650);
        p1.display();
        p2.display();
        p3.display();
    }

}
