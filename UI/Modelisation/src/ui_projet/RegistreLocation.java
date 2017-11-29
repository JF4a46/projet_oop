package ui_projet;

import java.util.ArrayList;

public class RegistreLocation {

	ArrayList<Location> locations = new ArrayList<Location>();
	ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();

	public void createLocation() {
		locations.add(new Location());
	}

	public ArrayList<Vehicule> getVehiculeDisponible() {
		ArrayList<Vehicule> disponible = new ArrayList<Vehicule>();

		for (int i = 0; i < vehicules.size(); i++) {
			if (vehicules.get(i).getDisponibilite()) {
				disponible.add(vehicules.get(i));
			}
		}
		return disponible;
	}

	public void createVehicule() {
		vehicules.add(new Vehicule());
	}

}
