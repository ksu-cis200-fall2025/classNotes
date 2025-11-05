import java.util.*;

public class View {
	private Scanner s;
	
	public View() {
		s = new Scanner(System.in);
	}
	
	public char getOption() {
		System.out.print("Enter (m)ove, (s)hoot, (g)rab, or (c)limb: ");
		return (s.nextLine().toLowerCase()).charAt(0);
	}
	
	public char getDirection() {
		System.out.print("Enter (u)p, (d)own, (l)eft, or (r)ight: ");
		return (s.nextLine().toLowerCase()).charAt(0);
	}
	
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	
	public void printError(String error) {
		System.out.println(error);
	}
	
	public void endGame(String msg) {
		System.out.println(msg);
	}

	public void printCheat(String curGame) {
		System.out.println("Current game:");
		System.out.println(curGame);
	}
}