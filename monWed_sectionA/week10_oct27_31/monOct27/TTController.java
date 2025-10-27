import java.util.*;

public class TTController {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        TTView view = new TTView();

        view.printBoard(game.toString());

        //has someone won?
        boolean winner = false;

        while (!game.isFull()) {
            int row = -1;
            int col = -1;
            
            try {
                row = view.getMove(game.getTurn(), "row");
                col = view.getMove(game.getTurn(), "column");
            
            }
            catch (NumberFormatException ex) {
                view.inputNotInteger();
                continue;
            }

            //validate the user input
            if (game.isValid(row, col)) {
                //put in their piece
                game.move(row, col);

                view.printBoard(game.toString());

                //did they win?
                winner = game.isWinner();
                if (winner) break;
                else {
                    //switch whose turn
                    game.switchTurn();
                }
            }
            else {
                //must have been a bad move
                view.printError();
            }
        }

        //did someone win?
        if (winner) {
            view.printEndOfGame(String.format("%c wins!%n", game.getTurn()));
        }
        else {
            view.printEndOfGame("Tie game");
        }
    }
}