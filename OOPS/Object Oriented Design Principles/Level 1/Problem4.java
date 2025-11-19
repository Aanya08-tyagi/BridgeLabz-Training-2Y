import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    List<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println("- " + p.name + " : " + p.price);
        }
    }
}

class Customer {
    String name;
    List<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order " + o.orderId);
    }

    void showOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order o : orders) {
            o.showOrder();
        }
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Aanya");
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Phone", 30000);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        c1.placeOrder(o1);
        c1.showOrders();
    }
}
