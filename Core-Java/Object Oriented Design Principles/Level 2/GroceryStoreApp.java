import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double quantity;
    private double pricePerUnit;

    // Constructor using "this" keyword
    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Calculate total price of this product
    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    // Display product details
    public void displayProduct() {
        System.out.println(name + " (" + quantity + " units at $" + pricePerUnit + " per unit) = $" + getTotalPrice());
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Product> products;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Add product to the customer's shopping list
    public void addProduct(Product product) {
        products.add(product);
    }

    // Return products
    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

// BillGenerator Class
class BillGenerator {
    // Calculate total bill
    public double calculateTotal(Customer customer) {
        double total = 0;
        for (Product p : customer.getProducts()) {
            total += p.getTotalPrice();
        }
        return total;
    }

    // Print bill details
    public void printBill(Customer customer) {
        System.out.println("----- Bill for " + customer.getName() + " -----");
        for (Product p : customer.getProducts()) {
            p.displayProduct();
        }
        System.out.println("Total Bill: $" + calculateTotal(customer));
        System.out.println("-------------------------------");
    }
}

// Main Class
public class GroceryStoreApp {
    public static void main(String[] args) {
        // Create a customer
        Customer customer1 = new Customer("Alice");

        // Create products
        Product apples = new Product("Apples", 2, 3.0);   // 2 kg at $3 per kg
        Product milk = new Product("Milk", 1, 2.0);       // 1 liter at $2 per liter

        // Customer buys products
        customer1.addProduct(apples);
        customer1.addProduct(milk);

        // Generate Bill
        BillGenerator billGen = new BillGenerator();
        billGen.printBill(customer1);
    }
}
