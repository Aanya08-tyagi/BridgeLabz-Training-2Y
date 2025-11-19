class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemMain {
    public static void main(String[] args) {
        Item item1 = new Item(201, "Laptop", 55000);

        item1.displayItem();
        int quantity = 2;
        System.out.println("Total Cost for " + quantity + " items: " + item1.calculateTotalCost(quantity));
    }
}
