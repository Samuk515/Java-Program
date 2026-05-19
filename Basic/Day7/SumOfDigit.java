package Day7;

public class SumOfDigit {
    static void main(String[] args) {
        int num =4523;
        int original = num;
        int sum = 0;

        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Number   : " + num);
        System.out.println("Sum of digits        : " + sum);
    }
}
