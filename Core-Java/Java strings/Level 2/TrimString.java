import java.util.Scanner;

public class TrimString {

    // Method to trim spaces manually
    public static int[] trimSpaces(String str) {
        int start = 0, end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    // Method to create substring manually
    public static String substringManual(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Compare two strings manually
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String text = sc.nextLine();

        int[] pos = trimSpaces(text);
        String manualTrim = substringManual(text, pos[0], pos[1]);
        String builtinTrim = text.trim();

        System.out.println("Manual Trim: " + manualTrim);
        System.out.println("Built-in Trim: " + builtinTrim);
        System.out.println("Are they same? " + compareStrings(manualTrim, builtinTrim));
    }
}
