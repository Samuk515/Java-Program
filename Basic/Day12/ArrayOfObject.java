package Day12;

class  Product {
    String name;
    Double price;
    int quantity;
        }

public class ArrayOfObject {
    static void main(String[] args) {
        Product[] products = new Product[4];

        products[0] = new Product();
        products[0].name = "Mac";
        products[0].price = 150000.0;
        products[0].quantity = 5;
        products[1] = new Product(); products[1].name = "Phone";  products[1].price = 2500.0; products[1].quantity = 12;
        products[2] = new Product(); products[2].name = "Tablet"; products[2].price = 3500.0; products[2].quantity = 8;
        products[3] = new Product(); products[3].name = "Watch";  products[3].price = 1500.0; products[3].quantity = 20;

        System.out.println(" --- Products List ---");
        Product mostExpensive = products[0];
        for (Product p : products) {
            System.out.println(p.name + "\tRs." + p.price + "\tQty:" + p.quantity);
            if (p.price > mostExpensive.price) mostExpensive =p;
        }
        System.out.println("Most expensive: " + mostExpensive.name + " Rs." + mostExpensive.price);
    }
}
