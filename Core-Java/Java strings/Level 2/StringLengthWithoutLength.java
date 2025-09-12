import java.util.Scanner;

public class StringLengthWithoutLength {
    
    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  // will throw exception after last character
                count++;
            }
        } catch (Exception e) {
            // Exception means we reached beyond the string length
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input
        System.out.print("Enter a string: ");
        String input = sc.next();
        
        // User-defined method
        int myLength = findLength(input);
        
        // Built-in method
        int actualLength = input.length();
        
        // Display results
        System.out.println("Length using user-defined method: " + myLength);
        System.out.println("Length using built-in length() method: " + actualLength);
    }
}
