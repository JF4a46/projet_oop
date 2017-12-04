package models;

import java.util.Date;

public class Location {

	private ParametresFacturation params;
	private Client client;
	private Vehicule vehicule;
	private Date dateDebut;
	private Date dateFin;
	private int numID;
	private static int IDNumber = 0;

	public Location(ParametresFacturation params) {
		this.numID = IDNumber;
		IDNumber++;
		this.params = params;
	}
	
	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public void calculerTotal() {
	}

	
}
