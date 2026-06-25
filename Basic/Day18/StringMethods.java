package Day18;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Helo, Java World!  ";
        String trimmed = s.trim();

        System.out.println("Length     :" + s.length());
        System.out.println("trimmed  :" + trimmed.length());
        System.out.println("Uppercase   :"  + trimmed.toUpperCase());
        System.out.println("Lowercase   :"  + trimmed.toLowerCase());
        System.out.println("Replace   :"  +  trimmed.replace("Java ", " Python "));
        System.out.println("Contains 'Java'  :" + trimmed.contains("Java"));
        System.out.println("Starts with 'He'  :" + trimmed.startsWith("He"));
        System.out.println("Index of 'Java'  :" + trimmed.indexOf("Java"));
        System.out.println("Substring (5, 9)  :" + trimmed.substring(5, 9));
        System.out.println("CharAt(7)  :" + trimmed.charAt(7));
    }
}
