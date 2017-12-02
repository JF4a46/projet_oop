package ui_projet;

import models.Client;
import models.ParametresFacturation;
import models.Vehicule;

import java.util.ArrayList;
import java.util.Calendar;

import controlers.ClientController;

/**
 * 
 * @author FillionJ
 *
 */

public final class Magasin {
	private static RegistreLocation registre = new RegistreLocation();

	private Magasin() {

	}

	/**
	 * 
	 * @param date
	 *            date de debut de la location desiree
	 * @param date2
	 *            date de fin
	 * 
	 *            Format de date[] = [annee,mois,jour,heure]
	 * 
	 * @return Retourne un array contenant les vehicules disponibles
	 */
	public static ArrayList<Vehicule> getVehiculesDisponible(int[] date, int[] date2) {
		return Magasin.getVehiculesDisponible(Magasin.makeCalendar(date), Magasin.makeCalendar(date2));
	}

	/**
	 * @param debut
	 *            date de debut de la location desiree
	 * @param fin
	 *            date de fin
	 * 
	 *            Soit utilise getVehiculesDispo avec les arrays, soit declarer deux
	 *            objet calendar Pour declare calendar : Calendar cal =
	 *            Calendar.getInstance() cal.set(Annee, mois, jour, heure, 0)
	 * 
	 * 
	 * @return Retourne un array contenant les vehicules disponibles
	 */

	public static ArrayList<Vehicule> getVehiculesDisponible(Calendar debut, Calendar fin) {

		ArrayList<Vehicule> vicsDispo = registre.getVehiculeDisponible(debut, fin);

		return vicsDispo;
	}

	public static void createVehicule(String type, String id, int km, int classe) {
		registre.createVehicule(type, id, km, classe);
	}

	public static boolean removeVehicule(String string) {
		return registre.removeVehicule(string);
	}

	public static void createLocation(int[] dateDebut, int[] dateFin,String immatriculation) {
		 
		registre.rendreVehiculeNonDisponible(dateDebut, dateFin,immatriculation);
	}

	public static Calendar makeCalendar(int[] date) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(date[0], date[1], date[2], date[3], 0);

		return cal;
	}

	/**
	 * 
	 * Pour retirer un vehicule, envoi immatriculation, date de debut et fin en calendrier
	 * 
	 * @param debut date de debut de location
	 * @param fin date de fin de location
	 * @param immatriculation de vehicule pour retrouver le vehicule a re-rendre disponible
	 */
	
	public static void removeLocation(Calendar debut, Calendar fin, String immatriculation) {
		registre.removeLocation(debut, fin, immatriculation);
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