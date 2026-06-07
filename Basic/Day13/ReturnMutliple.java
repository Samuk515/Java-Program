package Day13;


public class ReturnMutliple {

    static int[] minMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new int[]{min, max};
    }

    static double[] statistics(int[] arr) {
        int sum = 0;
        int min = arr[0], max = arr[0];
        for (int n : arr) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = (double) sum / arr.length;
        double range = max - min;
        return new double[]{sum, avg, range};
    }

    public static void main(String [] args) {
        int[] data = {3, 97, 42, 15, 68, 29, 87};

        int[] mm = minMax(data);
        System.out.println("Min: " + mm[0] + ", Max: " + mm[1]);

        double[] stats = statistics(data);
        System.out.println("Sum: " + stats[0] + ", Avg: " + stats[1] + ", Range:" + stats[2]);
    }
}