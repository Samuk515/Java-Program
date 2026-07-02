package Day24;

class Shape{
    double area() { return 0; }
    double perimeter() { return 0; }
    String name() { return "Shape";}
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r;}
    @Override double area()  { return Math.PI*r*r;}
    @Override double perimeter()  { return 2*Math.PI*r;}
    @Override String name()  { return "Circle r=" + r;}
}
class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w;}
    @Override double area()  { return l*w; }
    @Override double perimeter()  { return 2*(l + w); }
    @Override String name()  { return "Rectangle l=" + l + " w=" + w; }
}
class Triangle extends Shape {
    double a, b, c;
    Triangle(double a, double b, double c) { this.a = a; this.b = b; this.c = c;}
    @Override double area()  {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override double perimeter()  { return a+b+c; }
    @Override String name()  { return "Triangle"  + a + " , " + b + " , " + c ; }
}

public class ShapeDemo {
     static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape s : shapes) sum += s.area(); //polymorphism
        return sum;
    }

    public static void main(String[] args) {
         Shape[] shapes = { new Circle(5), new Rectangle(4, 6), new Triangle(4, 6, 7) };

         for (Shape s : shapes) {
             System.out.printf("%-18s: area=%-8.2f perimeter=%-8.2f\n", s.name(), s.area(), s.perimeter());
         }
        System.out.printf("Total area: %.2f%n", totalArea(shapes));
    }
}
