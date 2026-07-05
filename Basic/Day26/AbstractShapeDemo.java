package Day26;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
    abstract String getShapeName();

    // Concrete mehtod - uses abstract methods (polymorphism)
    void display() {
        System.out.printf("%-10s | Area: %8.3f | Perimeter: %.2f%n", getShapeName(), area(), perimeter());
    }
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    @Override double area() { return Math.PI * r * r; }
    @Override double perimeter() { return  2 * Math.PI * r; }
    @Override String getShapeName() { return "Circle"; }
}
class Rectangle extends Shape {
    double a, b;
    Rectangle(double a, double b) { this.a=a; this.b=b;}
    @Override double area() { return a * b; }
    @Override double perimeter() { return 2*(a+b);}
    @Override String getShapeName() { return "Rectangle"; }
}

class Triangle extends Shape {
    double a, b, c;
    Triangle(double a, double b, double c) { this.a=a; this.b=b; this.c=c;}
    @Override double area() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override double perimeter() { return a+ b+ c;}
    @Override String getShapeName() { return "Triangle"; }
}

public class AbstractShapeDemo {
    static void main(String[] args) {
        // Shape s = new Shape(); // COMPILE ERROR: Shape is abstract

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5)
        };
        for (Shape shape : shapes) shape.display();
    }
}
