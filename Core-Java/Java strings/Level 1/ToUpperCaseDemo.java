import java.util.Scanner;

public class ToUpperCaseDemo {
    
    // Convert manually
    public static String customToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    // Compare strings
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String userUpper = customToUpperCase(str);
        String builtInUpper = str.toUpperCase();

        System.out.println("Custom Uppercase: " + userUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);

        System.out.println("Are they equal? " + compareStrings(userUpper, builtInUpper));
    }
}
