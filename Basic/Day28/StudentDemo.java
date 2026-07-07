package Day28;

class Student{
    private String name;
    private int age;
    private double gpa;
    private String email;

    //Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    public String getEmail() { return email; }

    //Setters with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            System.out.println("Error: Name cannot be empty");
            return;
        }
        this.name = name;
        System.out.println("Name set to: " + name);
    }
    public void setAge(int age) {
        if ( age < 5 || age > 100){
            System.out.println("Error: Age must be between 5 and 100");
            return;
        }
        this.age = age;
        System.out.println("Age set to: " + age);
    }
    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("GPA set: " + gpa);
        }
        this.gpa = gpa;
        System.out.println("GPA set to: " + gpa);
    }
    public void setEmail(String email) {
    if (email == null || !email.contains("@")){
        System.out.println("Error: Email cannot be empty");
        return;
    }
    this.email = email;
    System.out.println("Email set to: " + email);
    }
    public void display() {
        System.out.println("Student: " + name + " | Age: " + age + " | GPA: " + gpa + " | Email: " + email);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Arjun");
        s.setAge(145);
        s.setAge(22);
        s.setGpa(3.8);
        s.setEmail("notanemail"); // invalid
        s.setEmail("arjun@gmail.com");
        s.display();
    }
}
