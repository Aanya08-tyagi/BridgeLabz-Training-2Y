import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt for three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        // Calculate average
        double average = (num1 + num2 + num3) / 3;
        // Display result
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.2f%n", num1, num2, num3, average);
        scanner.close();
    }
}