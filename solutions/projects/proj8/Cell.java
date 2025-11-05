public class Cell {
	private boolean wumpusHere;
	private boolean goldHere;
	private boolean pitHere;

	public Cell() {
		wumpusHere = false;
		goldHere = false;
		pitHere = false;
	}

	public void addWumpus() {
		wumpusHere = true;
	}

	public void killWumpus() {
		wumpusHere = false;
	}

	public void addGold() {
		goldHere = true;
	}

	public void addPit() {
		pitHere = true;
	}

	public boolean containsWumpus() {
		return wumpusHere;
	}

	public boolean containsGold() {
		return goldHere;
	}

	public void grabGold() {
		goldHere = false;
	}

	public boolean containsPit() {
		return pitHere;
	}

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