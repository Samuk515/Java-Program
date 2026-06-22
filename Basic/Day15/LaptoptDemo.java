package Day15;
class Laptop{
    String brand;
    int ram;
    double price;


    Laptop(String brand, int ram, double price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    void dispaly() {
        System.out.println(brand + " | " + ram + "GB | Rs." + price);
    }
}
public class LaptoptDemo {
    static void main(String[] args) {
        Laptop l = new Laptop("Dell" , 16, 75000.0);
        l.dispaly();
    }
}
