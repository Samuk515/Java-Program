package Day27;

abstract class Bird {
    String name;
    Bird(String name) { this.name = name;}
    void eat()  { System.out.println( name + "is eating");}
    void breathe()  { System.out.println( name + "is breathing");}
    abstract void makeSound();
}
 interface Flyable {
    double MAX_ALTITUDE = 10000; // public static final implicitly
    void fly();
 }

    interface Swimmable {
    void swim();
    }
 class Eagle extends Bird implements Flyable {
    Eagle(String name) { super(name); }
     @Override public void fly() { System.out.println( name + "soars up to " + MAX_ALTITUDE + "m");}
     @Override public void makeSound() { System.out.println( name + ":  Screech!");}
 }

 class Penguin extends Bird implements Swimmable {
    Penguin(String name) { super(name); }
     @Override public void swim() { System.out.println( name + "is swimming");}
     @Override public void makeSound() { System.out.println( name + ":  Squawk!");}
 }

 class Duck extends Bird implements  Flyable, Swimmable {
    Duck(String name) { super(name); }
     @Override public void swim() { System.out.println( name + "paddles around");}
     @Override public void makeSound() { System.out.println( name + ":  Quack!");}
     @Override public void fly() { System.out.println( name + "flies low");}
 }
public class BirdDemo {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle("Majestic Eagle"), new Penguin("Cute Penguin"), new Duck("Funny Duck")};

        for (Bird b : birds) {
            b.eat();
            b.makeSound();
            if (b instanceof Flyable) ((Flyable) b).fly();
            if (b instanceof Swimmable) ((Swimmable) b).swim();
            System.out.println();
        }
    }
}