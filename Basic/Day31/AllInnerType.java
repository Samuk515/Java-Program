package Day31;
interface Greetable { void greet(String name); }

class App {
    private String appName = "MyApp"; // outer instance field

    // 1. Member inner class — has access to outer instance
    class Greeter {
        void greet(String name) {
            System.out.println("[Member] Hello, " + name + "! (from " + appName + ")");
        }
    }

    // 2. Static nested class — NO access to outer instance
    static class StaticGreeter {
        void greet(String name) {
            // appName; // ERROR — no outer instance
            System.out.println("[Static] Hello, " + name + "!");
        }
    }

    // 3. Method that uses local inner class
    void greetLocal(String name) {
        class LocalGreeter { // local inner class
            void greet() {
                System.out.println("[Local ] Hello, " + name + "! (from " + appName + ")");
            }
        }
        new LocalGreeter().greet();
    }

    // 4. Method that uses anonymous inner class
    void greetAnon(String name) {
        Greetable g = new Greetable() { // anonymous inner class
            @Override
            public void greet(String n) {
                System.out.println("[Anon  ] Hello, " + n + "! (from " + appName + ")");
            }
        };
        g.greet(name);
    }
}



public class AllInnerType {
    public static void main(String[] args) {
        App app = new App();

        // 1. Member inner — needs outer instance
        App.Greeter g1 = app.new Greeter();
        g1.greet("Arjun");

        // 2. Static nested — NO outer instance needed
        App.StaticGreeter g2 = new App.StaticGreeter();
        g2.greet("Arjun");

        // 3. Local inner — called via method
        app.greetLocal("Arjun");

        // 4. Anonymous — called via method
        app.greetAnon("Arjun");
    }
}
