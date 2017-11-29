package ui_projet;

import java.util.ArrayList;

public final class Magasin {

	private static ArrayList<Client> listeClients = new ArrayList<Client>();
	private static RegistreLocation registre = new RegistreLocation();;
	private Magasin() {
		
	}

	public static void createVehicule() {
		registre.createVehicule();
	}
	
	public static void createLocation() {
		registre.createLocation();
	}
	
	public static void createClient(String nom, String prenom, int phone) {
		listeClients.add(new Client(nom, prenom, phone));
	}

	public static ArrayList<Client> getListeClients() {
		return listeClients;
	}
	public static ArrayList<Vehicule> getVehiculeDisponibles() {
		
	}

	public static void main(String[] args) {

		UI ui = new UI();
	}

}
