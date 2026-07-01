package Day23;

class Vehicle { String brand; Vehicle(String b) { brand = b; } }
class Car  extends Vehicle {
    Car(String b) {
        super(b);
    }

    void drive() { System.out.println(brand + ": Driving"); } }
class Bike extends Vehicle {
    Bike(String b) {
        super(b);
    }

    void ride()  { System.out.println(brand + ": Riding");  } }

public class CastDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota");   // UPCAST: Car → Vehicle (automatic, always safe)
        Vehicle v2 = new Bike("Honda");   // UPCAST: Bike → Vehicle (automatic, always safe)

        // Downcast A — SAFE: v1 actually IS a Car
        Car c = (Car) v1;
        c.drive(); // Toyota: Driving

        // Downcast B — FIXED with instanceof check
        if (v2 instanceof Car) {
            ((Car) v2).drive();
        } else {
            System.out.println(v2.brand + " is a " + v2.getClass().getSimpleName()
                    + ", not a Car — cannot drive!");
        }

        // Safe downcast of v2 to Bike
        if (v2 instanceof Bike) {
            ((Bike) v2).ride(); // Honda: Riding
        }
    }
}
