package ui_projet;

import java.util.ArrayList;

import models.Client;
import models.Location;
import models.ParametresFacturation;
import models.Vehicule;

public class RegistreLocation {
	ParametresFacturation params;
	private ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
	private ArrayList<Client> clients = new ArrayList<Client>();
	private ArrayList<Location> locations = new ArrayList<Location>();

	public RegistreLocation() {
		params = new ParametresFacturation();
		loadVehicules();
	}

	public void createVehicule(String type, String id, int km, int classe) {
		vehicules.add(new Vehicule(type, id, km, classe));
		writeVehicules();
	}

	public ParametresFacturation getParams() {
		return params;
	}

	public void setParams(ParametresFacturation params) {

		this.params = params;
		this.params.writeToFile();
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

	public boolean removeVehicule(String id) {
		int index = -1;
		for (int i = 0; i < vehicules.size(); i++) {
			System.out.println(vehicules.get(i).getImmatriculation());
			System.out.println(id.toUpperCase());
			if (vehicules.get(i).getImmatriculation().equals(id.toUpperCase())) {
				index = i;
			}
		}
		if (index != -1) {
			vehicules.remove(index);
			writeVehicules();
			return true;
		} else
			return false;

	}

	public ParametresFacturation getParametres() {
		return params;
	}

	public void loadVehicules() {
		ArrayList<String> bruteData = DbFileSystem.loadFromFile("vehicules.txt");
		
		vehicules = new ArrayList<Vehicule>();
		
		for (int i = 0; i < bruteData.size(); i++) {
			String[] data = bruteData.get(i).split(",");
			System.out.println(java.util.Arrays.toString(data));
			vehicules.add(new Vehicule(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])));
		}
	}

	public void writeVehicules() {
		String toWrite = "";

		for (int i = 0; i < vehicules.size(); i++) {
			toWrite += vehicules.get(i).getType() + "," + vehicules.get(i).getImmatriculation().toUpperCase() + ","
					+ vehicules.get(i).getKm() + "," + vehicules.get(i).getClasse() + "\n";
		}
		DbFileSystem.writeToFile("vehicules.txt", toWrite);
	}

}
