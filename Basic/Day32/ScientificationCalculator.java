package Day32;

public class ScientificationCalculator {
    double squareRoot(double n) {
        if (n < 0) { System.out.println("Error: Cannot sqrt negative number"); return -1; }
        return Math.sqrt(n);
    }

    double power(double base, double exp) { return Math.pow(base, exp); }

    double hypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    double circleArea(double r) {
        if (r <= 0) { System.out.println("Error: Radius must be positive"); return -1; }
        return Math.PI * r * r;
    }

    int randomBetween(int min, int max) {
        if (min > max) { System.out.println("Error: min > max"); return -1; }
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    double[] quadratic(double a, double b, double c) {
        double disc = Math.pow(b, 2) - 4 * a * c;
        if (disc < 0) {
            System.out.println("No real roots (discriminant < 0)");
            return null;
        }
        double root1 = (-b + Math.sqrt(disc)) / (2 * a);
        double root2 = (-b - Math.sqrt(disc)) / (2 * a);
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        ScientificationCalculator calc = new ScientificationCalculator();

        System.out.printf("√25           = %.1f%n", calc.squareRoot(25));
        calc.squareRoot(-4); // error
        System.out.printf("2^10          = %.0f%n", calc.power(2, 10));
        System.out.printf("Hypotenuse(3,4)= %.1f%n", calc.hypotenuse(3, 4));
        System.out.printf("Circle r=7    = %.2f%n", calc.circleArea(7));
        System.out.println("Random(1-100) = " + calc.randomBetween(1, 100));

        // Quadratic: x² - 5x + 6 = 0 → roots: 3, 2
        double[] roots = calc.quadratic(1, -5, 6);
        if (roots != null)
            System.out.printf("x²-5x+6 roots = %.1f, %.1f%n", roots[0], roots[1]);

        // No real roots: x² + 1 = 0
        calc.quadratic(1, 0, 1);
    }
}
