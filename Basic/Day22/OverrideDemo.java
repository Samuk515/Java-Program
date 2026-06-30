package Day22;

class Animal {
    String name;
    Animal(String name) { this.name = name;}

    void makeSound() { System.out.println(name + " sound:...."); }
    void describe() { System.out.println("I am a animal named" + name); }
}
class Dog extends Animal {
    Dog(String name) { super(name); }

    @Override
    void makeSound() { System.out.println(name + " sound: Woof!"); }

    @Override
    void describe() { System.out.println( name +" is a loyal dog."); }
}
class Cat extends Animal {
    Cat(String name) { super(name); }

    @Override
    void makeSound() { System.out.println(name + " sound: Meow!"); }

    @Override
    void describe() { System.out.println( name +" is an independent Cat."); }
}

class Bird extends Animal {
    Bird(String name) { super(name); }

    @Override
    void makeSound() { System.out.println(name + " sound: Tweet!"); }

    @Override
    void describe() { System.out.println( name +" is a singing bird."); }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("Generic"),
                new Dog("Bruno"),
                new Cat("Suri"),
                new Bird("Donald")
        };
        for (Animal animal : animals) {
            animal.makeSound(); // calls correct version for each!
            animal.describe();
            System.out.println();
        }
    }
}
