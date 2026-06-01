package Day12;

class Book {
    String title;
    String author;
    double price;
    boolean isAvailable =  true;

    void borrow(){
        if(!isAvailable){
            System.out.println("\"" + title + "\" is already borrowed.");
        } else {
            isAvailable = false;
            System.out.println("\"" + title + "\" has been borrowed.");
        }
    }
    void returnBook(){
        isAvailable = true;
        System.out.println("\"" + title + "\" has been returned. Thank you!");
    }
    void display(){
        System.out.println(title + "by" + author + " | Rs. " + price +
                " |" + (isAvailable ? "Available" : "Borrowed"));
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book(); books[0].title = "Clean Code";       books[0].author = "Robert Martin"; books[0].price = 1200;
        books[1] = new Book(); books[1].title = "Effective Java";   books[1].author = "Joshua Bloch";  books[1].price = 1500;
        books[2] = new Book(); books[2].title = "Head First Java";  books[2].author = "Kathy Sierra";  books[2].price = 900;

        // Simulate transactions
        books[0].borrow();
        books[1].borrow();
        books[0].borrow(); // already borrowed
        books[0].returnBook();
        books[2].borrow();

        // Library status
        System.out.println("\n--- Library Status ---");
        int available = 0;
        for (Book b : books) {
            b.display();
            if (b.isAvailable) available++;
        }
        System.out.println("Available: " + available + "/" + books.length);
    }
}