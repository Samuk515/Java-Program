package Day24;

import java.util.Arrays;
import java.util.Scanner;

class Printer {
    void print( int n) { System.out.println("Integer: " + n); }
    void print(double d) { System.out.println("Decimal: " + d); }
    void print(String s) { System.out.println("String: " + s); }
    void print(int[] arr) { System.out.println("Array: " + Arrays.toString(arr)); }
    void print(Object o) { System.out.println("Object: " + o.toString()); }
}
public class PrinterDemo {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(42);
        p.print(3.14);
        p.print("Hello");
        p.print(true);
        p.print(new int[] {1,2,3});
        p.print(new StringBuilder("Hi"));
    }
}
