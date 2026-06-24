package Day17;

import java.util.Arrays;

public class ArraysOps {
    public static void main(String[] args) {
        int[] scores = {45, 82, 91, 67, 55, 78, 88, 60};

        //copyOfRange
        int[] slice = Arrays.copyOfRange(scores, 2, 5);
        System.out.println("Slice [2..5]  : " + Arrays.toString(slice));

        //equals
        int[] a = { 1, 2, 3}, b ={1, 2, 3}, c = {1, 2,4};
        System.out.println("[1, 2, 3]==[1,2,3]: " + Arrays.equals(a, b));
        System.out.println("[1,2,3]==[1,2,4]: ]" + Arrays.equals(a, c));

        //Sort descending
        Arrays.sort(scores);
        int left = 0, right = scores.length - 1;
        while (left < right) {
            int temp = scores[left];
            scores[left] = scores[right];
            scores[right] = temp;
            left++;
        }
        System.out.println("Descending: " + Arrays.toString(scores));
    }
}
