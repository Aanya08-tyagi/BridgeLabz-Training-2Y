import java.util.*;

public class Factors {
    public static int[] findFactors(int num) {
        // First loop: count factors
        int count = 0;
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

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double sumSquareFactors(int[] factors) {
        double sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum of factors = " + sumFactors(factors));
        System.out.println("Product of factors = " + productFactors(factors));
        System.out.println("Sum of squares of factors = " + sumSquareFactors(factors));
    }
}
