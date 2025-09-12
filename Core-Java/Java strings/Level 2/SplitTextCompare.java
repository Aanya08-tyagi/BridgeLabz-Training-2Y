import java.util.Scanner;

public class SplitTextCompare {
    
    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Method to split words manually without split()
    public static String[] manualSplit(String text) {
        int n = findLength(text);
        
        // Count spaces = words - 1
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ')
                spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        String temp = "";

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                temp += c;
            } else {
                words[wordIndex++] = temp;
                temp = "";
            }
        }
        words[wordIndex] = temp; // last word
        return words;
    }

    // Compare two arrays
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("\nManual Split:");
        for (String w : manual) System.out.print(w + " | ");

        System.out.println("\n\nBuilt-in Split:");
        for (String w : builtin) System.out.print(w + " | ");

        System.out.println("\n\nComparison Result: " + compareArrays(manual, builtin));
    }
}

