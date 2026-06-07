package Day13;

class StringUtils {

    static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') count++;
        }
        return count;
    }

    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        return rev;
    }

    static boolean isPalindrome(String s) {
        return s.equals(reverse(s)); // reuses reverse()!
    }

    static int countWords(String s) {
        if (s == null || s.trim().isEmpty()) return 0;
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i + 1 < s.length() && s.charAt(i+1) != ' ')
                count++;
        }
        return count;
    }
}

public class StringUtilsDemo {
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "Hello World Java";

        System.out.println(s1 + " → vowels:" + StringUtils.countVowels(s1)
                + ", palindrome:" + StringUtils.isPalindrome(s1)
                + ", reversed:" + StringUtils.reverse(s1));

        System.out.println(s2 + " → vowels:" + StringUtils.countVowels(s2)
                + ", words:" + StringUtils.countWords(s2));
    }
}