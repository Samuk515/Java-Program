package Day38;

public class FinallyDemo {

    static String test1() {
        try{
            System.out.println("try");
            return "from try";
        } finally {
            System.out.println("finally");
            // return "from finally"; // if uncommented, overrides try's return!
        }
    }

    static String test2() {
        try {
            System.out.println("try");
            throw new RuntimeException("oops");
        } catch (RuntimeException e) {
            System.out.println("catch: " + e.getMessage());
            return "from catch";
        } finally {
            System.out.println("finally");
        }
    }
    static String test3() {
        try {
            System.out.println("try");
            throw new RuntimeException("error");
        } finally {
            System.out.println("finally - no catch! ");
            // exception still propagates after finally block
        }
    }

    public static void main(String[] args) {
        System.out.println("=== test1 ===");
        System.out.println("Result: " + test1());

        System.out.println("\n=== test2 ===");
        System.out.println("Result: " + test2());

        System.out.println("\n === test3 ===");
        try {
            test3();
        } catch (RuntimeException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}
