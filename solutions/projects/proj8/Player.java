public class Player {
	private boolean arrow;
	private boolean gold;
	private int row;
	private int col;

	public Player(int r, int c) {
		row = r;
		col = c;
		arrow = true;
		gold = false;
	}
	
	public enum Direction {
		LEFT,
		RIGHT,
		UP,
		DOWN
	};

	public void shootArrow() {
		arrow = false;
	}

	public void grabGold() {
		gold = true;
	}

	public boolean hasGold() {
		return gold;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

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

	public boolean hasArrow() {
		return arrow;
	}

	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append("Player at: (" + row + ", " + col + ")\n");
		build.append("\tArrow: " + arrow + ", gold: " + gold + "\n");
		return build.toString();
	}
}