import java.util.*;

public class TTView {
    private Scanner s;

    public TTView() {
        s = new Scanner(System.in);
    }

    public void printBoard(String board) {
        System.out.println("Current board: ");
        System.out.println(board);
    }

    public int getMove(char turn, String type) {
        System.out.printf("%c, enter %s: ", turn, type);
        return Integer.parseInt(s.nextLine());
    }

    public void printError() {
        System.out.println("Bad move, go again.");
    }

    public void inputNotInteger() {
        System.out.println("Input must be an integer.");
    }

    public void printEndOfGame(String msg) {
        System.out.println("Game over: " + msg);
    }
}