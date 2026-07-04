package day25;

public class InterviewAnswers {
    public static void main(String[] args) {

        // 1. Overloading vs Overriding
        // Overloading: same name, differnt params, same class, compile-time
        // Overriding: same name, same params, parent+child, runtime
        // Demo: see Calculator ( Day22 and Animal/Dog ( Day 22)

        //2. Can you override a static method? No.
        // Static methods are HIDDEN, not overridden. Resolved at compile time.
       // Class P  { void go;() { System.out.println("p.go"); } }
        // If child has static go(),  P ref calls P.go() even if actual type is Child.

        // 3. Not calling super() in child constructor;
        // Java automatically inserts super Sealed {} // COMPILE ERROR
        // final method cannot be overridden - compile error if attempted

        //4. final class and final method;
        final class Sealed {}
        // class Extended extends Sealed {} // COMPILE ERROR
        // final method cannot be overridden - compile error if attempted

        // 5. == vs .equals()
        String a = new String("Java");
        String b = new String("Java");
        System.out.println(a == b); // false (different references)
        System.out.println(a.equals(b)); // true (same content)

        // 6. Runtime polymorphism:
        // Parent reference hold child object. Method called depends on actual type at runtime
        class Animal { void sound()  { System.out.println(a); } }
        class Dog extends Animal { void sound() { System.out.println("Woof");} }
        Animal x = new Dog();
        x.sound(); // prints "woof" - decided at runtime

        //7. Is-A vs HAS-A:
        //IS-A = inheritance. Dog IS-A Animal | class Dog extends Animal
        // HAS-A = composition. Car HAS-A Engine | class Car { Engine e; }

        // 8. Why String is immutable:
        // Security: passwords can't be changed mid-flight
        //Thread safety: multiple thread cna read same String safely
        // String pool: same literal can be shared/reused safely
        // Hascode caching: HashMap Keys work reliably
        String s = "Hello";
        s.toUpperCase(); // Creates NEW string, s is still "Hello"
        System.out.println(s); // Hello - unchanged

    }
}
