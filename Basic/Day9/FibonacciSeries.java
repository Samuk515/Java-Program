package Day9;

public class FibonacciSeries {
    static void main(String[] args) {
        int a= 0, b = 1;
        System.out.println("Fibonacci series:");
        for (int i=0; i<10; i++){
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
        int[] checks = {13, 20};
        for (int check : checks) {
        int x = 0, y =1;
        boolean found = false;
        while (x <= check){
            if (x == check){ found = true; break; }
            int z = x + y;
            x = y;
            y = z;
        }
            System.out.println("Is " + check + " a Fibonacci number?" + (found ? "Yes" : "No"));

        }
    }
}
