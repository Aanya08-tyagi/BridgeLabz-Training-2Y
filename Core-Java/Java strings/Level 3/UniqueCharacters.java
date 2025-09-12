import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique characters
    public static char[] findUnique(String text) {
        int n = findLength(text);
        char[] result = new char[n]; // store unique chars
        int index = 0;

        for (int i = 0; i < n; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // check if already appeared
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

        // create new array with only unique chars
        char[] unique = new char[index];
        for (int i = 0; i < index; i++) {
            unique[i] = result[i];
        }

        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUnique(text);

        System.out.print("Unique Characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        sc.close();
    }
}
