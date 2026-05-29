package Day11;
class DemoCar{
    String brand;
    String color;
    int speed;
     void displayInfo(){
        System.out.println("Brand: " + brand + " Color: " + color + " Speed: " + speed + "km/h");
    }

    void accelerate( int amount){
         speed += amount;
     }
     boolean isFast(){
         return speed > 150;
     }
}

public class Methods {
    public static void main(String[] args) {
    DemoCar car = new DemoCar();
    car.brand = "BMW";
    car.color = "Black";
    car.speed = 130;

    car.displayInfo();
        System.out.println("Accellerating by 50...");
        car.accelerate(50);
        car.displayInfo();
        System.out.println("Is fast? " + car.isFast());
    }
}
