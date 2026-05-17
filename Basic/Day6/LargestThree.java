package Day6;

public class LargestThree {
    public static void main(String[] args) {
        int a = 45, b = 78, c = 23;
        System.out.println("Numbers are: " + a + ", " + b + ", " + c);
        if ( a>= b && a>= c ) {
            System.out.println("largest:" + a);
        } else if (b >= a && b >= c ) {
            System.out.println("largest:" + b);
        } else {
            System.out.println("largest:" + c);
        }

        }
    }

