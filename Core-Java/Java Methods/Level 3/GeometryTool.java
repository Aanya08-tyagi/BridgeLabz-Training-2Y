import java.util.Scanner;

public class GeometryTool {

    // Method to calculate Euclidean distance
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    // Method to calculate slope and y-intercept
    public static double[] calculateLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double)(y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coordinates of Point 1 (x1 y1): ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.print("Enter coordinates of Point 2 (x2 y2): ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);

        System.out.printf("\nEuclidean Distance: %.2f\n", distance);
        System.out.printf("Equation of Line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);

        sc.close();
    }
}