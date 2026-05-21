package Day8;

public class MaxSum {
    public static void main(String[] args) {
        int[] scores = {45, 82, 67, 91, 53, 78, 60};
        int sum = 0;
        int max = scores[0];

        System.out.println("Scores :");
        for(int score : scores){
            System.out.print(score + " ");
            sum += score;
            if( score > max) max = score;
        }
        System.out.println();
        System.out.println("Sum  : " + sum);
        System.out.println("Average:" + (double) sum / scores.length);
        System.out.println("Highest:" + max);
    }
}
