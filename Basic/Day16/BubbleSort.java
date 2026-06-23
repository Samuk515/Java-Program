package Day16;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        System.out.println("Before: ");
        for (int x : arr) System.out.println(x + " ");
        System.out.println();

        // Bubble sort
        for (int i =0; i < n; i++) {
            for (int j = 0; j < n -i - 1; j++) {

                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }

            }
            System.out.println("After : ");
            for (int x : arr) System.out.println(x + " ");
            System.out.println();
        }
    }
}
