import java.util.*;

public class Oct28 {

    public static void main(String[] args) {
        View v = new View();
        TicTacToe ttt = new TicTacToe();

        v.printBoard(ttt.toString());

        //has someone won?
        boolean winner = false;

        while (!ttt.isFull()) {
            int row = -1;
            int col = -1;
            try {
                row = v.getMove(ttt.getTurn(), "row");
                col = v.getMove(ttt.getTurn(), "column");
            }
            catch (NumberFormatException ex) {
                //print an error message
                v.printBadInput();
                continue;
            }
            

            //validate the user input
            if (ttt.isValid(row, col)) {
                //put in their piece
                ttt.move(row, col);

                v.printBoard(ttt.toString());

                //did they win?
                winner = ttt.isWinner();
                if (winner) break;
                else {
                    ttt.changeTurn();
                }
            }
            else {
                //must have been a bad move
                v.printInvalid();
            }
        }

        //did someone win?
        if (winner) {
            v.gameOver(String.format("%c wins!%n", ttt.getTurn()));
        }
        else {
            v.gameOver("Tie game");
        }
    }
}