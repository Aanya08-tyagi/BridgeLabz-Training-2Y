class Product {
    // Static variable
    static double discount = 10; // in percentage

    // Final variable
    final int productID;

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Constructor using 'this'
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Display details using instanceof
    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID + ", Name: " + productName + 
                               ", Price: " + price + ", Quantity: " + quantity + 
                               ", Discount: " + discount + "%");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 60000, 2);
        Product p2 = new Product(2, "Phone", 30000, 5);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(15);
        p1.displayDetails();
    }
}
