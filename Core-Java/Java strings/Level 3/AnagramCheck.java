import java.util.Scanner;

public class AnagramCheck {
    
    // Method to check if two strings are anagrams
    static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length())
            return false;

        int[] freq1 = new int[256]; // ASCII table size
        int[] freq2 = new int[256];

        // Count frequency
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }

        // Compare frequency
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2))
            System.out.println("The texts are anagrams.");
        else
            System.out.println("The texts are NOT anagrams.");
    }
}
