 public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        java.io.Console console = System.console();
        if (console == null) {
            System.out.println("Console not available. Please run from a terminal.");
            return;
        }
        String input = console.readLine("Enter temperature in Celsius: ");
        double celsius = Double.parseDouble(input);
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
    }
}