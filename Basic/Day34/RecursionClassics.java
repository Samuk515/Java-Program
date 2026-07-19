package Day34;

import java.sql.SQLOutput;

public class RecursionClassics {

    static long factorial(int n) {
        if (n <= 1) return 1; // base case
        return n * factorial(n - 1); // recursive case
    }

    static int fibonacci(int n) {
        if ( n <= 1 ) return n;  // base case: fib(0) =0, fib(1)=1
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static double power(double base, int exp ) {
        if (exp == 0) return 1; // base case: anything^0 = 1
        if (exp < 0 ) return 1.0 /power(base, -exp); //handle negative
        return base * power(base, exp -1 );
    }
    //Trace version of factorial
    static long factorialTrace(int n, String indent){
        System.out.print(indent + "factorial(" + n + ") called");
        if (n <= 1) {
            System.out.println(indent + " returns 1 (base case)");
            return 1;
        }
        long result = n * factorialTrace(n - 1, indent + " ");
        System.out.println(indent + " returns " + result);
        return result;
    }
   public static void main(String[] args) {
       System.out.println("factorial(10) = " + factorial(10));
       System.out.println("fibonacci(10) = " + fibonacci(10));
       System.out.println("power(2,8) = " + power(2, 8));
       System.out.println(" power(2,-3) = " + power(2, -3));

       System.out.println("\n=== factorial(4) trace ===");
       factorialTrace(4, "");
   }

}
