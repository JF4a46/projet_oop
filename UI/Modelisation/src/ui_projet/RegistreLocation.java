package ui_projet;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultButtonModel;

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

	public ArrayList<Vehicule> getVehiculeDisponible(Calendar start, Calendar end) {
		ArrayList<Vehicule> dispo = new ArrayList<Vehicule>();

		for (int i = 0; i < vehicules.size(); i++) {
			if (vehicules.get(i).isVehiculeDisponible(start, end)) {
				System.out.println("Index " + i);
				dispo.add(vehicules.get(i));
			}
		}
		return dispo;

	}

	public ArrayList<Client> searchClient(String param) {
		ArrayList<Client> resultats = new ArrayList<>();
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getTelephone().contains(param)) {
				resultats.add(clients.get(i));
			}
		}

		return resultats;
	}

	public void rendreVehiculeNonDisponible(int[] dateDebut, int[] dateFin, String immatriculation) {
		for (int i = 0; i < vehicules.size(); i++) {
			if (vehicules.get(i).getImmatriculation().equals(immatriculation))
				vehicules.get(i).addIndisponiblePeriod(Magasin.makeCalendar(dateDebut), Magasin.makeCalendar(dateFin));
		}
		writeVehicules();
	}

	public void removeLocation(Calendar debut, Calendar fin, String immatriculation) {
		for (int i = 0; i < vehicules.size(); i++) {
			if (vehicules.get(i).getImmatriculation().equals(immatriculation)) {
				vehicules.get(i).removeIndisponiblePeriod(debut, fin);
				writeVehicules();
				break;
			}

		}

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
				// System.out.println(java.util.Arrays.toString(data));
				vehicules.add(new Vehicule(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])));
				if (data.length > 4) {
					for (int j = 4; j < data.length; j++) {
						String date[] = data[j].split("/");
						String dateSplit[] = date[0].split(" ");
						String dateSplit1[] = date[1].split(" ");
						Calendar start = Calendar.getInstance();
						Calendar end = Calendar.getInstance();
						start.setTimeInMillis(0);
						end.setTimeInMillis(0);
						start.set(Integer.parseInt(dateSplit[0]), Integer.parseInt(dateSplit[1]),
								Integer.parseInt(dateSplit[2]), Integer.parseInt(dateSplit[3]), 0);
						end.set(Integer.parseInt(dateSplit1[0]), Integer.parseInt(dateSplit1[1]),
								Integer.parseInt(dateSplit1[2]), Integer.parseInt(dateSplit1[3]), 0);

						vehicules.get(i).addIndisponiblePeriod(start, end);
					}
				}

			}
		}
	}

	public void writeVehicules() {
		String toWrite = "";

		for (int i = 0; i < vehicules.size(); i++) {

			if (i != 0)
				toWrite += "\n";

			toWrite += vehicules.get(i).getType() + "," + vehicules.get(i).getImmatriculation().toUpperCase() + ","
					+ vehicules.get(i).getKm() + "," + vehicules.get(i).getClasse();

			if (vehicules.get(i).getDebutLocation().size() > 0 && vehicules.get(i).getFinLocation().size() > 0) {
				toWrite += ",";

				for (int j = 0; j < vehicules.get(i).getDebutLocation().size(); j++) {
					toWrite += (vehicules.get(i).getDebutLocation().get(j).get(1) + " "
							+ vehicules.get(i).getDebutLocation().get(j).get(2) + " "
							+ vehicules.get(i).getDebutLocation().get(j).get(5) + " "
							+ vehicules.get(i).getDebutLocation().get(j).get(11));
					toWrite += "/";
					toWrite += (vehicules.get(i).getFinLocation().get(j).get(1) + " "
							+ vehicules.get(i).getFinLocation().get(j).get(2) + " "
							+ vehicules.get(i).getFinLocation().get(j).get(5) + " "
							+ vehicules.get(i).getFinLocation().get(j).get(11));
					toWrite += ",";
				}
			}
		}
		DbFileSystem.writeToFile("vehicules.txt", toWrite);
	}

}
