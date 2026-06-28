package Day19;

public class LogParser {
    public static void main(String[] args) {
        String log = "2024-01-15 ERROR [UserService] Login failed for user: admin@test.com";

        String date = log.substring(0, 10);
        String level = log.split(" ")[1];

        int start = log.indexOf('[') + 1;
        int end = log.indexOf(']');
        String service = log.substring(start, end);

        String message = log.substring(end + 2);
        String email = log.substring(log.lastIndexOf(' ') + 1);
        String masked = log.replace(email, "***");

        System.out.println("Date    :" + date);
        System.out.println("Level    :" + level);
        System.out.println("Service    :" + service);
        System.out.println("Message    :" + message);
        System.out.println("User email  :" + email);
        System.out.println("Masked log   :" + masked);
    }
}
