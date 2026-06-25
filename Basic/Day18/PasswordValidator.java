package Day18;

public class PasswordValidator {
    static boolean validate(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specials = "@#$%^!";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (specials.indexOf(ch) >= 0) hasSpecial = true;
        }
        boolean haslength = password.length() >= 8;

        System.out.println("\nPassword: " + password);
        System.out.println("Length >= 8: " + (haslength ? "Yes" : "No"));
        System.out.println("Has Uppercase: " + (hasUpper ? "Yes" : "No"));
        System.out.println("Has Lowercase: " + (hasLower ? "Yes" : "No"));
        System.out.println("Has Digit: " + (hasDigit ? "Yes" : "No"));
        System.out.println("Has Special Character: " + (hasSpecial ? "Yes" : "No"));
        boolean valid = haslength && hasUpper && hasDigit && hasSpecial;
        System.out.println("Result      :" + (valid ? "STRONG yes" : "WEAK no"));
        return valid;
    }
public static void main(String[] args) {
    validate("Java@2024");
    validate("weakpass");
    validate("Short1@");
    }
}