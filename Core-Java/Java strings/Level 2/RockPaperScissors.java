import java.util.*;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        int idx = (int)(Math.random() * 3);
        return options[idx];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userWins = 0, compWins = 0, draws = 0;

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            System.out.println("Computer: " + comp + " → Winner: " + winner);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);
        System.out.println("User Win %: " + (userWins * 100.0 / games));
        System.out.println("Computer Win %: " + (compWins * 100.0 / games));
    }
}
