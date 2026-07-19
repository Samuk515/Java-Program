package Day34;

enum Planet {
    MERCURY(3.30e+23, 2.4397e6),
    VENUS(4.87e+24, 6.0518e6),
    EARTH(5.97e+24, 6.3781e6),
    MARS(6.42e+23, 3.3972e6),
    JUPITER(1.90e+27, 7.1492e7),
    SATURN(5.68e+26, 6.0268e7),
    URANUS(8.68e+25, 2.5559e7),
    NEPTUNE(1.02e+26, 2.4746e7);

    private final double mass; // kg
    private final double radius;
    static final double G = 6.67300E-11;
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    double surfaceGravity() {
        return G * mass /  (radius * radius);
    }
    double surfaceWeight( double earthWeight){
        // earthWeight / earthGravity * thisGravity
        return earthWeight / EARTH.surfaceGravity() * surfaceGravity();
    }
}

public class PlanetDemo {
    public static void main(String[] args) {
        double earthWeight = 75.0;

        System.out.printf("Earth weight : %.1f kg%n", earthWeight);
        System.out.println("---- Weight on each planet -----");
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %-8s: %.1f kg%n", p, p.surfaceWeight(earthWeight));
        }
        // Enum utility methods
        System.out.println("\n=== Enum utilities ===");
        Planet mars = Planet.valueOf("MARS");
        System.out.println("valueOf('MARS'): " + mars);
        System.out.println("ordinal(): " + mars.ordinal());  // position 0-based
        System.out.println("name()   : " + mars.name());


    }
}
