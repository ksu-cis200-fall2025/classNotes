import java.util.*;

public class View {
    private Scanner s;

    public View() {
        s= new Scanner(System.in);
    }

    //methods
    //one for each user input
    public int getMove(char turn, String type) {
        System.out.printf("%c, enter %s: ", turn, type);
        return Integer.parseInt(s.nextLine());
    }

    //one for each output
    public void printBoard(String board) {
        System.out.println("Current board:");
        System.out.println(board);
    }

    public void printInvalid() {
        System.out.println("Bad move, go again.");
    }

    public void gameOver(String msg) {
        System.out.println("Game over: " + msg);
    }

    public void printBadInput() {
        System.out.println("Error: input must be an integer");
    }
}