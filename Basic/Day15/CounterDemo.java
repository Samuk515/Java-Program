package Day15;

class Counter {
    static int count = 0;
    static String label = "Counter";

    static void increament(){
        count++;   //error 1
    }
    void printLabel(){
        System.out.println(Counter.label);
    }
    static void  reset(){
        count = 0;
        System.out.println(label + " reset");
    }
    void display(){
        System.out.println(label + ": " + count);
    }
}

public class CounterDemo {
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter.increament();
        c.display();
    }
}
