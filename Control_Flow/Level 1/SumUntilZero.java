import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;

        System.out.println("Enter numbers (0 to stop):");
        num = sc.nextDouble();

        while (num != 0) {
            total += num;
            num = sc.nextDouble();
        }

        System.out.println("The total sum is: " + total);

        sc.close();
    }
}
