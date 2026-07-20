package Day35;

class Base {
    String type = "Base";
    void show()   { System.out.println("Base.show: " + type); }
    void display(){ System.out.println("Base.display"); }
    static void stat() { System.out.println("Base.stat"); }
}

class Child extends Base {
    String type = "Child"; // hides Base.type
    @Override
    void show()  { System.out.println("Child.show: " + type); }
    static void stat() { System.out.println("Child.stat"); }
}

class GrandChild extends Child {
    @Override
    void show()  { System.out.println("GrandChild.show"); super.show(); }
}

public class DispatchTest {
    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Child();
        Base b3 = new GrandChild();
        Child c1 = new GrandChild();

        b1.show();          // 1
        b2.show();          // 2
        b3.show();          // 3
        c1.show();          // 4
        b1.display();       // 5
        b2.display();       // 6 — inherited, not overridden

        b1.stat();          // 7
        b2.stat();          // 8 — static: reference type wins

        System.out.println(b2.type);    // 9 — field: reference type wins
        System.out.println(((Child)b2).type); // 10
    }
}