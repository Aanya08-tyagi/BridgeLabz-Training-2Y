class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is not available!");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                ", Price: " + price + ", Available: " + available);
    }
}

public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("OOP in Java", "Robert Lafore", 599.99, true);

        book.display();
        book.borrowBook();
        book.display();
    }
}
