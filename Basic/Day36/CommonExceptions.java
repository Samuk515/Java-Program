package Day36;

public class CommonExceptions {
    public static void main(String[] args) {
        // 1. ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        // 2. NullPointerException
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        // 3. NumberFormatException
        try {
            int x = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        // 4. ArithmeticException
        try {
            int result = 10 / 0 ;
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        // 5. ClassCastException
        try {
            Object o = "text";
            Integer i = (Integer) o;
        } catch (ClassCastException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        System.out.println("Program continues normally after all exceptions!");
    }
}
