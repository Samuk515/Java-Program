package Day9;

public class palindrome {
    static void main(String[] args) {
        int num = 1221;
        int original = num;
        int reversed = 0;

        while(num > 0){
            reversed = reversed * 10 +(num % 10);
            num /=10;
        }
        if (original == reversed){
            System.out.println(original +  "is a Palindrome");

        } else {
            System.out.println(original +  "is not a Plindrome");
        }
    }
}
