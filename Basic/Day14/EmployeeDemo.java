package Day14;

class Employee{
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    // copy constructor
    Employee(Employee other){
        this.name  = other.name;
        this.department = other.department;
        this.salary = other.salary;
    }
    void display (String label){
        System.out.println(label + ": " + name + " | " +department + " | " + salary );
    }
}
public class EmployeeDemo {
    static void main(String[] args) {
        Employee e1 = new Employee("Samuk", "Engineering", 7500000);
        Employee e2 = new Employee(e1);

        e1.display("Original");
        e2.display("Copy  ");

        //modify the copy
        e2.name = "Musuma";
        e2.department = "Marketing";
        e2.salary = 1234567;

        System.out.println("--- after modifying copy ---");
        e1.display("Original");
        e2.display("Copy  ");

    }
}
