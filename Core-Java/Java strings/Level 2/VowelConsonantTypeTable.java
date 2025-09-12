import java.util.Scanner;

public class VowelConsonantTypeTable {

    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharType(str.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = analyzeString(text);
        displayTable(result);
    }
}
