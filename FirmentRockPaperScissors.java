import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FirmentRockPaperScissors {

	public static void main(String[] args) {

		String[] options = { "Rock", "Paper", "Scissors" };

		HashMap<String, String> outcomes = new HashMap<String, String>();
		outcomes.put("RockRock", "Tie. The two Rocks bump against each other.");
		outcomes.put("RockPaper",
				"Computer wins. Sorry, the computer won by wrapping Paper around your Rock.");
		outcomes.put("RockScissors",
				"You win! Your Rock smashed the computer's Scissors!");
		outcomes.put("ScissorsRock",
				"Computer wins. Your Scissors are blunted by the computer's Rock.");
		outcomes.put("ScissorsPaper",
				"You win! Your Scissors cut the computer's Paper neatly in half.");
		outcomes.put("ScissorsScissors",
				"Tie. Like master swordsmen, the two pairs of Scissors dueled to a tie.");
		outcomes.put("PaperRock",
				"You win! Your Paper wraps around the computer's Rock.");
		outcomes.put("PaperPaper", "\n\n"
				+ "Two Papers slide past\n"
				+ "Pages flutter in the breeze\n"
				+ "This game is a tie"
				+ "\n\n");
		outcomes.put("PaperScissors",
				"Computer wins. The computer cuts your paper in half using Scissors.");

		int randomComputer = (int) (Math.random() * 2); // Computer makes selection

		System.out.println("Let's play Rock, Paper, Scissors.\n");
		System.out
				.println("In this game both players make one of three choices: rock, paper or scissors.\n"
						+ "The players reveal their selection at the same time to determine the winner.\n"
						+ "When both players make the same selection, the game ends in a tie.\n"
						+ "Rock beats Scissors. Scissors beats Paper. Paper beats Rock.");
		// QA Cheat Mode
		// System.out.println("(Pssst. The computer has chosen " + options[randomComputer] + ".)");
		System.out.println();
		System.out
				.println("Let's begin. \nWould you like to use Rock, Paper, or Scissors?");
		System.out
				.println("Make your selection then press [Enter]. Rock = 0, Paper = 1, Scissors = 2.");

		// Accept/validate input, play the game
		try {
			Scanner myScanner = new Scanner(System.in);
			int randomUser = myScanner.nextInt();
			String chosen = options[randomUser];

			System.out
					.print("You have chosen "+ chosen + ". \n"
							+ "When you are ready, type GO then press [Enter] to throw. Ready?");
			String x = myScanner.next(); // FUTURE TO DO - Explore allowing any key to continue.

			String result = options[randomUser] + options[randomComputer]; // Create the hashmap key
			System.out.println("You chose " + options[randomUser]
					+ " and the computer chose " + options[randomComputer] + ".");
			System.out.println(outcomes.get(result)); // Display win/lose information
			myScanner.close();
		} catch (InputMismatchException e) {
			System.out
					.print("The game has ended because a non-integer value was entered. \n"
							+ "During your next game, please enter an integer between 0 and 2.");
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.print("The game has ended because an integer that is not 0, 1 or 2 was entered. \n"
							+ "During your next game, please enter an integer between 0 and 2.");
			System.exit(2);
		}

	}
}
