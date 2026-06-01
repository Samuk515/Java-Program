package Day12;

class Box {
    int width;
    int height;
}

class ReferenceDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.width  = 10;
        b1.height = 20;

        Box b2 = b1;       // what does this do?
        b2.width = 50;

        System.out.println("b1.width: " + b1.width);
        System.out.println("b2.width: " + b2.width);
        System.out.println("Same object? " + (b1 == b2));

        Box b3 = new Box();// new object
        b3.width  = 10;
        b3.height = 20;
        System.out.println("b1 == b3? " + (b1 == b3));
    }
}