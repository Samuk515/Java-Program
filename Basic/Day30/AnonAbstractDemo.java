package Day30;

import java.util.Arrays;

abstract class DataProcessor {
    abstract boolean validate(int[] data);
    abstract int[] transform(int[] data);

    void process(int[] data) { // concrete template method
        System.out.println("Input : " + Arrays.toString(data));
        if (!validate(data)) {
            System.out.println(" Validate FAILED");
            return;
        }
        int[] result = transform(data);
        System.out.println(" Output: " + Arrays.toString(result));
    }
}

public class AnonAbstractDemo {
    static void main() {
        int[] data = {3, 6, 2, 9, 4};

        // Anonymous 1: doubles all values
        DataProcessor doubler = new DataProcessor() {
            @Override
            boolean validate(int[] d) {
                if (d == null || d.length == 0) return false;
                for (int x : d) if (x <= 0) return false;
                return true;
            }

            @Override
            int[] transform(int[] d) {
                int[] result = new int[d.length];
                for (int i = 0; i < d.length; i++) result[i] = d[i] * 2;
                return result;
            }
        };

        // Anonymous 2: filters even numbers only
        DataProcessor evenFilter = new DataProcessor() {
            @Override
            boolean validate(int[] d) { return d != null && d.length > 0; }

            @Override
            int[] transform(int[] d) {
                int count = 0;
                for (int x : d) if (x % 2 == 0) count++;
                int[] result = new int[count];
                int i = 0;
                for (int x : d) if (x % 2 == 0) result[i++] = x;
                return result;
            }
        };

        System.out.println("=== Doubler ===");
        doubler.process(data);
        doubler.process(new int[]{1, -2, 3}); // validation fails

        System.out.println("=== Even Filter ===");
        evenFilter.process(data);
    }
}

