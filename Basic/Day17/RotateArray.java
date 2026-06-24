package Day17;

import java.util.Arrays;

public class RotateArray {

    static int[] rotateleft(int[] arr, int k){
        int n = arr.length;
        k = k % n; // handle k>n
        int[] result = new int[n];
        System.arraycopy(arr, k, result, 0, n-k); //second part
        System.arraycopy(arr, 0, result, n-k, k); //first part
        return result;
    }
    static int[] rotateRight(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] result = new int[n];
        System.arraycopy(arr, n-k, result, 0, k); // last k element
        System.arraycopy(arr, 0, result, k, n-k); // rest
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        System.out.println("Orginal      : " + Arrays.toString(arr));
        System.out.println("Left rotate " + k + " : " + Arrays.toString(rotateRight(arr, k)));
        System.out.println("Right rotate " + k + " : " + Arrays.toString(rotateleft(arr, k)));
    }
}
