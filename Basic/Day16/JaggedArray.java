package Day16;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] marks = new int[3][];
        marks[0] = new int[]{85, 90, 78};
        marks[1] = new int[]{72, 88, 65, 91};
        marks[2] = new int[]{95, 82};

        int topStudent = 0;
        double topAvg   = 0;

        for (int i = 0; i <marks.length ; i++) {
            int total = 0;
            System.out.println("Student " + i + ": ");
            for (int m : marks[i]) {
                System.out.println(m + " ");
                total += m;
            }
            double avg = (double) total / marks[i].length;
            System.out.printf("| Total: %d | Avg: %.2f%n", total, avg);
            if (avg > topAvg) { topAvg = avg;  topStudent = i; }
        }
        System.out.printf("Top student: Student %d (Avg: %.2f)%n" ,topStudent, topAvg);
    }
}
