package Day35;

public class CallByValue {

    static void tryChangeInt(int x) {
        x = 999;
        System.out.println("Inside: x = " + x);
    }

    static void tryChangeArray(int[] arr) {
        arr[0] = 999;   // A: modifies element
    }

    static void tryReplaceArray(int[] arr) {
        arr = new int[]{1, 2, 3};  // B: replaces reference
    }

    static void tryChangeObject(StringBuilder sb) {
        sb.append(" World");       // C: modifies object
    }

    static void tryReplaceObject(StringBuilder sb) {
        sb = new StringBuilder("Replaced"); // D: replaces reference
    }

    public static void main(String[] args) {
        int n = 42;
        tryChangeInt(n);
        System.out.println("After: n = " + n);       // 1

        int[] arr = {10, 20, 30};
        tryChangeArray(arr);
        System.out.println("After A: arr[0] = " + arr[0]); // 2
        tryReplaceArray(arr);
        System.out.println("After B: arr[0] = " + arr[0]); // 3

        StringBuilder sb = new StringBuilder("Hello");
        tryChangeObject(sb);
        System.out.println("After C: sb = " + sb);   // 4

        tryReplaceObject(sb);
        System.out.println("After D: sb = " + sb);   // 5
    }
}
