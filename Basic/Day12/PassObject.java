package Day12;

class Circle {
    double radius;
    double area() { return Math.PI * radius * radius; }
    void display(String label) {
        System.out.printf("%s radius: %.1f  Area: %.2f%n", label, radius, area());
    }
}


public class PassObject {
    static void printComparison(Circle c1, Circle c2){
        if ( c1.area() > c2.area()) System.out.println("Circle 1 is larger");
        else if ( c2.area() > c1.area()) System.out.println("Circle 2 is larger");
        else System.out.println("Both are equal");
    }
    static void scaleUp(Circle c, double factor){
        c.radius = c.radius * factor;
    }

    static void main(String[] args) {
        Circle c1 = new Circle(); c1.radius = 5.0;
        Circle c2 = new Circle(); c2.radius = 3.0;

        c1.display("Circle 1");
        c2.display("Circle 2");
        printComparison(c1, c2);

        scaleUp(c2, 3.0);
        System.out.println("After scaling Circle 2 by 3.0x: radius = " + c2.radius);
        printComparison(c1, c2);
    }
}
