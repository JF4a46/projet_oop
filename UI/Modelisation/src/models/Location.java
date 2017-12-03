package models;

public class Location {

	ParametresFacturation params;
	private int numID;
	private static int IDNumber = 0;

	public Location(ParametresFacturation params) {
		this.numID = IDNumber;
		IDNumber++;
	}
	
	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public void calculerPrix() {
	}

}
