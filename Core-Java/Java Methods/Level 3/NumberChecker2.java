import java.util.Scanner;

public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad
    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && num % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // Digits 0–9
        for (int d : digits) {
            freq[d]++;
        }

        // Count how many digits actually appear
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }

        return result;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digitCount = countDigits(num);
        int[] digits = getDigitsArray(num);

        System.out.println("\nDigit count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int sum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);
        boolean harshad = isHarshad(num, digits);
        int[][] freq = digitFrequency(digits);

        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + squareSum);
        System.out.println("Harshad Number: " + (harshad ? "Yes" : "No"));

        System.out.println("\nDigit Frequencies:");
        System.out.println("Digit\tFrequency");
        for (int[] row : freq) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        sc.close();
    }
}