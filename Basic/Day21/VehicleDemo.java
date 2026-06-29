package Day21;

class Vehicle{
    String brand;
    int speed;

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void move(){
        System.out.println(brand + " is moving at " + speed + "km/h");
    }
}
 class Car extends Vehicle {
    int doors;
    Car(String brand, int speed, int doors){
        super(brand, speed);
        this.doors = doors;
    }
    void honk() { System.out.println(brand + ": Beep Beep!"); }
 }

 class ElectricCar extends Car{
    int batteryRange;

    ElectricCar(String brand, int speed, int doors, int batteryRange){
        super(brand, speed, doors);
        this.batteryRange = batteryRange;
    }
    void charge(){
        System.out.println(brand + " is charging. Battery range: " + batteryRange + "km");
    }
    void display(){
        System.out.println("Doors: " + doors + " | Battery: " + batteryRange + "km");
    }
 }
public class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 200, 4, 500);
        tesla.move(); // form vehicle
        tesla.honk(); //from Car
        tesla.charge(); //own method
        tesla.display();
    }
}
