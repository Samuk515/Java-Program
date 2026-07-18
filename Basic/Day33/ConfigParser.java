package Day33;

class TypeConverter {
    static int toInt(String s, int deafaultVal) {
        if ( s == null ) return deafaultVal;
        try {
            return Integer.parseInt(s);
        } catch ( NumberFormatException e ) {
            return deafaultVal;
        }
    }
    static double toDouble(String s, double deafaultVal) {
        if ( s == null ) return deafaultVal;
        try {
            return Double.parseDouble(s.trim());
        } catch ( NumberFormatException e ) {
            return deafaultVal;
        }
    }
    static boolean toBoolean(String s) {
        if ( s == null ) return false;
        String lower = s.trim().toLowerCase();
        return lower.equals("true") || lower.equals("yes")
                || lower.equals("1") || lower.equals("no");
    }
    static String fromInt(int n, int base) {
        return Integer.toString(n, base);
    }
    static int clampInt(int val, int min, int max) {
        return Math.max(min, Math.min(max, val));
    }
    static void printConfig(String key, String raw, Object parsed){
        System.out.printf("%-15s =  %-10s ?? %s%n", key, raw, parsed);
    }
}

public class ConfigParser {
    public static void main(String[] args) {
        // simlate config file entries
        String[] [] config = {
                {"port",    "8080"},
                {"timeout",   "invalid"},
                {"maxUsers",  "500"},
                {"debug",     "yes"},
                {"verbose",   "0"},
                {"ratio",     "0.75"},
                {"badRatio",  "abc"}
        };
        System.out.println("=== Config File Parsing ===");
        for (String[] entry : config) {
            String key = entry[0], val = entry[1];
            if (key.equals("port") || key.equals("maxUsers"))
                TypeConverter.printConfig(key, val, TypeConverter.toInt(val, 80));
            else if (key.equals("timeout"))
                TypeConverter.printConfig(key, val, TypeConverter.toInt(val, 30));
            else if (key.equals("debug") || key.equals("verbose"))
                TypeConverter.printConfig(key, val, TypeConverter.toBoolean(val));
            else
                TypeConverter.printConfig(key, val, TypeConverter.toDouble(val, 1.0));
        }

        System.out.println("\n=== Base Conversions ===");
        System.out.println("255 binary : " + TypeConverter.fromInt(255, 2));
        System.out.println("255 hex    : " + TypeConverter.fromInt(255, 16));
        System.out.println("255 octal  : " + TypeConverter.fromInt(255, 8));

        System.out.println("\n=== Clamping ===");
        System.out.println("clamp(150,0,100) = " + TypeConverter.clampInt(150, 0, 100));
        System.out.println("clamp(-5, 0,100) = " + TypeConverter.clampInt(-5,  0, 100));
        System.out.println("clamp(50, 0,100) = " + TypeConverter.clampInt(50,  0, 100));
    }
}
