package Day10;

import org.w3c.dom.ls.LSOutput;

public class NoToWords {
    static void main(String[] args) {
        int num = 746;
        int temp = num;
        int[] digits = new int[10];
        int count = 0;
        while (temp > 0){
            digits[count++] = temp %10;
            temp /= 10;
        }
        System.out.println(num + " -");
        for (int i = count -1; i >=0; i--){
            switch (digits[i]){
                case 0: System.out.println("Zero "); break;
                case 1: System.out.println("One "); break;
                case 2: System.out.println("Two "); break;
                case 3: System.out.println("Three "); break;
                case 4: System.out.println("Four "); break;
                case 5: System.out.println("Five "); break;
                case 6: System.out.println("Six "); break;
                case 7: System.out.println("Seven "); break;
                case 8: System.out.println("Eight "); break;
                case 9: System.out.println("Nine "); break;
            }
        }
        System.out.println();
    }

}
