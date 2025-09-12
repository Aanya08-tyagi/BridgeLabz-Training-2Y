import java.util.Scanner;

public class CharFrequencyUnique {

    // Method to find unique characters
    public static char[] findUnique(String text) {
        char[] result = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[index++] = current;
            }
        }

        char[] unique = new char[index];
        for (int i = 0; i < index; i++) {
            unique[i] = result[i];
        }

        return unique;
    }

    // Method to find frequency
    public static String[][] findFrequency(String text) {
        char[] uniqueChars = findUnique(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChars[i]) {
                    count++;
                }
            }
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(count);
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
