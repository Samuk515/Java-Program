package Day32;

class Animal { String name; Animal(String n) { name = n; } }
class Dog extends Animal { Dog(String n) { super(n); } }
class Cat extends Animal { Cat(String n) { super(n); } }

public class RuntimeTypeDemo {

    static void inspect(Object obj) {
        System.out.println("---Inspecting:" + obj + " ---");
        System.out.println("Class name  : " + obj.getClass().getName());
        System.out.println("Simple name : " + obj.getClass().getSimpleName());
        System.out.println("Is Animal?  : " + (obj instanceof Animal));
        System.out.println("Is Dog?     : " + (obj instanceof Dog));
        System.out.println("Is Cat?     : " + (obj instanceof Cat));
        System.out.println("Is Object?  : " + (obj instanceof Object)); // always true!

        Class superClass = obj.getClass().getSuperclass();
        if (superClass != null)
            System.out.println("Super class : " + superClass.getSimpleName());
        System.out.println();
    }

    public static void main(String[] args) {
        inspect(new Dog("Bruno"));
        inspect(new Cat("Whiskers"));
        inspect("Hello Java");       // String
        inspect(42);                  // Integer (autoboxed)

    }
}
