package Day2;

public class SwapTwoNumber2 {
    static void main(String[] args) {
       int x = 5;
       int y = 10;
        System.out.println("Before: x=" + x + ", y=" + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After: x=" + x + ", y=" + y);
    }
}
