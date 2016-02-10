
// separate this into getting input and validating!


import java.util.Scanner;

public class ValidateString {

	static Scanner input = new Scanner(System.in);
	static String play;

	public static String validateChoice(String prompt) {
		System.out.println(prompt);
		input.nextLine();
		String answer = input.nextLine().toLowerCase();
		while (!answer.equalsIgnoreCase("rock") && !answer.equalsIgnoreCase("paper")
				&& !answer.equalsIgnoreCase("scissors")) {
			System.out.println("You have entered invalid data. " + prompt);
			System.out.println("");
			answer = input.nextLine();
			continue;
		}
		return answer;
	}
	
	//prompt user to input, validate for input to be integer
	private static int getInteger(String prompt) {
		System.out.println(prompt);
		while (!input.hasNextInt()) {
			System.out.println("You have entered invalid data. " + prompt);
			input.next();
		}
		int answer = input.nextInt();
		return answer;
	}

	//prompt user for input, validate for input to be integer in a range
	static int getRangedInteger(String prompt, int min, int max) {
		int answer = getInteger(prompt);
		while (answer > max || answer < min) {
			answer = getInteger("Please enter a number from " + min + " to " + max + ": ");
		}
		return answer;
	}
	
	static String continueOrQuit(String prompt) {
		System.out.println(prompt);
		play = input.nextLine();
		while (!play.equalsIgnoreCase("Y") && !play.equalsIgnoreCase("N")) {
			System.out.println("Invalid input." + prompt);
			play = input.nextLine();
			continue;
		}
		return play;
	}

	static String getUserTitle(String prompt) {
		System.out.println(prompt);
		return input.nextLine();
	}

}
