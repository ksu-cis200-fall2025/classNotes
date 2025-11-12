import java.util.*;

/**
 * View represents the view component in an MVC architecture for Wumpus world
 * 
 * @author Julie Thornton
 * @version Project 8
 */

public class View {
	private Scanner s;
	
	/**
	 * Constructs a new view
	 */
	public View() {
		s = new Scanner(System.in);
	}
	
	/**
	 * Gets a turn option from the user
	 * 
	 * @return a character representing the selection ('m' = move, 's' = shoot, 'g' = grab, 'c' = climb)
	 */
	public char getOption() {
		System.out.print("Enter (m)ove, (s)hoot, (g)rab, or (c)limb: ");
		return (s.nextLine().toLowerCase()).charAt(0);
	}
	
	/**
	 * Gets the direction the user wants to move
	 * 
	 * @return a character representing the direction ('u' = up, 'd' = down, 'l' = left, 'r' = right)
	 */
	public char getDirection() {
		System.out.print("Enter (u)p, (d)own, (l)eft, or (r)ight: ");
		return (s.nextLine().toLowerCase()).charAt(0);
	}
	
	/**
	 * Prints a message to the console
	 * 
	 * @param msg The message to print
	 */
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	
	/**
	 * Prints an error to the console
	 * 
	 * @param error The error message to print
	 */
	public void printError(String error) {
		System.out.println(error);
	}
	

	/**
	 * Prints end of game information to the console
	 * 
	 * @param msg The end of game information string
	 */
	public void endGame(String msg) {
		System.out.println(msg);
	}

	/**
	 * Prints the current game board information
	 * 
	 * @param curGame A string containing the board and player current state
	 */
	public void printCheat(String curGame) {
		System.out.println("Current game:");
		System.out.println(curGame);
	}
}