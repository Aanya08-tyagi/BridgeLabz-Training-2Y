import java.util.Scanner;

public class ShortestLongestWord {

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

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestLongest(String[][] table) {
        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = Integer.parseInt(table[0][1]);
        String minWord = table[0][0];
        String maxWord = table[0][0];

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < minLen) {
                minLen = len;
                minWord = table[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                maxWord = table[i][0];
            }
        }
        return new String[]{minWord, maxWord};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordsWithLength(words);

        String[] result = findShortestLongest(table);
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
