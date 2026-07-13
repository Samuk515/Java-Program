package Day32;

class Point {
    int x, y;

    Point(int x, int y) { this.x = x; this.y = y; }
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point) )return false;
        Point other = (Point)o;
        return this.x == other.x && this.y == other.y;
    }
    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}
public class ObjectMethodsDemo {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(1, 2);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p1.equals(p3) = " + p1.equals(p3));
        System.out.println(" Same hashCode:" + (p1.hashCode() == p2.hashCode()));
        System.out.println("p1 == p2  : " + ( p1 == p2));

        // Default Object toString(without override)
        Object raw = new Object();
        System.out.println("Default toString: " + raw);

    }
}
