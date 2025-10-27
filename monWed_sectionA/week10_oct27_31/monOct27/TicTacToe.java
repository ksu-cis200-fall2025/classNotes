public class TicTacToe {
    public static final int SIZE = 3;
    private char[][] board;
    private char turn;

    public TicTacToe() {
        board = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '_';
            }
        }

        turn = 'X';
    }

    public char getTurn() {
        return turn;
    }

    public void switchTurn() {
        if (turn == 'X') turn = 'O';
        else turn = 'X';
    }

    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '_') return false;
            }
        }

        return true;
    }

    public boolean isValid(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '_';
    }

    public boolean isWinner() {
        for (int i = 0; i < 3; i++) {
            //did they win on a row?
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == turn) {
                return true;
            }

            //did they win on a column?
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == turn) {
                return true;
            }
        }

        //did they win on a / diagonal?
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == turn) {
            return true;
        }

        //did they win on a \ diagonal?
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == turn) {
            return true;
        }

        return false;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                build.append(board[i][j] + " ");
            }
            build.append("\n");
        }

        return build.toString();
    }

    public void move(int row, int col) {
        board[row][col] = turn;
    }
}