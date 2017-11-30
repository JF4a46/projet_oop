package ui_projet;

import models.Client;
import models.ParametresFacturation;
import controlers.ClientController;

public final class Magasin {
	private static RegistreLocation registre = new RegistreLocation();

	private Magasin() {

	}

	public static void createVehicule(String type, int id, int km, int classe) {
		registre.createVehicule(type, id, km, classe);
	}

	public static void removeVehicule(int id) {
		registre.removeVehicule(id);
	}

	public static void createLocation(int clientIndex) {
		registre.createLocation();
	}

	public static void searchClients() {

	}

	public static void savegarderNouveauParametres(ParametresFacturation params) {
		// DB save params
	}

	public static ParametresFacturation getCurrentParametres() {
		// return DB.getParametes;
		return null;
	}
}