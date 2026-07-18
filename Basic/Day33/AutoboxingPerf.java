package Day33;

public class AutoboxingPerf {
    public static void main(String[] args) {
        int N = 1_000_000;

        //1.Primaitive long - fast
        long start = System.currentTimeMillis();
        long primitiveSum = 0L;
        for (int i = 0; i < N; i++)  primitiveSum += i;
        long primitiveTime = System.currentTimeMillis() - start;

        // 2. Wrapper Long - SLOW  due to autoboxing
        start = System.currentTimeMillis();
        long wrapperSum = 0L;
        for (int i = 0; i < N; i++)  wrapperSum += i; // create new long each iteration!
        long wrapperTime = System.currentTimeMillis() - start;

        //3. Integer array with primitive sum - reasonable
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++)  arr[i] = i; //store as Integer objects

        start = System.currentTimeMillis();
        long mixedSum = 0L;
        for (Integer i : arr) mixedSum += i; // unboxing each iteration
        long mixedTime = System.currentTimeMillis() - start;

        System.out.println("Results (sum = " + primitiveSum + ")");
        System.out.println("Primitive long : " + primitiveTime + " ms");
        System.out.println("Wrapper Long   : " + wrapperTime   + " ms  ← autoboxing tax");
        System.out.println("Integer array  : " + mixedTime     + " ms  ← unboxing cost");

        System.out.println("\nWhy is Wrapper Long slow?");
        System.out.println("Each 'wrapperSum += i' secretly does:");
        System.out.println("  wrapperSum = Long.valueOf(wrapperSum.longValue() + i)");
        System.out.println("  = unbox + add + create new Long object");
        System.out.println("  → " + N + " unnecessary Long objects created!");
    }
}
