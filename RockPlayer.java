

public class RockPlayer extends Player {

	@Override
	public String generateRoshambo() {
		System.out.println("Your opponent threw  " + RoshamboChoice.ROCK.toString());

		return RoshamboChoice.ROCK.toString();
	}

	
}
