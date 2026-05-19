package Day7;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        if( num <2){
            isPrime = false;
        }else{
            for( int i=2; i<num; i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is  a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        System.out.println("Prime from 1 to 30:");
        for(int n=2; n<=30; n++){
            boolean prime = true;
            for(int i=2; i<n; i++){
                if(n%i==0){
                    prime = false;
                    break;
                }
            }
            if(prime) System.out.println(n+" ");{

            }
            System.out.println();
        }

    }
}
