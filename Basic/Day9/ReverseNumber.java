package Day9;

public class ReverseNumber {
    static void main(String[] args) {
        int num = 12345;
        int original = num;
        int reverse = 0;

        while (num > 0 ){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.print("original :" + original);
        System.out.print("reverse :" + reverse);
    }
}
