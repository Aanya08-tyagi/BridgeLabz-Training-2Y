import java.util.Scanner;

public class Friends {
    public static String youngest(int[] ages, String[] names) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) minAgeIndex = i;
        }
        return names[minAgeIndex];
    }

    public static String tallest(int[] heights, String[] names) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) maxHeightIndex = i;
        }
        return names[maxHeightIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println("Youngest: " + youngest(ages, names));
        System.out.println("Tallest: " + tallest(heights, names));
    }
}
