package Day20;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" Java ");

        sb.append(" is fun");
        System.out.println("After append : " + sb);

       sb.insert(4, " 17 ");
        System.out.println("After insert :" + sb);

        sb.replace(5, 7, " SE ");
        System.out.println("After replace: " + sb);

        sb.delete(4, 7);
        System.out.println("After delete : " + sb);

        sb.reverse();
        System.out.println("After reverse : " + sb);

        sb.reverse(); // restore
        System.out.println("Length : " + sb.length());
        System.out.println("charAt(0): " + sb.charAt(0));
        System.out.println("indexOf :" + sb.indexOf("av"));
    }
}
