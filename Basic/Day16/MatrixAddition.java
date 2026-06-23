package Day16;

public class MatrixAddition {

    static void printMatrix(int[][] m, String label) {
        System.out.println(label + ":");
        for (int[] row : m) {
            for (int val : row) {
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        printMatrix(a, "Matrix A");
        printMatrix(b, "Matrix B");
        printMatrix(c, "Matrix C (A+B)");
    }
}
