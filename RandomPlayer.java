

import java.util.Random;

public class RandomPlayer extends Player {
	
	@Override
	String generateRoshambo() {
		Random r = new Random();
		int choice = r.nextInt(3);
		System.out.println("Your opponent threw " + RoshamboChoice.values()[choice].toString());
		return RoshamboChoice.values()[choice].toString();
		
	}

}
