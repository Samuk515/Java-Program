package Day17;

import java.util.Arrays;

public class ArrayClassDemo {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9, 3, 7, 4, 6};
        System.out.println("Original : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr));

        int idx = Arrays.binarySearch(arr, 7);
        System.out.println(" Index of 7: " + idx);

        int[] filled = new int[5];
        Arrays.fill(filled, 99);
        System.out.println("Filled : " + Arrays.toString(filled));

        int[] copied = Arrays.copyOf(arr, 4);
        System.out.println("Copied : " + Arrays.toString(copied));
    }
}
