import java.util.Scanner;

public class SubstringCharAt {
    
    // Method to create substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String userSub = customSubstring(str, start, end);
        String builtInSub = str.substring(start, end);

        System.out.println("Substring using charAt(): " + userSub);
        System.out.println("Substring using substring(): " + builtInSub);

        if (compareStrings(userSub, builtInSub))
            System.out.println("✅ Both substrings are SAME");
        else
            System.out.println("❌ Substrings are DIFFERENT");
    }
}
