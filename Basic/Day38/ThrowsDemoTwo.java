package Day38;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemoTwo {

    // Declares it MAY throw IOException - caller must handle
    static String readFile(String path) throws IOException {
        if (path == null || path.isEmpty())
            throw new IOException("File path cannot be empty");
        if (path.startsWith("missing"))
            throw new FileNotFoundException("File not found: " + path);
        return "42"; // simulated file content
    }

    // NumberFormatException is unchecked - throws declaration optional
    static int parseContent(String content) throws NumberFormatException {
        return Integer.parseInt(content);
    }
    // Re- declares IOException - passes responsibility to ITS caller
    static int readAndParse(String path ) throws IOException {
        String content = readFile(path); // may throw propagates up
        try {
            return parseContent(content);
        } catch (NumberFormatException e) {
            throw new IOException("File content is not a number: " + content, e);
        }
    }

    public static void main (String[] args) {
        //pattern 1: Handle it here
        try {
            String data = readFile("data.txt");
            System.out.println("Read: " + data);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        // Pattern 2: File missing
        try {
            String data = readFile("missing_report.txt");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        // Patttern 3: readAndParse - handles everything
        try {
            int value = readAndParse("number.txt");
            System.out.println("Parsed value: " + value);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        // Pattern 4: null path
        try {
            readAndParse(null);
        } catch (IOException e) {
            System.out.println("Failed: " + e.getMessage());
        }

        // Pattern 4 : null path
        try {
            readAndParse(null);
        } catch (IOException e) {
            System.out.println("Failed: " + e.getMessage());
        }
    }
}



