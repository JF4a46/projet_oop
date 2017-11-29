package ui_projet;

public class Vehicule {
	boolean disponibilite;
	int id;
	int km;

	public Vehicule() {
	}

	public int rentVehicule() {
		disponibilite = false;
		return id;
	}

	public boolean returnVehicule() {
		disponibilite = true;
		return true;
	}

	public boolean getDisponibilite() {
		// TODO Auto-generated method stub
		return disponibilite;
	}
}
