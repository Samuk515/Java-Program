package Day10;

public class GCDandLCM {
    static void main(String[] args) {
        int a = 48, b= 18;
        int origA = a, origB = b;
        while (b !=0){
            int temp = b;
            b = a% b;
            a = temp;
        }
        int gdb = a;
        int lcm = (origA * origB)/ gdb;

        System.out.println("a =" + origA + " b= " +origB);
        System.out.println("gdb =" + gdb);
        System.out.println("lcm =" + lcm);
    }
}
