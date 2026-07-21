package Day36;

public class ExceptionHierarchy {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Args count: " + args.length);
        }

        // Print the hierarchy
        System.out.println("=== Java Exception Hierarchy ===");
        System.out.println("Throwable");
        System.out.println("├── Error (unchecked — serious JVM problems)");
        System.out.println("│   ├── OutOfMemoryError");
        System.out.println("│   └── StackOverflowError");
        System.out.println("└── Exception");
        System.out.println("    ├── RuntimeException (UNCHECKED — optional to catch)");
        System.out.println("    │   ├── NullPointerException");
        System.out.println("    │   ├── ArithmeticException");
        System.out.println("    │   ├── NumberFormatException");
        System.out.println("    │   ├── ArrayIndexOutOfBoundsException");
        System.out.println("    │   └── ClassCastException");
        System.out.println("    └── CHECKED Exceptions (compiler forces you to handle)");
        System.out.println("        ├── IOException");
        System.out.println("        ├── FileNotFoundException");
        System.out.println("        └── SQLException");

        // Catching with parent catches children
        System.out.println("\n=== Catching parent catches children ===");

        // 1. Catch specific
        try { throw new ArithmeticException("/ by zero"); }
        catch (ArithmeticException e) { System.out.println("Specific: " + e.getClass().getSimpleName()); }

        // 2. Catch RuntimeException (parent) catches ArithmeticException (child)
        try { throw new ArithmeticException("/ by zero"); }
        catch (RuntimeException e) { System.out.println("Parent: " + e.getClass().getSimpleName()); }

        //3. Catch Exception (grandparent) catches everything
        try { throw new NullPointerException("demo"); }
        catch (Exception e) { System.out.println("Grandparent: " + e.getClass().getSimpleName()); }

        // Prove checked: this would FAIL to compile without try-catch
        try {
            throw new java.io.IOException("File not found"); // checked _ MUST handle
        } catch (java.io.IOException e) {
            System.out.println("Checked IOException caught: " + e.getMessage());
        }


    }
}
