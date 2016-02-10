

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		int winCount = 0;
		int lossCount = 0;
		int drawCount = 0;

		String play = "y";
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Rock-Paper-Scissors Tournament!");
		System.out.println("\t _______");
		System.out.println("  O O \t |      |\t   /0rock0\\ ");
		System.out.println("   X  \t |      |\t  /00rock000\\ ");
		System.out.println("  / \\ \t |      |\t /0rock0rock0\\ ");
		System.out.println("\t _______ \t/0rock00000rock\\ ");
		System.out.println("");
		System.out.println("Please enter your name:");
		
		HumanPlayer guy = new HumanPlayer();
		String name = guy.getName(input);

		while (play.equalsIgnoreCase("y")) {

			int opponent = guy.selectOpponent();

			String humanThrow = guy.generateRoshambo();

			if (opponent == 1) {
				Player randomGuy = new RandomPlayer();
				String opponentThrow = randomGuy.generateRoshambo();
				if (humanThrow.equalsIgnoreCase(opponentThrow)) {
					System.out.println("Draw!");
				} else if ((humanThrow.equalsIgnoreCase("rock") && opponentThrow.equalsIgnoreCase("scissors"))
						|| (humanThrow.equalsIgnoreCase("paper") && opponentThrow.equalsIgnoreCase("rock"))
						|| (humanThrow.equalsIgnoreCase("scissors") && opponentThrow.equalsIgnoreCase("paper"))) {
					System.out.println("You win!");
					winCount++;
				} else {
					System.out.println("You lose!");
					lossCount++;
				}
			} else if (opponent == 2) {
				Player rockGuy = new RockPlayer();
				rockGuy.generateRoshambo();

				if (humanThrow.equalsIgnoreCase("paper")) {
					System.out.println("You WIN!!!");
					winCount++;
				}

				else if (humanThrow.equalsIgnoreCase("rock")) {
					System.out.println("Draw");
					drawCount++;
				} else if (humanThrow.equalsIgnoreCase("scissors")) {
					lossCount++;
					System.out.println("You LOSE!");
				}

			}

			play = ValidateString.continueOrQuit("Would you like to play again? (y/n)");
			// if quit, output wins/losses
		}
		System.out.println("Goodbye " + name + ".\n\n" + "Out of " + HumanPlayer.getGameCount() +" game(s):\n" 
						+ "\tYou lost " + lossCount +"\n"  
						+ "\tYou won "+ winCount  + "\n"
						+ "\tYou had " +drawCount + " draws");
	}

}
