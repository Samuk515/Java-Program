package Day20;

public class BufferVsBuilder {
    public static void main(String[] args) {
        String original = "JavaProgramming";

        // Both reverse identically
        StringBuilder sb  = new StringBuilder(original);
        StringBuffer  sbf = new StringBuffer(original);

        System.out.println("Original      : " + original);
        System.out.println("StringBuilder : " + sb.reverse());
        System.out.println("StringBuffer  : " + sbf.reverse());

        // Comparison table
        System.out.println();
        System.out.printf("%-18s %-15s %-15s%n", "Feature", "StringBuilder", "StringBuffer");
        System.out.printf("%-18s %-15s %-15s%n", "Mutable",      "yes",     "yes");
        System.out.printf("%-18s %-15s %-15s%n", "Thread-safe",  "NO",      "YES");
        System.out.printf("%-18s %-15s %-15s%n", "Performance",  "FASTER",  "slower");
        System.out.printf("%-18s %-15s %-15s%n", "Use when",     "1 thread","multi-thread");
    }
}
