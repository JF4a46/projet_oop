package ui_projet;

import models.Client;
import models.ParametresFacturation;
import models.Vehicule;

import java.util.ArrayList;
import java.util.Calendar;

import controlers.ClientController;

public final class Magasin {
	private static RegistreLocation registre = new RegistreLocation();

	private Magasin() {

	}

	public static ArrayList<Vehicule> getVehiculesDisponible() {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal.set(2018, 9, 7, 13, 0);
		cal2.set(2018, 10, 04, 14, 0);
		
		
		ArrayList<Vehicule> vicsDispo = registre.getVehiculeDisponible(cal, cal2);
		
		//System.out.println(vicsDispo.toString());
		return vicsDispo;
	}

	public static void createVehicule(String type, String id, int km, int classe) {
		registre.createVehicule(type, id, km, classe);
	}

	public static boolean removeVehicule(String string) {
		return registre.removeVehicule(string);
	}

	public static void createLocation(int[] dateDebut, int[] dateFin) {
		registre.createLocation(dateDebut, dateFin);
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
		registre.loadVehicules();

	}
}