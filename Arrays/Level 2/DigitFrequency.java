import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Frequency array
        int[] freq = new int[10];

        // Count digits
        long temp = num;
        while (temp > 0) {
            int digit = (int)(temp % 10);
            freq[digit]++;
            temp /= 10;
        }

        // Display frequency
        System.out.println("\nDigit Frequency in " + num + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s).");
            }
        }
    }
}
