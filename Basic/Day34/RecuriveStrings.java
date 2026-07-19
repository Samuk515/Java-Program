package Day34;

public class RecuriveStrings {
    static String reverse(String s){
        if (s.length() <= 1) return s; // base case
        return reverse(s.substring(1)) + s.charAt(0); // recursive case
    }

    static boolean isPalindrome(String s){
        if (s.length() <=1 ) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1)); //check middle

    }
    static int countChar(String s, char c) {
        if (s.isEmpty()) return 0;  //base case
        int count = (s.charAt(0) == c ? 1 : 0);
        return count + countChar(s.substring(1), c); //recursive case
    }
    static String removeSpaces(String s) {
        if (s.isEmpty()) return "";
        char first = s.charAt(0);
        String rest = removeSpaces(s.substring(1));
        return (first == ' ') ? rest : first + rest;

    }
    public static void main(String[] args) {
        System.out.println("reverse('Java')    = " + reverse("Java") );
        System.out.println("isPalindrome('racecar') = " + isPalindrome("racecar"));
        System.out.println("isPalindrome('hello')   = " + isPalindrome("hello"));
        System.out.println("isPalindrome('madam')   = " + isPalindrome("madam"));
        System.out.println("countChar('banana','a') = " + countChar("banana", 'a'));
        System.out.println("removeSpaces('Hi There')= " + removeSpaces("Hi There"));
    }
}
