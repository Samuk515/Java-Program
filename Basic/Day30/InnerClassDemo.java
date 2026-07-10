package Day30;

class Car {
    private String brand;
    private int speed;

    Car(String brand) {
        this.brand  = brand;
        this.speed = 0;
    }
    // Member inner class
    class Engine {
        int horsePower;
        Engine(int horsePower) { this.horsePower = horsePower; }
        
        void start(){
            //directly accesses outer class private field 'brand'
            System.out.println(brand + " engine started. HP:" + horsePower);
        }
        
        void accelerate(int amount) {
            speed +=amount; //directly modifies outer class private field 'speed'
            System.out.println(brand + " accelerating... speed: "+ speed + " km/h");
            
        }
    }
    void display(){
        System.out.println(brand + " | Speed: " + speed + " km/h");
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        
        //Create inner class instance - must use outer object
        Car.Engine engine = car.new Engine(3000);

        engine.start();
        engine.accelerate(60);
        engine.accelerate(40);
       car.display();
    }
}
