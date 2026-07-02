package Day24;

class A {
 void show() { System.out.println("A"); }
    static void dispaly() { System.out.println("static A"); }
}
class B extends A {
    @Override
    void show() { System.out.println("B"); }
    static void dispaly() { System.out.println("static B"); }
}
class C extends B {
    @Override
    void show() { System.out.println("C"); }
}

public class BindingTest {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        C obj4 = new C();

        obj1.show();
        obj2.show();
        obj3.show();
        obj4.show();

        obj1.dispaly();
        obj2.dispaly();
        obj3.dispaly();
    }
}
