package Day6;

public class OddEven {
      static void main(String[] args) {
       int num = 27;
       if( num % 2 == 0) {
           System.out.println(num + " is Even");
       } else {
           System.out.println(num + " is Odd");

       }
       if ( num > 0) {
           System.out.println(num + " is Positive");
       }else if ( num < 0) {
           System.out.println(num + " is Negative");
       } else {
           System.out.println(num + " is Zero");
       }
    }
}
