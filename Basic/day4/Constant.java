package day4;

public class Constant {
    static void main(String[] args) {
        final double PI = 3.4159;
        final int Radius = 7;
        double area = PI * Radius * Radius;
        double circumference = 2 *PI * Radius;
        System.out.println("Radius:" +Radius);
        System.out.println("Area:" +area);
        System.out.println("Circumference:" +circumference);
    }
}
