import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if number is palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digitCount = countDigits(num);
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseArray(digits);
        boolean isPalin = isPalindrome(digits);
        boolean isDuck = isDuckNumber(digits);

        System.out.println("\nDigit count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.print("\nReversed: ");
        for (int r : reversed) System.out.print(r + " ");
        System.out.println("\nArrays equal: " + (areArraysEqual(digits, reversed) ? "Yes" : "No"));
        System.out.println("Palindrome Number: " + (isPalin ? "Yes" : "No"));
        System.out.println("Duck Number: " + (isDuck ? "Yes" : "No"));

        sc.close();
    }
}