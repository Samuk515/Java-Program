package Day21;

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double getSalary();

    abstract void display();

    void display(String type) {
        System.out.printf("%-4s %-6s (%-3d) | Salary: Rs.%.1f%n", type, name, id, getSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double getSalary() {
        return monthlySalary;
    }

    @Override
    void display() {
        super.display("FT");
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double getSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void display() {
        super.display("PT");
    }
}

class Manager extends FullTimeEmployee {
    double bonus;

    Manager(String name, int id, double monthlySalary, double bonus) {
        super(name, id, monthlySalary);
        this.bonus = bonus;
    }

    @Override
    double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    void display() {
        super.display("MGR");
    }
}

public class PayrollDemo {
    static void main(String[] args) {
        int ignoredArgCount = args.length;

        Employee[] staff = {
                new FullTimeEmployee("Arjun", 1, 75000),
                new PartTimeEmployee("Priya", 2, 200, 60),
                new Manager("Ravi", 3, 10000, 20000)
        };

        double total = 0;
        for (Employee e : staff) {
            e.display();
            total += e.getSalary();
        }

        System.out.printf("Total payroll: Rs.%.1f%n", total);
    }
}
