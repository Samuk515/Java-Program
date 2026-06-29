package Day21;

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void introduce(){
        System.out.println("Hi, I'm " + name + ", age " + age);
    }
}

class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    void teach() {
        System.out.println("Teaching " + subject + " to students");
    }
    void display(){
        System.out.println(" " + name +" (" + subject + ")- Teaching " + subject + " to students");
    }
}
class School {
    String schoolName;
    Teacher[] teachers;
    int count = 0;

    School(String schoolName, int capacity){
        this.schoolName = schoolName;
        this.teachers = new Teacher[capacity];
    }
    void addTeacher(Teacher t) {
        if ( count < teachers.length) teachers[count++] = t;
    }
    void listTeachers(){
        System.out.println("SchoolL " + schoolName);
        for (int i = 0; i < count; i++) teachers[i].display();
    }
}
public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School ("Suryajit Academy", 5);
        school.addTeacher(new Teacher("Mr. Arjun", 35, "Math"));
        school.addTeacher(new Teacher("Ms. Priya", 29, "Science"));
        school.listTeachers();
    }
}
