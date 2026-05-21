package Day8;

public class Negative {
    static void main(String[] args) {
        int[]  nums = {4, 7, 2, -3, 9, -1, 5};
        int firstNeg = 0;
        int count = 0;

        System.out.println("Checking:" );
        for( int i=0; i<nums.length; i++ ){
            System.out.println(nums[i] + " ");
            count++;
            if (nums[i]<0){
                firstNeg = nums[i];
                break;
            }
            System.out.println();
            System.out.println("First negative number: " + firstNeg);
            System.out.println("Checked" +count + "numbers before stopping");
        }
    }

}
