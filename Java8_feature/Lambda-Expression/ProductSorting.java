package Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSorting {

    static class Product {
        String name;
        double price;
        double rating; // 0-5
        double discount; // percent

        Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }

        @Override
        public String toString() {
            return String.format("%s (price=%.2f, rating=%.1f, discount=%.0f%%)", name, price, rating, discount);
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Wireless Mouse", 25.99, 4.3, 10));
        products.add(new Product("Mechanical Keyboard", 79.50, 4.8, 20));
        products.add(new Product("USB-C Hub", 34.00, 4.1, 5));
        products.add(new Product("27" + " Monitor", 189.99, 4.6, 15));
        products.add(new Product("Laptop Stand", 29.99, 4.0, 25));

        System.out.println("Original:");
        products.forEach(p -> System.out.println(p));
        System.out.println();

        Collections.sort(products, (a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sorted by price (asc):");
        products.forEach(System.out::println);
        System.out.println();
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("Sorted by rating (desc):");
        products.forEach(System.out::println);
        System.out.println();

      
        Comparator<Product> byDiscountDesc = (a, b) -> Double.compare(b.discount, a.discount);
        Comparator<Product> byPriceAsc = (a, b) -> Double.compare(a.price, b.price);
        products.sort(byDiscountDesc.thenComparing(byPriceAsc));
        System.out.println("Sorted by discount (desc) then price (asc):");
        products.forEach(System.out::println);
    }
}
