package Day24;

class Parent {
    String name = "Parent";

    String getName() { return "Parent mehtod"; }
}

class Child extends Parent {
    String name = "child"; // hides parent field

    @Override
    String getName() { return "child method"; }
}
public class FieldVsMethod {
    public static void main(String[] args) {
        Parent p = new Child();

        System.out.println(p.name);
        System.out.println(p.getName());

        Child c = new Child();
        System.out.println(c.name);
        System.out.println(c.getName());

        System.out.println(((Child)p).name);
    }
}
