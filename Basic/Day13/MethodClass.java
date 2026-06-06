package Day13;

class MathHelper{
    static void printSquare(int n){
        System.out.println("Square of " + n +": " + (n*n));
    }
    static int square(int n){
        return n * n;
    }
    static  double  power(double base, int exp){
        double result = 1;
        for ( int i = 0; i <exp; i++) result *= base;
        return result;
    }

    static boolean isEven(int n){
        return n % 2 == 0;
    }
}

public class MethodClass {
    public static void main(String[] args){
        MathHelper.printSquare(6);
        System.out.println("Square returned:" + MathHelper.square(6));
        System.out.println("2.0 ^ 8 = " + MathHelper.power(2.0, 8));
        System.out.println("Is 7 even? " + MathHelper.isEven(7));
    }
}
