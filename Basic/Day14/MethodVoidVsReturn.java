package Day14;

class Person {
    String name;
    int age;
    String city;

    //Default constructor
    Person(){
        name = "Unkonwn";
        age = 0;
        city = "Unkonwn";
    }

    // Parameterized constructor
    Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    void display() {
        System.out.println("Name: " + name + " | Age: " + age + " | City: " + city);
    }
}

public class MethodVoidVsReturn {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("Arjun", 22, "kathmandu");

        p1.display();
        p2.display();

    }

}
