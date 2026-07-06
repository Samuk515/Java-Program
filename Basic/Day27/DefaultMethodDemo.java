package Day27;

import java.util.Arrays;

interface Sortable {
    int[] getData();

    default void sortAscending() {
        int[] d = getData().clone();
        Arrays.sort (d);
        System.out.println("Ascending : "  + Arrays.toString(d));
    }

    default void sortDescending() {
        int[] d = getData().clone();
        Arrays.sort(d);
        for (int i = 0, j = d.length - 1; i < j; i++, j--) {
            int tmp = d[i];
            d[i] = d[j];
            d[j] = tmp;
        }
        System.out.println("Descending : " + Arrays.toString(d));
    }

static void printInfo() {
    System.out.println("Sortable interface v1.0 ");
 }
}
class NumberList implements Sortable {
    private int[] numbers;

    NumberList(int... nums) { this.numbers = nums;}

    @Override
    public int[] getData() { return numbers; }

    // Override default method to customize
    @Override
    public void sortDescending() {
        System.out.println("Custom desc ?? ");
        int[] d = getData().clone();
        Arrays.sort(d);
        for (int i = 0, j = d.length - 1; i < j; i++, j--) {
            int tmp = d[i];
            d[i] = d[j];
            d[j] = tmp;
        }
        System.out.println(Arrays.toString(d));
    }

}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        NumberList list = new NumberList(5, 2, 8,1,9,3);

        System.out.println("Data    : " + Arrays.toString(list.getData()));
        list.sortAscending(); //free from default method
        list.sortDescending(); //overridden custom version

        Sortable.printInfo();  // static - called on interface, not instance
    }
}
