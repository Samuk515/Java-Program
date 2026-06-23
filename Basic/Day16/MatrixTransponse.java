package Day16;
public class MatrixTransponse {

    static void print(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.printf("%3d", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;

        System.out.println("Original:");
        print(matrix);

        // In-place transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp       = matrix[i][j];
                matrix[i][j]   = matrix[j][i];
                matrix[j][i]   = temp;
            }
        }

        System.out.println("Transposed:");
        print(matrix);
    }
}
