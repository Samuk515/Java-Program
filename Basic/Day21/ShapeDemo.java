package Day21;

class Shape {
    String color;

    Shape(String color){
        this.color = color;
    }

    void display(){
        System.out.println("Shape: color=" + color);
    }
        }

        class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width){
        super(color); // pass color to shape
        this.length = length;
        this.width = width;
    }
    double area(){ return length*width;}
            void display() {
        super.display(); // prints the Shape part firs
                System.out.println("Rectangle: clor=" + super.color + ",length=" + length + ", width=" + width + ", area=" + area());
            }
        }
public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Blue", 8.0, 5.0);
        rectangle.display();
    }
}
