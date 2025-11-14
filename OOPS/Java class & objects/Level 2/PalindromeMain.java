class PalindromeChecker {
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome.");
        else
            System.out.println(text + " is NOT a Palindrome.");
    }
}

public class PalindromeMain {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        p1.displayResult();

        PalindromeChecker p2 = new PalindromeChecker("hello");
        p2.displayResult();
    }
}
