public class RectanglePerimeter {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt for length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Prompt for width
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // Display result
        System.out.printf("The perimeter of the rectangle is %.2f units.%n", perimeter);

        scanner.close();
    }
}