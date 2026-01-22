class Product {
    int pcode;
    String pname;
    double price;
}

public class Main {
    public static void main(String[] args) {

        // Create 3 product objects
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        // Assign values
        p1.pcode = 101;
        p1.pname = "Pen";
        p1.price = 10;

        p2.pcode = 102;
        p2.pname = "Pencil";
        p2.price = 5;

        p3.pcode = 103;
        p3.pname = "Eraser";
        p3.price = 8;

        // Find product with lowest price
        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        // Display result
        System.out.println("Product with lowest price:");
        System.out.println("Code: " + lowest.pcode);
        System.out.println("Name: " + lowest.pname);
        System.out.println("Price: " + lowest.price);
    }
}
