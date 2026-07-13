package Day32;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("=== Math Class Methods ===");
        System.out.println("abs(-42)       = " + Math.abs(-42));
        System.out.println("max(18,25)     = " + Math.max(18, 25));
        System.out.println("min(18,25)     = " + Math.min(18, 25));
        System.out.println("pow(2,10)      = " + Math.pow(2, 10));
        System.out.println("sqrt(144)      = " + Math.sqrt(144));
        System.out.println("cbrt(27)       = " + Math.cbrt(27));
        System.out.println("ceil(4.2)      = " + Math.ceil(4.2));
        System.out.println("floor(4.9)     = " + Math.floor(4.9));
        System.out.println("round(4.5)     = " + Math.round(4.5));
        System.out.println("round(4.4)     = " + Math.round(4.4));
        System.out.println("log(E)         = " + Math.log(Math.E));
        System.out.println("log10(1000)    = " + Math.log10(1000));
        System.out.printf("PI             = %.5f%n", Math.PI);
        System.out.printf("random(0-100)  = %.2f%n", Math.random() * 100);

        // Dice simulation
        System.out.println("\n=== Dice Roll Simulation (5 rounds) ===");
        for (int i = 1; i <= 5; i++) {
            int die1 = (int)(Math.random() * 6) + 1;
            int die2 = (int)(Math.random() * 6) + 1;
            System.out.println("Round " + i + ": " + die1 + " + " + die2 + " = " + (die1 + die2)
                    + (die1 + die2 == 12 ? " JACKPOT!" : ""));
        }
    }
    }

