public class Proj8 {
	public static void main(String[] args) {
		Board b = new Board();
		View v = new View();
		
		char turn, dir;
		boolean success;
		boolean gameOver = false;

		boolean cheat = false;
		if (args.length == 1 && args[0].equals("--cheat")) {
			cheat = true;
		}
		
		do {
			if (cheat) v.printCheat(b.toString());

			v.printMsg(b.evaluateSpot());
			turn = v.getOption();
			switch (turn) {
				case 'm':
					success = b.move(v.getDirection());
					if (!success) v.printError("There is a wall there.");
					break;
				case 's':
					if (b.hasArrow()) {
						success = b.shoot(v.getDirection());
						if (success) v.printMsg("You hear a scream.");
						else v.printError("Your arrow misses the Wumpus.");
					}
					else v.printError("You do not have an arrow.");
					break;
				case 'g':
					if (b.grabGold()) v.printMsg("You pick up the gold.");
					else v.printError("There is no gold there.");
					break;
				case 'c':
					if (b.climb()) v.printMsg("You climb out of the cave.");
					else v.printError("You are not at the cave exit.");
					break;
				default:
					v.printError("Invalid option.");
			}
			
			gameOver = b.amEaten() || b.fallen() || b.escaped();
		} while (!gameOver);
		
		if (b.amEaten()) {
			v.endGame("You have been eaten by a Wumpus!");
		}
		else if (b.fallen()) {
			v.endGame("You have fallen into a pit!");
		}
		else if (b.escaped()) {
			if (b.hasGold()) {
				String msg = "You leave the cave with the gold!";
				if (b.wumpusGone()) msg += " The Wumpus is dead. You win!";
				else msg += " The Wumpus is still alive. You lose.";
				v.endGame(msg);
				
			}
			else {
				String msg = "You leave the cave without the gold.";
				if (b.wumpusGone()) msg += " The Wumpus is dead. You lose.";
				else msg += " The Wumpus is still alive. You lose.";
				v.endGame(msg);
			}
		}
	}
}