package Day8;

public class Labeled {
    static void main(String[] args) {
        int [][] matraix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int target = 7;
        System.out.println("Searching...");

        outer:
        for (int i = 0; i < matraix.length; i++){
            for (int j = 0; j < matraix[i].length; j++){
                if (matraix[i][j] == target){
                    System.out.println("Found " + target + " at position (" + i + ", " + j + ")");
                    break outer;
                }
            }
        }
    }
}
