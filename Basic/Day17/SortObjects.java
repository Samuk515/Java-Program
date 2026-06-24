package Day17;

class Student {
    String name;
    double gap;
    Student (String name, double gap){
        this.name = name;
        this.gap = gap;
    }
    public String toString(){  return name + "(" + gap + ")"; }
}
public class SortObjects {
    static void printStudents(Student[] arr) {
        for (Student s : arr ) System.out.println(s + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student("Arjun", 3.2),
                new Student("Bala", 3.8),
                new Student("Chitra", 3.5),
                new Student("Divya", 3.9),
                new Student("Eshan", 3.1)
        };
        System.out.println("Before:");
        printStudents(students);

        //Bubble sort descending by GPA
        int n = students.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (students[j].gap < students[j + 1].gap){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1 ] = temp;
                }
            }
        }
        System.out.println("After:");
        printStudents(students);
    }
}
