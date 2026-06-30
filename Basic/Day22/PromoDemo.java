package Day22;

class TypePromo {
    void show(int x ) { System.out.println("int:"    + x); }
    void show (long x) { System.out.println("long:"    + x); }
    void show (double x) { System.out.println("double:"    + x); }
    void show ( Object x){ System.out.println("Object:"    + x); }
}

public class PromoDemo {
    public static void main(String[] args) {
        TypePromo t = new TypePromo();
        t.show(10); // A
        t.show(10L); //B
        t.show(10.5f); //C - no float method!
        t.show('A'); // D - no char method!
        t.show("Hello"); // E
    }

}
