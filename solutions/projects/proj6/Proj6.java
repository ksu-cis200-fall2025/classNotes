/**
 * This program is a two-player Connect Four game.  The players
 * alternate turns dropping pieces in columns.  The first player to
 * get four in a row (row, column, or diagonal) wins.  If the board fills
 * first, the game is a tie.
 *
 * @author Julie Thornton
 * @version Project 6
 */

import java.util.*;

public class Proj6 {
	public static int[][] board;
	public static Scanner s;

    //These constants are recommended but not required
	public static final int BLANK = 0;
	public static final int USER1 = 1;
	public static final int USER2 = 2;
	public static final int ROWS = 6;
	public static final int COLS = 7;

	/**
	 * main controls the flow of the program -- alternating turns,
	 * printing the board, and checking for a win or tie.
	 */

	public static void main(String[] args) {
		board = new int[ROWS][COLS];
		s = new Scanner(System.in);

		printBoard();
		while (!userWins(1) && !userWins(2) && !boardFull()) {
			userMove(1);
			printBoard();
			if (userWins(1)) break;
			userMove(2);
			printBoard();
		}

		if (userWins(1)) {
			System.out.println("User 1 wins (O)");
		}
		else if (userWins(2)) {
			System.out.println("User 2 wins (X)");
		}
		else {
			System.out.println("Tie: board full");
		}
	}

	/*
	 * This method lets user #num drop their next piece.
	 * IF they choose an invalid column, they are prompted again.
	 *
	 * @param num 1 for user 1 (O) and 2 for user 2 (X)
	 */

	public static void userMove(int num) {
		if (num == 1) System.out.print("User 1 (O), ");
		else System.out.print("User 2 (X), ");

		System.out.print("enter a column (0-6): ");
		int move = Integer.parseInt(s.nextLine());
		if (move < 0 || move > 6) {
			System.out.println("Invalid column number");
			userMove(num);
		}
		else if (board[0][move] != BLANK) {
			System.out.println("Column is full");
			userMove(num);
		}
		else {
			int i;
			for (i = ROWS-1; i>=0 && board[i][move] != BLANK; i--) ;
			if (num == 1) board[i][move] = USER1;
			else board[i][move] = USER2;
		}
	}

	/**
	 * userWins returns whether user #num has four in a row
	 * on a row, column, or diagonal
	 *
	 * @param num 1 for user1, 2 for user2
	 * @return Whether user #num has four in a row
	 */

	public static boolean userWins(int num) {
		int piece = USER1;
		if (num == 2) piece = USER2;

		//check row win
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS-4; j++) {
				int x;
				for(x = 0; x < 4; x++) {
					if (board[i][j+x] != piece) break;
				}
				if (x == 4) return true;
			}
		}

		//check column win
		for (int j = 0; j < COLS; j++) {
			for (int i = 0; i < ROWS-4; i++) {
				int x;
				for (x = 0; x < 4; x++) {
					if (board[i+x][j] != piece) break;
				}
				if (x == 4) return true;
			}
		}

		//check / diagonals
		for (int i = 0; i < ROWS-3; i++) {
			for (int j = 0; j < COLS-3; j++) {
				int x;
				for (x = 0; x < 4; x++) {
					if (board[i+x][j+3-x] != piece) break;
				}
				if (x == 4) return true;
			}
		}

		//check \ diagonals
		for (int i = 0; i < ROWS-3; i++) {
			for (int j = 0; j < COLS-3; j++) {
				int x;
				for (x = 0; x < 4; x++) {
					if (board[i+x][j+x] != piece) break;
				}
				if (x == 4) return true;
			}
		}

		return false;
	}

	/**
	 * Returns whether the board is full of pieces
	 *
	 * @return Whether the board is full of pieces
	 */

	public static boolean boardFull() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				if (board[i][j] == BLANK) return false;
			}
		}

		return true;
	}

	/**
	 * Prints the current board to the screen
	 */

	public static void printBoard() {
		System.out.println("\nCurrent Board (user1 = O, user2 = X): \n");
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				switch(board[i][j]) {
					case BLANK:
						System.out.print("_ ");
						break;
					case USER1:
						System.out.print("O ");
						break;
					case USER2:
						System.out.print("X ");
						break;
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}