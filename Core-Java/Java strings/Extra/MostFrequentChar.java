import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256]; // ASCII size
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int maxFreq = 0;
        char mostFreqChar = ' ';
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFreqChar = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFreqChar + "'");
        sc.close();
    }
}
