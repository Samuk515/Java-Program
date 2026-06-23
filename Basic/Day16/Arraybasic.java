package Day16;

public class Arraybasic {
    static void main(String[] args) {
        int[] nums = {10, 25, 3, 78, 44, 61, 9};

        // Forward
        System.out.println("Forward : ");
        for(int n : nums) System.out.println(n + " ");
        System.out.println();

        //Backward
        System.out.println("Backward : ");
        for (int n : nums) System.out.println(n + " ");
        System.out.println();

        //Search
        int target = 44, foundIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) { foundIdx = i; break;  }
        }
        if (foundIdx >= 0) System.out.println(target + " found at index: " + foundIdx);
        else System.out.println(target + " not found");

        //second largest
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > max) { second = max; max = n; }
            else if (n > second && n != max) second = n;
        }
        System.out.println("Second largest:" + second);
    }

}
