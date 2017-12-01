package ui_projet;

import models.Client;
import models.ParametresFacturation;
import controlers.ClientController;

public final class Magasin {
	private static RegistreLocation registre = new RegistreLocation();

	private Magasin() {

	}

	public static void getVehicules() {
		// registre.getVehicule();
	}

	public static void createVehicule(String type, String id, int km, int classe) {
		registre.createVehicule(type, id, km, classe);
	}

	public static boolean removeVehicule(String string) {
		return registre.removeVehicule(string);
	}

	public static void createLocation(int clientIndex) {
		registre.createLocation();
	}

	public static void searchClients() {

	}

	public static void savegarderNouveauParametres(ParametresFacturation params) {
		registre.setParams(params);
	}

	public static ParametresFacturation getCurrentParametres() {

		return registre.getParametres();
	}

	public static void wakeUp() {
		// TODO Auto-generated method stub

	}
}