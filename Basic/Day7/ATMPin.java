package Day7;

public class ATMPin {
    public static void main(String[] args) {
        int correctPin = 1234;
        int [] attempts = { 9999, 1234, 5678, 4321, 1234 };
        int i = 0;

        do {
            if (attempts[i] == correctPin) {
                System.out.println("Access Granted");
            } else {
                System.out.println("PIN incorrect. Try again.");
            }
            i++;
        } while (i < attempts.length && attempts[i-1] != correctPin);

    }
}
