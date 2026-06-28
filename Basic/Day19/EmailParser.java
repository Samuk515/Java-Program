package Day19;

public class EmailParser {
    public static void main(String[] args) {
        String email = "arjun.thapa@gmail.com";

        int atIdx = email.indexOf("@");
        String username = email.substring(0, atIdx);
        String domain = email.substring(atIdx + 1);

        int dotInUser = username.indexOf(".");
        String firstName = username.substring(0, dotInUser);

        int dotInDomain = domain.indexOf(".");
        String provider = domain.substring(0, dotInDomain);

        System.out.println("Full email :" + email);
        System.out.println("Username   :" + username);
        System.out.println("First Name :" + firstName);
        System.out.println("Domain     :" + domain);
        System.out.println("Provider :" + provider);
    }
}
