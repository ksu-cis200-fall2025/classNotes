/**
 * Player represents the player in Wumpus world
 * 
 * @author Julie Thornton
 * @version Project 8
 */


public class Player {
	private boolean arrow;
	private boolean gold;
	private int row;
	private int col;

	/**
	 * Constructs a new player
	 * 
	 * @param r The row of the player
	 * @param c The column of the player
	 */
	public Player(int r, int c) {
		row = r;
		col = c;
		arrow = true;
		gold = false;
	}
	
	/**
	 * Represents a grid direction
	 */
	public enum Direction {
		LEFT,
		RIGHT,
		UP,
		DOWN
	};

	/**
	 * Makes the player shoot the arrow
	 */
	public void shootArrow() {
		arrow = false;
	}

	/**
	 * Makes the player grab the gold
	 */
	public void grabGold() {
		gold = true;
	}

	/**
	 * Returns whether the player has the gold
	 * 
	 * @return Whether the player has the gold
	 */
	public boolean hasGold() {
		return gold;
	}

	/**
	 * Gets the current row of the player
	 * 
	 * @return The current row of the player
	 */
	public int getRow() {
		return row;
	}

	/**
	 * Gets the current column of the player
	 * 
	 * @return The current column of the player
	 */
	public int getCol() {
		return col;
	}

	/**
	 * Moves the player one spot in the given direction
	 * 
	 * @param dir The direction to move
	 */
	public void move(Direction dir) {
		switch(dir) {
			case LEFT:
				col--;
				break;
			case RIGHT:
				col++;
				break;
			case UP:
				row--;
				break;
			case DOWN:
				row++;
				break;
		}
	}

	/**
	 * Returns whether the player still has the arrow
	 * 
	 * @return Whether the player has the arrow
	 */
	public boolean hasArrow() {
		return arrow;
	}

	/**
	 * Gets a string representation of the player information
	 * 
	 * @return A string representation of the player information
	 */
	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append("Player at: (" + row + ", " + col + ")\n");
		build.append("\tArrow: " + arrow + ", gold: " + gold + "\n");
		return build.toString();
	}
}