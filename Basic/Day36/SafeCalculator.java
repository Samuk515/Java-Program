package Day36;

public class SafeCalculator {
    double divide(double a, double b) {
 try {
     if (b == 0) throw new ArithmeticException("Divide by zero");
     return a / b;
 }catch(ArithmeticException e){
     System.out.println("divide() error: " + e.getMessage() + " return 0 ");
     return 0;
 }
    }
    int parseAndAdd(String a, String b) {
        try {
            return Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            System.out.println("parseAndAdd() error: invalid input '" + e.getMessage() + "' returning 0");
            return 0;
        }
    }

    double sqrt(double n) {
        try {
            if (n < 0 ) throw new IllegalArgumentException( "Cannot sqrt negative: " + n);
            return Math.sqrt(n);
        } catch (IllegalArgumentException e) {
            System.out.println("sqrt() error: " +e.getMessage() + " returning NaN");
            return Double.NaN;
        }
    }
    int getArrayElement(int[] arr,int idx) {
        try {
            return arr[idx];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("getElement() error: index "
            + idx + " out of bounds (length=" + arr.length + ") returning -1");
            return -1;
        }
    }

    public static void main(String[] args){
        SafeCalculator calc = new SafeCalculator();

        System.out.println("10/2   = " + calc.divide(10, 2));
        System.out.println("10/0   = " + calc.divide(10, 0));
        System.out.println("add    = " + calc.parseAndAdd("5", "3"));
        System.out.println("add err= " + calc.parseAndAdd("5", "abc"));
        System.out.println("sqrt 9 = " + calc.sqrt(9));
        System.out.println("sqrt-4 = " + calc.sqrt(-4));

        int[] arr = {10, 20, 30};
        System.out.println("arr[1] = " + calc.getArrayElement(arr, 1));
        System.out.println("arr[9] = " + calc.getArrayElement(arr, 9));
    }
}
