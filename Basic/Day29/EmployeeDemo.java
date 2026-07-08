package Day29;

class Employee {
    private static int nextId = 1;
    public  int id;
    private String name;
    private double salary;
    private int age;
    private String department;

    Employee(String name, double salary, int age ) {
        this.id = nextId++;
        setName(name);
        setSalary(salary);
        setAge(age);
        this.department = "Unassigned";
    }
    //Getters
    public int getId()  { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    //Setter with vaildation
    public void setName(String name){
        if ( name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("name cannot be  empty");
        this.name = name;
    }
private void setSalary(double salary) {
        if (salary <= 0)
            throw new IllegalArgumentException("salary must be positive");
        this.salary = salary;
}

public void raiseSalary(double percent) {
    if (percent <= 0)
        throw new IllegalArgumentException("salary must be positive");
    double raise = salary * percent / 100;
    salary += raise;
    System.out.printf("Salary raised by %.1f%% → Rs.%.2f%n", percent, salary);
}

public void setAge(int age) {
    if (age < 18 || age > 65)
        throw new IllegalArgumentException("Age must be 18-65");
    this.age = age;
}

public void setDepartment(String dept) {
    this.department = (dept == null || dept.isEmpty()) ? "Unassigned" : dept;
}

public void display() {
    System.out.printf("ID:%-3d %-12s Age:%-3d Dept:%-12s Salary:Rs.%.2f%n",
            id, name, age, department, salary);
}
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Arjun", 75000, 28);
        Employee e2 = new Employee("Priya", 90000, 32);

        e1.setDepartment("Engineering");
        e2.setDepartment("Marketing");

        e1.display();
        e2.display();

        e1.raiseSalary(10);
        e1.raiseSalary(-5);  // error
        e1.display();
    }
}

