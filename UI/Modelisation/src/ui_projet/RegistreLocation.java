package ui_projet;

import java.util.ArrayList;

import models.Client;
import models.Location;
import models.Vehicule;

public class RegistreLocation {

	private ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
	private ArrayList<Client> clients = new ArrayList<Client>();
	private ArrayList<Location> locations = new ArrayList<Location>();

	public void createVehicule(String type, int id, int km, int classe) {
		vehicules.add(new Vehicule(type, id, km, classe, true));
	}

	public ArrayList<Vehicule> getVehiculeDisponible() {
		
		
		return vehicules;
	}
	
	public ArrayList<Client> searchClient(String param) {
		ArrayList<Client> resultats = new ArrayList<>();
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getTelephoneMaison().contains(param)) {
				resultats.add(clients.get(i));
			}
		}

		return resultats;
	}

	public void createLocation() {

	}

	public void removeVehicule(int id) {
		int index = -1;
		for (int i = 0; i < vehicules.size(); i++) {
			if (vehicules.get(i).getId() == id) {
				index = i;
			}
		}
		if (index != -1)
			vehicules.remove(index);
	}
}
