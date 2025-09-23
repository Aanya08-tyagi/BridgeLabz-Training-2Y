import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for member " + (i+1) + ": ");
            members[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for member " + (i+1) + ": ");
            members[i][1] = sc.nextDouble();

            members[i][2] = calculateBMI(members[i][0], members[i][1]);
        }

        System.out.println("\nResults:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i+1) + " → Weight: " + members[i][0] +
                               " kg, Height: " + members[i][1] +
                               " cm, BMI: " + members[i][2] +
                               " (" + bmiStatus(members[i][2]) + ")");
        }
        sc.close();
    }
}
