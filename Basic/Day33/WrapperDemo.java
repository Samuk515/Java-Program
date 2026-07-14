package Day33;

public class WrapperDemo {
    public static void main(String[] args) {
        //Integer
        System.out.println("=== Integer ===");
        System.out.println("Max int  : " + Integer.MAX_VALUE);
        System.out.println("Min int  : " + Integer.MIN_VALUE);
        System.out.println("parseInt  : " + Integer.parseInt("123"));
        System.out.println(" 42 binary  : " + Integer.toBinaryString(42));
        System.out.println(" 42 hex  :" + Integer.toHexString(42));
        System.out.println(" 42 octal  :" + Integer.toOctalString(42));
        System.out.println(" 255 binary :" + Integer.toBinaryString(255));

        // Double
        System.out.println("=== Double ===");
        System.out.println("\n=== Double ===");
        System.out.println("parseDouble : " + Double.parseDouble("3.14"));
        double nan = 0.0 / 0.0;
        double inf = 1.0 / 0.0;
        System.out.println("isNaN       : " + Double.isNaN(nan));
        System.out.println("isInfinite  : " + Double.isInfinite(inf));
        System.out.println("NaN==NaN    : " + (nan == nan)); // always false!

        // Character
        System.out.println("\n=== Character ===");
        char ch = 'A';
        System.out.println("isLetter    : " + Character.isLetter(ch));
        System.out.println("isDigit     : " + Character.isDigit('5'));
        System.out.println("isUpperCase : " + Character.isUpperCase(ch));
        System.out.println("toLowerCase : " + Character.toLowerCase(ch));

        // Boolean
        System.out.println("\n=== Boolean ===");
        System.out.println("parseBoolean: " + Boolean.parseBoolean("true"));
        System.out.println("parseBoolean: " + Boolean.parseBoolean("TRUE"));
        System.out.println("parseBoolean: " + Boolean.parseBoolean("yes")); // false!
    }
    }

