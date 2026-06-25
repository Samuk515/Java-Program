package Day18;

public class StringBugs {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        String d = new String("Java");

        System.out.println(a == b); // true, because both refer to the same string literal in the string pool
        System.out.println(a == c); // false, because c is a new object in the heap
        System.out.println(c == d); // false, because c and d are two different objects in the heap
        System.out.println(a.equals(c)); // true, because the content of both strings is the same
        System.out.println(c.equals(d)); // true, because the content
        System.out.println(a.equalsIgnoreCase("JAVA"));
    }
}
