import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random PCM scores for each student
    public static int[][] generateScores(int count) {
        int[][] scores = new int[count][3]; // [Physics, Chemistry, Math]
        for (int i = 0; i < count; i++) {
            scores[i][0] = 50 + (int)(Math.random() * 50); // Physics
            scores[i][1] = 50 + (int)(Math.random() * 50); // Chemistry
            scores[i][2] = 50 + (int)(Math.random() * 50); // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // [Total, Average, Percentage]
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("S%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\n",
                    (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        int[][] scores = generateScores(count);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);

        sc.close();
    }
}