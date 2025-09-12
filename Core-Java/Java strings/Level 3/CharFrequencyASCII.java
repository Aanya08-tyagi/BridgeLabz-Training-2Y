import java.util.Scanner;

public class CharFrequencyASCII {

    // Method to find frequency using ASCII
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // store frequency of ASCII chars

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Store results in 2D String array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character  Frequency");
        for (String[] row : result) {
            System.out.println("   " + row[0] + "         " + row[1]);
        }
        sc.close();
    }
}
