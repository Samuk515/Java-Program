package Day30;

interface Greeting {
    void greet(String name);
}
public class AnonClassDemo {
    public static void main(String[] args) {

        // Anonymous class 1 - formal
        Greeting formal = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Good morning, " + name + ". Welcome.");
            }
        };
        // Anonymous class 2 - casual
        Greeting casual = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hey " + name + "! What's up?");
            }
        };
        //Anoymous class 3 - farewell
        Greeting farewell= new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Goodbye," + name + ". See you soon!");
            }
        };
        // Use polymorphically
        Greeting[] greetings = { formal, casual, farewell };
        for (Greeting g : greetings) {
            g.greet("Samir");
    }
}
    }
