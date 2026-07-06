package Day27;

interface Printable {
    void print(); // implicity public abstract
}

interface Saveable {
    void save();
}

class Document implements Printable, Saveable {
    String title, content;

    Document(String title, String content) {
        this.title = title; this.content = content;
    }
    @Override
    public void print() {
        System.out.println("Printing Document: " + title);
    }

    @Override
    public void save() {
        System.out.println("Saving Document: " + title + " to disk");
    }
}

class Photo implements Printable {
    String filename;
    Photo(String filename) { this.filename = filename; }

    @Override
    public void print() {
        System.out.println("Printing Photo: " + filename);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Document doc = new Document("Java Notes", "OOP concepts....");
        Photo photo = new Photo("vaction.jpg");

        doc.print();
        doc.save();
        doc.print();

        // Interface reference - polymorphism
        Printable p1 = doc;  // Document IS-A Printable
        Printable p2 = photo; // Photo IS-A Printable
        p1.print();
        p2.print();

        Saveable s = doc;  // Document IS-A Saveable
        s.save();
        // Saveable s2 = photo; // COMPILE ERROR - Photo doesn't im
    }
}
