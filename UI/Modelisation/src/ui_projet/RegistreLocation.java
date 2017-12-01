package ui_projet;

import java.util.ArrayList;
import java.util.Calendar;

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

		vehicules.get(0).addIndisponiblePeriod("2017/09/07", "2017/09/30");
	}

	public boolean removeVehicule(String id) {
		int index = -1;
		for (int i = 0; i < vehicules.size(); i++) {
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
			if (bruteData.get(i) != "" || bruteData.get(i) != "\n") {
				String[] data = bruteData.get(i).split(",");
				System.out.println(java.util.Arrays.toString(data));
				vehicules.add(new Vehicule(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])));
			}
		}
	}

	public void writeVehicules() {
		String toWrite = "";

		for (int i = 0; i < vehicules.size(); i++) {
			System.out.println(vehicules.get(i).getDebutLocation().toString());
			if (i != 0)
				toWrite += "\n";

			toWrite += vehicules.get(i).getType() + "," + vehicules.get(i).getImmatriculation().toUpperCase() + ","
					+ vehicules.get(i).getKm() + "," + vehicules.get(i).getClasse();

			if (vehicules.get(i).getDebutLocation().size() > 0 && vehicules.get(i).getFinLocation().size() > 0) {
				toWrite += ",dates,";

				for (int j = 0; i < vehicules.get(i).getDebutLocation().size(); j++) {
					
		  		}

			}

		}
		DbFileSystem.writeToFile("vehicules.txt", toWrite);
	}

}
