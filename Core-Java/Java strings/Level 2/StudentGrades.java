import java.util.*;

public class StudentGrades {

    // Generate random marks
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics
            scores[i][1] = 40 + rand.nextInt(61); // Chemistry
            scores[i][2] = 40 + rand.nextInt(61); // Math
        }
        return scores;
    }

    // Calculate total, avg, %
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = Math.round((total / 3.0) * 100.0 / 100.0);
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }

    // Calculate grade
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];
            if (p >= 90) grades[i] = "A+";
            else if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B+";
            else if (p >= 60) grades[i] = "B";
            else if (p >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void display(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                    (int)results[i][0] + "\t" + String.format("%.2f", results[i][1]) + "\t" + 
                    String.format("%.2f", results[i][2]) + "\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        display(scores, results, grades);
    }
}
