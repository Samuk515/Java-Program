package Day26;

abstract class Vehicle {
    String brand; int year; double price;

    Vehicle(String brand, int year, double price) {
        this.brand = brand; this.year = year; this.price = price;
    }
    abstract String getFuelType();
    abstract double calculateTax();

    void display() {
        System.out.printf( "%-12s  ∞d  Rs.%-10.0f", brand, year, price);
    }

    void dispalyFull() {
        displayBasic();
        System.out.printf("Fuel: %-10s Tax: %-0f%n",
                getFuelType(), calculateTax());
    }

    private void displayBasic() {
    }

    public void displayFull() {
    }
}
   class PetrolCar extends Vehicle {
    PetrolCar(String brand, int year, double price) { super(brand, year, price); }
       @Override String getFuelType() { return "Petrol Car"; }
       @Override double calculateTax() { return price * 0.10; }
   }

   class ElectricCar extends Vehicle {
    ElectricCar(String brand, int year, double price) { super(brand, year, price); }
       @Override String getFuelType() { return "Electric Car"; }
       @Override double calculateTax() { return price * 0.02; }
   }

   class DieselTruck extends Vehicle {
    DieselTruck(String brand, int year, double price) {  super(brand, year, price); }
       @Override String getFuelType() { return "Diesel Truck"; }
       @Override double calculateTax() { return price * 0.15; }
   }

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] fleet = {
                new PetrolCar("Toyota", 2020, 20000),
                new ElectricCar("Tesla", 2021, 50000),
                new DieselTruck("Ford", 2019, 30000)
        };
        for (Vehicle  v : fleet) v.displayFull();
    }
}
