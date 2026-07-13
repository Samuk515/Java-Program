package Day32;

import java.util.Arrays;

class Student implements Cloneable {
    String name;
    int age;
    int[] grades;

    Student(String name, int age, int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }
    // Shallow clone - grades array is shared!
    Student shallowClone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
    // Deep clone - grades array is copied too
    Student deepClone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.grades = this.grades.clone();
        return cloned;
    }
    @Override
    public String toString() {
        return name + " age: "  + age + " grades: " + Arrays.toString(grades);
    }
}


public class CloningDemo {
    public static void main(String[] args)  throws CloneNotSupportedException {
        Student original = new Student("Arjun", 22, new int[]{85, 90, 78});

        // SHALLOW CLONE
        Student  shallow= original.shallowClone();
        shallow.grades[0] = 99; // modifies SHARED array!
        System.out.println("=== After shallow clone + modifying clone ===");
        System.out.println("Original: " + original); // grades[0] changed to 99 ⚠
        System.out.println("Clone   : " + shallow);

        // DEEP CLONE (reset original first)
        Student orig2  = new Student("Priya", 21, new int[]{75, 80, 88});
        Student deep   = orig2.deepClone();
        deep.grades[0] = 99; // modifies SEPARATE array

        System.out.println("\n=== After deep clone + modifying clone ===");
        System.out.println("Original: " + orig2); // grades[0] unchanged ✓
        System.out.println("Clone   : " + deep);

    }
}
