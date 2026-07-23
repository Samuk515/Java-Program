package Day38;

public class UserRegistration {
    static void validateUsername(String username) {
        if (username == null || username.length() < 3)
            throw new IllegalArgumentException("Username too short (min 3 chars)");
        if (username.length() > 20)
            throw new IllegalArgumentException("Username too long (max 20 chars)");
        if (!username.matches("[a-zA-Z0-9]+"))
            throw new IllegalArgumentException("Username must be alphanumeric only");
    }

    static void validateEmail(String email) {
        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("Invalid email: must contain @");
        if (email.indexOf("@") == 0 || email.indexOf("@") == email.length() - 1)
            throw new IllegalArgumentException("Invalid email format");
    }

    static void validateAge(int age) {
        if (age < 13)
            throw new IllegalArgumentException("Must be at least 13 years old");
        if (age > 120)
            throw new IllegalArgumentException("Invalid age: " + age);
    }

    static void registerUser(String username, String email, int age)
            throws IllegalArgumentException {
        // Run validations; any IllegalArgumentException bubbles up to caller
        validateUsername(username);
        validateEmail(email);
        validateAge(age);

        // If all validations passed, perform registration (here we just print)
        System.out.println("[registerUser] Registration successful for: " + username);
    }

    public static void main(String[] args) {
        // Test 1: Successful registration
        try {
            registerUser("priya123", "priya@mail.com", 25);
        } catch (IllegalArgumentException e) {
            System.out.println("[Main] Registration rejected: " + e.getMessage());
        }

        // Test 2: Short username
        try {
            registerUser("ab", "ab@mail.com", 20);
        } catch (IllegalArgumentException e) {
            System.out.println("[Main] Registration rejected: " + e.getMessage());
        }

        // Test 3: Invalid email
        try {
            registerUser("priya123", "notanemail", 25);
        } catch (IllegalArgumentException e) {
            System.out.println("[Main] Registration rejected: " + e.getMessage());
        }

        // Test 4: Underage
        try {
            registerUser("kiduser", "kid@mail.com", 10);
        } catch (IllegalArgumentException e) {
            System.out.println("[Main] Registration rejected: " + e.getMessage());
        }
    }

}
