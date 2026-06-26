package Day20;

public class PerformanceDemo {
    public static void main(String[] args) {
        int n = 100000;

        //String concatenation
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) s += "a";
        long stringTime = System.currentTimeMillis() - start;

        // StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        long sbTime = System.currentTimeMillis() - start;

        System.out.println("String concat time : " + stringTime + " ms");
        System.out.println("StringBuilder time :" + sbTime + " ms");
        if (sbTime > 0)
            System.out.println("StringBuilder is ~" + (stringTime / sbTime) + "x faster");
        else
            System.out.println("StringBuilder is dramatically faster (< 1ms)");
    }
}
