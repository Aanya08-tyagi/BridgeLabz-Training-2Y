import java.util.Scanner;

public class WordsWithLength {
    
    // Method to find length without length()
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

    // Split manually
    public static String[] manualSplit(String text) {
        int n = findLength(text);
        int spaceCount = 0;
        for (int i = 0; i < n; i++) if (text.charAt(i) == ' ') spaceCount++;
        String[] words = new String[spaceCount + 1];
        
        int idx = 0;
        String temp = "";
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                words[idx++] = temp;
                temp = "";
            }
        }
        words[idx] = temp;
        return words;
    }

    // Method to create 2D array [word, length]
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Display in tabular format
    public static void display(String[][] arr) {
        System.out.println("Word\tLength");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + Integer.parseInt(arr[i][1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordsWithLength(words);

        display(table);
    }
}
