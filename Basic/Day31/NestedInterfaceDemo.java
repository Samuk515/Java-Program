package Day31;

// SortedList with a nested Sortable interface
class SortedList {
    public static interface Sortable {
        int compareTo(Sortable other); // negative -> this comes first
    }

    private Sortable[] items;
    private int count;
    private int capacity;

    public SortedList(int capacity) {
        this.capacity = capacity;
        this.items = new Sortable[capacity];
        this.count = 0;
    }

    public Sortable[] getItems() { return items; }

    public void add(Sortable item){
        if (count < items.length) items[count++] = item;
    }

    public void sort() { // bubble sort using Sortable contract
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (items[j].compareTo(items[j + 1]) > 0) {
                    Sortable temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}

public class NestedInterfaceDemo {
    // Student implements the nested Sortable interface
    public static class Student implements SortedList.Sortable {
        String name;
        double gpa;

        Student(String name, double gpa) { this.name = name; this.gpa = gpa; }

        @Override
        public int compareTo(SortedList.Sortable other) {
            Student s = (Student) other;
            // For descending GPA order (higher GPA comes first) reverse comparison
            return Double.compare(s.gpa, this.gpa);
        }

        @Override
        public String toString() {
            return String.format("%-8s GPA: %.1f", name, gpa);
        }
    }

    public static void main(String[] args) {
        SortedList list = new SortedList(10);
        list.add(new Student("Arjun", 3.5));
        list.add(new Student("Priya", 3.9));
        list.add(new Student("Ram",   3.1));
        list.add(new Student("Sita",  3.7));

        System.out.println("Before sort:");
        list.printAll();

        list.sort();
        System.out.println("\nAfter sort (desc GPA):");
        list.printAll();
    }

}
