package Day21;

class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void eat()   { System.out.println(name + " is eating..."); }
    void sleep() {System.out.println(name + " is sleeping...");}

    void display() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}
class Dog extends Animal {
    String breed;
    Dog(String name, int age, String breed) {
        super(name, age); //call Animal's constructor
        this.breed = breed;
    }
    void bark() { System.out.println(name+ " says: Woof! Woof!");}

    void display(){ //extends parent dispaly
        System.out.println("Name: " + name + " | Age: " + age + " | Breed: " + breed);
         }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno", 3, "Labrador");
        d.display();
        d.bark();
        d.sleep();
        d.eat();
    }
}
