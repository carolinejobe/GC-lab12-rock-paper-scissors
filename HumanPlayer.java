

import java.util.Scanner;

public class HumanPlayer extends Player{
	static int gameCount = 0;
	
	public String getName(Scanner input){
		String name = input.nextLine();
		return name;
	}
	public static int getGameCount() {
		return gameCount;
		
	}

	int selectOpponent() {
		int opponent = ValidateString.getRangedInteger( "Select an opponent: (1 or 2)", 1, 2);
		
		gameCount++;
		return opponent;  //this will determine whether RockPlayer or RandomPlayer calls generateRoshambo()
	}
	@Override
	String generateRoshambo() {
		String choice = ValidateString.validateChoice("Select \"rock,\" \"paper,\" or \"scissors\": ");
		return choice;
	}
	
	

}
