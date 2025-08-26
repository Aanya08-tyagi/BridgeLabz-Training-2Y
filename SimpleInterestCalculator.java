public class SimpleInterestCalculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt for Principal
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt for Rate
        System.out.print("Enter the Rate of interest (in %): ");
        double rate = scanner.nextDouble();

        // Prompt for Time
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double interest = (principal * rate * time) / 100;

        // Display result
        System.out.printf("Simple Interest = %.2f%n", interest);

        scanner.close();
    }
}