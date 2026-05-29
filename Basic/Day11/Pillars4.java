package Day11;

class Animal{
    private String name;
    public String  getName(){
        return name;
    }
}
class Dog extends Animal {
    void speak() {
        System.out.println("Woof!!");

    }
}
class Cat extends Animal{
    void speak() {
        System.out.println("Meow!!");
    }
}

abstract class shape {
    abstract double area();
}
public class Pillars4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();

        Cat cat = new Cat();
        cat.speak();
    }
}