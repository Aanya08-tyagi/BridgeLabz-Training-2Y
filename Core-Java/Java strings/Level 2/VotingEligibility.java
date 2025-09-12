import java.util.Random;

public class VotingEligibility {

    // Generate random ages
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(50); // age between 10 and 59
        }
        return ages;
    }

    // Check voting eligibility
    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) result[i][1] = "Can Vote";
            else result[i][1] = "Cannot Vote";
        }
        return result;
    }

    // Display
    public static void display(String[][] table) {
        System.out.println("Age\tEligibility");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVoting(ages);
        display(result);
    }
}
