package Day5;

public class IncrementDemo {
    static void main(String[] args) {
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

        int y = 10;
        int result = y++ + ++y;
        System.out.println(result);
    }
}
