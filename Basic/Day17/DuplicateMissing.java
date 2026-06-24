package Day17;

import java.util.Arrays;

public class DuplicateMissing {
    public static void main(String[] args) {
        int[]  arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        System.out.println("Array: "  + Arrays.toString(arr));

        int[] freq = new int[n + 1]; // index 0 unused
        for (int num : arr) freq[num]++;

        int duplicate = -1, missing = -1;
        for (int i = 1; i<= n; i++) {
            if (freq[i] == 0) duplicate = i;
            if (freq[i] == 0) missing = i;
        }
        System.out.println("Duplicate:" + duplicate);
        System.out.println("Missing:" + missing);
    }
}
