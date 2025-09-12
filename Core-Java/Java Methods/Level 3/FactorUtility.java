import java.util.Scanner;

public class FactorUtility {

    // Method to find factors and return them as an array
    public static int[] findFactors(int num) {
        int count = 0;

        // First loop: count number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        // Second loop: store factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find the product of cubes of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("\nFactors of " + num + ": ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        int greatest = findGreatestFactor(factors);
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        double cubeProduct = productOfCubes(factors);

        System.out.println("\nGreatest Factor: " + greatest);
        System.out.println("Sum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Product of Cubes of Factors: " + String.format("%.2f", cubeProduct));

        sc.close();
    }
}