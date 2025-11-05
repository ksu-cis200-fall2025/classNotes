/**
 * Cell represents a single grid cell in Wumpus world
 * 
 * @author Julie Thornton
 * @version Project 8
 */


public class Cell {
	private boolean wumpusHere;
	private boolean goldHere;
	private boolean pitHere;

	/**
	 * Constructs a new cell
	 */
	public Cell() {
		wumpusHere = false;
		goldHere = false;
		pitHere = false;
	}

	/**
	 * Adds the Wumpus to this cell
	 */
	public void addWumpus() {
		wumpusHere = true;
	}

	/**
	 * Kills the wumpus on this cell
	 */
	public void killWumpus() {
		wumpusHere = false;
	}

	/**
	 * Adds gold to this cell
	 */
	public void addGold() {
		goldHere = true;
	}

	/**
	 * Adds a pit to this cell
	 */
	public void addPit() {
		pitHere = true;
	}

	/**
	 * Returns whether this cell contains a (live) wumpus
	 * 
	 * @return Whether this cell contains the wumpus
	 */
	public boolean containsWumpus() {
		return wumpusHere;
	}

	/**
	 * Returns whether this cell contains the gold
	 * 
	 * @return Whether this cell contains the gold
	 */
	public boolean containsGold() {
		return goldHere;
	}

	/**
	 * Grabs the gold (removing it) on this cell
	 */
	public void grabGold() {
		goldHere = false;
	}

	/**
	 * Returns whether this cell contains a pit
	 * 
	 * @return Whether this cell contains a pit
	 */
	public boolean containsPit() {
		return pitHere;
	}

	/**
	 * Returns a string representation of the contents of this cell
	 * 
	 * @param A string representation of this cell
	 */
	public String toString() {
		StringBuilder build = new StringBuilder();
		if (wumpusHere) build.append("W");
		else build.append(" ");

		if (pitHere) build.append("P");
		else build.append(" ");

		if (goldHere) build.append("G");
		else build.append(" ");

		return build.toString();
	}
}