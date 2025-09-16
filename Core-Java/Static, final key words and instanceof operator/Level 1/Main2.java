class Book {
    // Static variable
    static String libraryName = "Central Library";

    // Final variable
    final String isbn;

    // Instance variables
    String title, author;

    // Constructor using 'this'
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    // Display details using instanceof
    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "Herbert Schildt", "ISBN123");
        Book b2 = new Book("Python Crash Course", "Eric Matthes", "ISBN456");

        Book.displayLibraryName();
        b1.displayDetails();
        b2.displayDetails();
    }
}
