package Day15;

class Student{
    String name;
    int id;
    static int totalStudents = 0;


Student(String name){
    totalStudents++;
    this.id = totalStudents;
    this.name = name;

}
void display(){
    System.out.println("ID:" + id + "Name:" + name );
}
static void showTotal(){
    System.out.println("Total students enrolled:" + totalStudents);
 }
}



public class StaticField {
    public static void main(String[] args) {
        Student s1 = new Student("Arjun");
        Student s2 = new Student("Priya");
        Student s3 = new Student("Ravi");

        s1.display();
        s2.display();
        s3.display();
        Student.showTotal();
    }
}
