package Day23;

class Person {
    String name, type;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.type = "Person";
    }

    void display(){
        System.out.println("Type: " + type + " | Name: " + name + " | Age: " + age);

    }
}

class Employee extends Person{
    String company;
    double salary;
    String type; // shadows parent's type

    Employee(String name, int age, String company, double salary){
        super(name, age);   //use 1: call parent constructor
        this.company = company;
        this.salary = salary;
        this.type = "Employee";
    }
    @Override
    void display(){
        System.out.println("--- Employee Info ---");
        super.display();   //use 3; call parent mehtod
        // use 2: acess parent's type field explicity
        System.out.println("Type: " + this.type
    + " | Company: " + company + " | Salary: " + salary);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Person p = new Person("Arjun", 30);
        System.out.println("--- Person Info __");
        p.display();

        System.out.println();
        Employee e = new Employee("Arjun", 30,"Arjun",30000);
        e.display();
    }
}
