package Day12;
class Rectangle {
    double length;
    double width;

    double area(){return length * width;}
    double perimeter() {return 2 * (length + width);}
    boolean  isSquare(){ return length == width; }

    void display (String label){
        System.out.println(label + ": " + length + " x " + width
        + " | Area: " +area()
        + " | Perimeter: " + perimeter()
        + " | Square:" + isSquare());
    }
}

public class RectangleClass {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 8.0; r1.width = 5.0;

        Rectangle r2 = new Rectangle();
        r2.length = 6.0; r2.width = 6.0;

        r1.display("Rectangle 1");
        r2.display("Rectangle 2");

        if (r1.area() > r2.area()){
            System.out.println("Larger area: Rectangle 1");
        } else {
            System.out.println("Larger area: Rectangle 2");
        }
    }
}
