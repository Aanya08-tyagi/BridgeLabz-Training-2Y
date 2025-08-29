import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // [i][0] = weight, [i][1] = height, [i][2] = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input
        for (int i = 0; i < number; i++) {
            System.out.print("\nEnter weight (kg) of person " + (i + 1) + ": ");
            double w = sc.nextDouble();
            if (w <= 0) {
                System.out.println("Invalid! Enter a positive weight.");
                i--;
                continue;
            }

            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            double h = sc.nextDouble();
            if (h <= 0) {
                System.out.println("Invalid! Enter a positive height.");
                i--;
                continue;
            }

            personData[i][0] = w; // weight
            personData[i][1] = h; // height
            personData[i][2] = w / (h * h); // BMI

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report (2D Array) ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
