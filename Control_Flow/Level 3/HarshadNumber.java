
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;   // To preserve original number
        int sum = 0;

        // Extracting digits and finding sum
        while (temp > 0) {
            int digit = temp % 10;  // Get last digit
            sum += digit;           // Add digit to sum
            temp = temp / 10;       // Remove last digit
        }

        // Checking Harshad condition
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is NOT a Harshad Number.");
        }
    }
}
