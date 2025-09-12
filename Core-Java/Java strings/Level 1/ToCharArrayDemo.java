import java.util.Scanner;

public class ToCharArrayDemo {
    
    // Convert string to char array manually
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] userArr = customToCharArray(str);
        char[] builtInArr = str.toCharArray();

        System.out.println("Characters using custom method:");
        for (char c : userArr) System.out.print(c + " ");
        
        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtInArr) System.out.print(c + " ");

        System.out.println("\nComparison result: " + compareArrays(userArr, builtInArr));
    }
}
