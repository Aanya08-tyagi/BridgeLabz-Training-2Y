import java.util.Scanner;

public class BMICalculator1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        // Input weights and heights
        for (int i = 0; i < number; i++) {
            System.out.print("\nEnter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            if (weight[i] <= 0) {
                System.out.println("Invalid! Enter a positive weight.");
                i--;
                continue;
            }

            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            if (height[i] <= 0) {
                System.out.println("Invalid! Enter a positive height.");
                i--;
                continue;
            }
        }

        // Calculate BMI and status
        for (int i = 0; i < number; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                    (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
    }
}
