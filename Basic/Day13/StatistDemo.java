package Day13;

class Statistics {
    static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }
    static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }
    static int max(int[] arr) {
        int m = arr[0];
        for ( int n : arr) if (n > m) m = n;
        return m;
    }
    static int min( int[] arr){
        int m = arr[0];
        for (int n : arr) if (n < m) m = n;
        return m;
    }

    static void printAll(int[] arr){
        System.out.print("Data  :");
        for (int n  : arr) System.out.print( n + " ");
        System.out.println();
        System.out.println(" Sum   :" + sum(arr));
        System.out.println("Average :" + average(arr));
        System.out.println("Max   :" + max(arr));
        System.out.println("Min   :" + min(arr));
    }
}

public class StatistDemo {
    public static void main(String[] args) {
        int[] data = { 12, 45, 7, 89, 34, 56, 23};
        Statistics.printAll(data);
    }
}
