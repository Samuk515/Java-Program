package Day31;

class Person {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void display() {
        System.out.println("Person: " + name + " , " + age);
        address.display();
    }
    // Static nested class - no outer instance needed
    static class Address {

            String street, city, country;

            Address(String street, String city, String country) {
                this.street = street;
                this.city = city;
                this.country = country;
            }
            void display() {
                System.out.println("Address: " + street + " , " + city + " , " + country);
            }
        }
    }


public class StaticNestedDemo {
    public static void main(String[] args) {
        // Create Address standalone - no Person needed!
        Person.Address addr1 = new Person.Address("123 Durbar Marg", "Kathmandu", " Nepal");
        Person p = new Person("Ram", 25, addr1);
        p.display();

        // Another standalone Address
        Person.Address addr2 = new Person.Address("456 Thamel", "Kathmandu", "Nepal");
        System.out.println("Standalone ");
        addr2.display();
    }
}
