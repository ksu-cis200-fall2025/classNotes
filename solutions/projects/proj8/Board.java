/**
 * Board represents the board in Wumpus world
 * 
 * @author Julie Thornton
 * @version Project 8
 */


import java.util.*;

public class Board {
	private Cell[][] game;
	private int rows, cols;
	private Player player;
	private int exitRow;
	private int exitCol;
	private boolean exit;
	private boolean wumpusDead;

	/**
	 * Constructs a new (random) game board for Wumpus world
	 */
	public Board() {
		Random r = new Random();
		exit = false;
		wumpusDead = false;

		//randomly picks dimensions (4-6 by 4-6)
		rows = r.nextInt(2)+4;
		cols = r.nextInt(3)+4;
		game = new Cell[rows][cols];

		exitRow = rows-1;
		exitCol = 0;
		player = new Player(exitRow, exitCol);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				game[i][j] = new Cell();
				if (i != exitRow || j != exitCol) {
					int chance = r.nextInt(100);
					if (chance <= 9) {
						//place a pit (10% chance)
						game[i][j].addPit();
					}
				}
			}
		}

		//randomly place one wumpus
		int x = 0;
		int y = 0;
		while (x == 0 && y == 0) {
			x = r.nextInt(rows);
			y = r.nextInt(cols);
			if (x != exitRow || y != exitCol) {
				game[x][y].addWumpus();
			}
		}

		x = 0;
		y = 0;

		//randomly place gold
		while ((x == 0 && y == 0) || game[x][y].containsPit()) {
			x = r.nextInt(rows);
			y = r.nextInt(cols);
			if ((x != exitRow|| y != exitCol) && !game[x][y].containsPit()) {
				game[x][y].addGold();
			}
		}
	}
	
	/**
	 * Returns whether the player has been eaten by the Wumpus
	 * 
	 * @return Whether the player has been eated by the Wumpus
	 */
	public boolean amEaten() {
		int r = player.getRow();
		int c = player.getCol();
		
		if (game[r][c].containsWumpus()) return true;
		else return false;
	}
	
	/**
	 * Returns whether the player has fallen into a pit
	 * 
	 * @return Whether the player has fallen into a pit
	 */
	public boolean fallen() {
		int r = player.getRow();
		int c = player.getCol();
		
		if (game[r][c].containsPit()) return true;
		else return false;
	}
	
	/**
	 * Returns whether the Wumpus has been killed
	 * 
	 * @return Whether the Wumpus has been killed
	 */
	public boolean wumpusGone() {
		return wumpusDead;
	}
	
	/**
	 * Returns whether the player has escaped (climbed out)
	 * 
	 * @return Whether the player has escaped
	 */
	public boolean escaped() {
		return exit;
	}
	
	/**
	 * Returns whether the player has the gold
	 * 
	 * @return Whether the player has the gold
	 */
	public boolean hasGold() {
		return player.hasGold();
	}
	
	/**
	 * Returns whether the player still has the arrow
	 * 
	 * @return Whether the player has the arrow
	 */
	public boolean hasArrow() {
		return player.hasArrow();
	}
	
	/**
	 * Makes the player grab the gold in their current location
	 * 
	 * @return Whether the player successfully grabbed the gold
	 */
	public boolean grabGold() {
		if (game[player.getRow()][player.getCol()].containsGold()) {
			game[player.getRow()][player.getCol()].grabGold();
			player.grabGold();
			return true;
		}
		else return false;
	}
	
	/**
	 * Makes the player attempt to climb out
	 * 
	 * @return Whether the player sucesssfully climbed out (only possible in bottom left)
	 */
	public boolean climb() {
		if (player.getRow() == exitRow && player.getCol() == exitCol) {
			exit = true;
			return true;
		}
		else return false;
	}

	/**
	 * Gets a string describing the precepts for the current game state
	 * 
	 * @return A string describing the precepts for the current board
	 */
	public String evaluateSpot() {
		boolean wumpus = false;
		boolean pit = false;
		StringBuilder precepts = new StringBuilder();

		int r = player.getRow();
		int c = player.getCol();

		if (game[r][c].containsGold()) precepts.append("You see a glitter.\n");

		if (r > 0) {
			wumpus = wumpus || game[r-1][c].containsWumpus();
			pit =  pit || game[r-1][c].containsPit();
		}
		if (c > 0) {
			wumpus = wumpus || game[r][c-1].containsWumpus();
			pit =  pit || game[r][c-1].containsPit();
		}
		if (r < rows-1) {
			wumpus = wumpus || game[r+1][c].containsWumpus();
			pit =  pit || game[r+1][c].containsPit();
		}
		if (c < cols-1) {
			wumpus = wumpus || game[r][c+1].containsWumpus();
			pit =  pit || game[r][c+1].containsPit();
		}

		if (wumpus) precepts.append("You smell a stench.\n");
		if (pit) precepts.append("You feel a breeze.\n");

		return precepts.toString();
	}

	/**
	 * Moves the player one cell in the given direction
	 * 
	 * @param dir The direction to move ('u' = up, 'd' = down, 'l' = left, 'r' = right)
	 * @return Whether the player successfully moved (whether there was a wall in that direction)
	 */
	public boolean move(char dir) {
		if (dir == 'u') {
			if (player.getRow() > 0) {
				player.move(Player.Direction.UP);
			}
			else {
				return false;
			}
		}
		else if (dir == 'd') {
			if (player.getRow() < rows-1) {
				player.move(Player.Direction.DOWN);
			}
			else {
				return false;
			}
		}
		else if (dir == 'l') {
			if (player.getCol() > 0) {
				player.move(Player.Direction.LEFT);
			}
			else {
				return false;
			}
		}
		else if (dir == 'r') {
			if (player.getCol() < cols-1) {
				player.move(Player.Direction.RIGHT);
			}
			else {
				return false;
			}
		}
		return true;
	}

	/**
	 * Makes the user shoot the arrow in the given direction
	 * 
	 * @param dir The direction to shoot ('u' = up, 'd' = down, 'l' = left, 'r' = right)
	 * @return Whether the player successfully killed the Wumpus
	 */
	public boolean shoot(char dir) {
		int r = player.getRow();
		int c = player.getCol();
		
		if (!player.hasArrow()) return false;

		if (dir == 'u') {
			player.shootArrow();
			for (int i = r; i >= 0; i--) {
				if (game[i][c].containsWumpus()) {
					game[i][c].killWumpus();
					wumpusDead = true;
					return true;
				}
			}
		}
		else if (dir == 'd') {
			for (int i = r; i < rows; i++) {
				if (game[i][c].containsWumpus()) {
					game[i][c].killWumpus();
					wumpusDead = true;
					return true;
				}
			}
		}
		else if (dir == 'l') {
			for (int i = c; i >= 0; i--) {
				if (game[r][i].containsWumpus()) {
					game[r][i].killWumpus();
					wumpusDead = true;
					return true;
				}
			}
		}
		else if (dir == 'r') {
			for (int i = c; i < cols; i++) {
				if (game[r][i].containsWumpus()) {
					game[r][i].killWumpus();
					wumpusDead = true;
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns a string representation of the contents of the board (for cheat mode)
	 * 
	 * @param A string representation of the current game board
	 */
	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append(player.toString()+"\n");
		for (int i = 0; i < rows; i++) {
			build.append("| ");
			for (int j = 0; j < cols; j++) {
				build.append(game[i][j].toString() + " | ");
			}
			build.append("\n");
			for (int j = 0; j < cols; j++) {
				build.append("------");
			}
			build.append("\n");
		}
		return build.toString();
	}
}