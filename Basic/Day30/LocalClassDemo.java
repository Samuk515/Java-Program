package Day30;

class MathOperations{
    void compute(int[] numbers) {
        // Local inner class - only visible inside this method
        class Stats {
            int sum() {
                int total = 0;
                for (int n : numbers) total += n; // accesses method parameter
                return total;
            }

            double avg() { return  (double) sum() / numbers.length; }

            int max() {
                int m = numbers[0];
                for (int n : numbers) if (n > m) m = n;
                return m;
            }
            int min() {
                int m = numbers[0];
                for (int n : numbers) if (n < m) m = n;
                return m;
            }
        }

        //Create and use the local class
        Stats stats = new Stats();
        System.out.println("=== Statistics ===");
        System.out.println("Data: " + java.util.Arrays.toString(numbers));
        System.out.println("Sum: " + stats.sum()
        + " | Avg: " + stats.avg()
        + " | Max : " + stats.max()
        + " | Min: " + stats.min());
    }
}

public class LocalClassDemo {
    public static void main(String[] args) {
        MathOperations ops = new MathOperations();
        ops.compute(new int[] {12, 45, 7, 89, 34, 56, 23});
        ops.compute(new int[] {100, 200, 300});
    }
}
