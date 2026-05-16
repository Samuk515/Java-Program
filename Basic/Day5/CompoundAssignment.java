package Day5;

public class CompoundAssignment {
    static void main(String[] args) {
        double balance = 1000.0;
        System.out.println("Opening balance:" + balance);

        balance += 500;
        System.out.println("After deposit : " + balance);

        balance -= 200;
        System.out.println("After withdraw : " + balance);

        balance *= 1.06;
        balance = Math.round(balance *10.0) / 10.0;
        System.out.println("After interest : " + balance);

        balance /= 2;
        System.out.println("After split:    " + balance);

    }
}