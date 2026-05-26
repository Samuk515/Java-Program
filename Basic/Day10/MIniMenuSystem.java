package Day10;

public class MIniMenuSystem {
    public static void main(String[] args) {
        int[] choices = {1, 3, 2, 4};
        int[] numsA   = {10, 9, 20, 0};
        int[] numsB   = {5,  3,  4, 0};

        for (int i = 0; i < choices.length; i++) {
            int a = numsA[i], b = numsB[i];

            switch (choices[i]) {
                case 1:
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case 3:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    i = choices.length; // force loop to end
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

