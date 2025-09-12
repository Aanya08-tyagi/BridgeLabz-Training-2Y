import java.util.Scanner;

public class NumberChecker5 {
    

    // Method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    // Method to check if number is perfect
    public static boolean isPerfect(int num) {
        return num > 0 && sumOfProperDivisors(num) == num;
    }

    // Method to check if number is abundant
    public static boolean isAbundant(int num) {
        return num > 0 && sumOfProperDivisors(num) > num;
    }

    // Method to check if number is deficient
    public static boolean isDeficient(int num) {
        return num > 0 && sumOfProperDivisors(num) < num;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if number is strong
    public static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nResults for number: " + num);
        System.out.println("Perfect Number: " + (isPerfect(num) ? "Yes" : "No"));
        System.out.println("Abundant Number: " + (isAbundant(num) ? "Yes" : "No"));
        System.out.println("Deficient Number: " + (isDeficient(num) ? "Yes" : "No"));
        System.out.println("Strong Number: " + (isStrong(num) ? "Yes" : "No"));

        sc.close();
    }
}