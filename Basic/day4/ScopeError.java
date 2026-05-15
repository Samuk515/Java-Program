package day4;

public class ScopeError {
    public static void main(String[] args) {
        int x = 10;
        int y = 20; // moved outside the block

        System.out.println("Outside: x = " + x);
        {
            System.out.println("Inside block: x = " + x + ", y = " + y);
        }
        System.out.println("Outside: x = " + x);
    }

}
