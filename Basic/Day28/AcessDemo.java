package Day28;

class Person {
    public  String name = "Unknown"; // accessible everywhere
    protected int age = 0;
    String city = "Unknown";
    private String ssn = "000-00-0000"; // accessible only within the class

    Person(String name, int age, String city, String ssn) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.ssn = ssn;
    }
    public String getMaskedSsn() {
        return "***-**-" + ssn.substring(ssn.length()-4);
    }
}
class Employee extends Person {
    String department;
    Employee(String name, int age, String city, String dept, String ssn) {
        super(name, age, city, ssn);
        this.department = dept;
    }

    void showAccessRights() {
        System.out.println("=== Acess Rights ( from different subclass) ====)");
        System.out.println("public name    → accessible ✓ : " + name);
        System.out.println("protected age  → accessible ✓ : " + age);
        // city → NOT accessible from different package (default/package-private)
        System.out.println("default city   → NOT accessible ✗ (would be compile error)");
        // ssn → NOT accessible (private)
        System.out.println("private ssn    → NOT accessible ✗ (would be compile error)");
        System.out.println("via getter ssn → accessible ✓ : " + getMaskedSsn());

    }
}

public class AcessDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Arjun", 28, "Kathmandu", "123-45-6789", "Engineering");
        e.showAccessRights();

        System.out.println("\n === Summary Table ===");
        System.out.printf("%-20s %-12s %s%n", "Modifier", "Same Pkg", "Diff Pkg Subclass");
        System.out.printf("%-20s %-12s %s%n", "public",    "✓",       "✓");
        System.out.printf("%-20s %-12s %s%n", "protected", "✓",       "✓");
        System.out.printf("%-20s %-12s %s%n", "default",   "✓",       "✗");
        System.out.printf("%-20s %-12s %s%n", "private",   "✗",       "✗");
    }
}
