import java.util.Scanner;

public class StringIndexOutDemo {

    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // Invalid index
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        // Uncomment to see crash
        // generateException(str);

        handleException(str);
    }
}
