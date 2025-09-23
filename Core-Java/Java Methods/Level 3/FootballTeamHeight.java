import java.util.Arrays;

public class FootballTeamHeight {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150 to 250
        }
        return heights;
    }

    // Method to calculate sum of heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = calculateMean(heights);

        System.out.println("\nShortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
    }
}