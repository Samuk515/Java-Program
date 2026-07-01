package Day23;

class Animal{ String name;  Animal(String n) { name = n;} }

class Dog extends Animal {
    Dog(String n) { super(n); }
    void bark() {
        System.out.println("Dog " + name + " says: Woof!");
    }
    static class Cat extends Animal {
        Cat(String n) { super(n); }
        void meow() {
            System.out.println("Cat " + name + " says: Meow!");
        }
    }
}

class Bird extends Animal {
    Bird(String n) { super(n); }
    void tweet() {
        System.out.println("Bird " + name + " says: Tweet!");
    }
}

public class InstanceofDemo {
    public static void main(String[] args) {
        Dog bruno = new Dog("Bruno");

        // instanceof checks
        System.out.println("Bruno is an Animal: " + (bruno instanceof Animal));
        System.out.println("Bruno is a Dog: " + (bruno instanceof Dog));

        // Mixed array
        Animal[] animals = {
                new Dog("Bruno"),
                new Dog.Cat("Whiskey"),
                new Bird("Tweety")

        };
        System.out.println("--- Processing all animals ---");
        for (Animal a : animals){
            if (a instanceof Dog){
                ((Dog)a).bark();  // safe downcast

            } else if (a instanceof Dog.Cat) {
                ((Dog.Cat)a).meow();
            } else if (a instanceof Bird) {
                ((Bird)a).tweet();

            }
        }
    }
}
