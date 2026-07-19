package Day34;

public class TowerOfHanoi {
    static  int moveCount = 0;

    static void hanoi(int n, char from, char to, char via) {
        if (n <= 0) {
            return;
        }
        if (n == 1) {
            System.out.println("Move disk 1: " + from + " -> " + to);
            moveCount++;
            return;
        }
        hanoi(n - 1, from, via, to); // step 1: move n-1 disks to helper
        System.out.println("Move disk " + n + ": " + from + " -> " + to); // step 2: move nth disk to target
        moveCount++;
        hanoi(n - 1, via, to, from); // step 3: move n-1 disks from helper to target
    }
 public static void main(String[] args){
        int n = 3;
     System.out.println("=== Tower of Hanoi: " + n + " disks ===");
     moveCount = 0;
     hanoi(n, 'A', 'B', 'C');
     System.out.println("Total moves: " + moveCount + " (=2^" + n + "-1 = " + (int)(Math.pow(2, n) - 1) + ")");

     //show pattern: moves = 2^n-1
     System.out.println("\n === Move counts by disk count ===");
     for (int i = 0; i <= 5; i++) {
         moveCount = 0;
         hanoi(i, 'A', 'B', 'C');
         System.out.println("n = " + i + ", moves = " + moveCount);
     }
 }
}
