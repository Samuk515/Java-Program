package Day33;

public class ParseDemo {
    static void parseInput(String input) {
        System.out.print("Parsing \"" + input + "\" → ");
        try {
            int val = Integer.parseInt(input);
            System.out.println("int: " + val);
            return;
        } catch (NumberFormatException e) {
            // try other types
        }

        try {
            double val = Double.parseDouble(input);
            // Only reach here if it's a decimal
            if (input.contains(".")) {
                System.out.println("double: " + val);
                return;
            }
        } catch (NumberFormatException e) { }

        try {
            long val = Long.parseLong(input);
            System.out.println("Error: too large for int, use Long: " + val);
            return;
        } catch (NumberFormatException e) { }

        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            System.out.println("boolean: " + Boolean.parseBoolean(input));
            return;
        }

        System.out.println("Error: not a valid number");
    }
    public static void main(String[] args) {
        parseInput("42");
        parseInput("3.14");
        parseInput("true");
        parseInput("abc");
        parseInput("999999999999");

        // Number to String
        System.out.println("\n=== Number → String ===");
        System.out.println(String.valueOf(42));        // "42"
        System.out.println(Integer.toString(255, 16)); // "ff" (hex)
        System.out.println("" + 3.14);                // concatenation trick
        System.out.println(Double.toString(3.14));
    }
}


