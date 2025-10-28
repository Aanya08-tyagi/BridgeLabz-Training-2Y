// Taxable interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }
    @Override public double calculateDiscount() { return getPrice() * 0.1; } // 10%
    @Override public double calculateTax() { return getPrice() * 0.18; }   // 18%
    @Override public String getTaxDetails() { return "18% GST on Electronics"; }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }
    @Override public double calculateDiscount() { return getPrice() * 0.2; } // 20%
    @Override public double calculateTax() { return getPrice() * 0.05; }   // 5%
    @Override public String getTaxDetails() { return "5% VAT on Clothing"; }
}

// Groceries class (no tax)
class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }
    @Override public double calculateDiscount() { return getPrice() * 0.05; } // 5%
}

// Main
public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] cart = {
            new Electronics(1, "Laptop", 50000),
            new Clothing(2, "Shirt", 2000),
            new Groceries(3, "Rice", 1000)
        };

        for (Product p : cart) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("------------------");
        }
    }
}
