package Day18;

import java.sql.SQLOutput;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);

        s.toUpperCase();
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        String t = "Good" + " " + "Day";
        System.out.println(t);
    }
}
