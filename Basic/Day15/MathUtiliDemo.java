package Day15;

class MathUtilis{
    static int abs(int n){
        return n < 0 ? -n : n;
    }

    static int clamp(int val, int min, int max){
        if(val < min) return min;
        if(val > max) return max;
        return val;
    }

    static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i < n; i++){
            if (n % i == 0) sum += i;

        }
        return sum == n;
    }
        static int digitCount(int n){
            if ( n == 0) return 1;
            int count = 0;
            n = abs(n);
            while (n > 0){count++; n /= 10;}
            return count;


    }
}

public class MathUtiliDemo {
    static void
    main(String[] args) {
        System.out.println("abs(-42)   = " + MathUtilis.abs(-42));
        System.out.println("clamp(150,0,100)=" +MathUtilis.clamp(150,0,100));
        System.out.println("isPerfect(28)   =" +MathUtilis.isPerfect(28));
        System.out.println("digitCount(4523)=" +MathUtilis.digitCount(4523));
    }
}
