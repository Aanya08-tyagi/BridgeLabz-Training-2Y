import java.util.Scanner;

public class NumberCheck {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i]))
                    System.out.println(numbers[i] + " is Positive and Even");
                else
                    System.out.println(numbers[i] + " is Positive and Odd");
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 0)
            System.out.println("First and Last elements are Equal");
        else if (result > 0)
            System.out.println("First element is Greater than Last");
        else
            System.out.println("First element is Smaller than Last");

        sc.close();
    }
}
