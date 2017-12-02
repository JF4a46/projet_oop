package models;

import java.util.ArrayList;
import java.util.Calendar;

public class Vehicule {
	private String type;

	private int km, classe;
	private String immatriculation;
	private ArrayList<Calendar> debutLocation = new ArrayList<Calendar>();
	private ArrayList<Calendar> finLocation = new ArrayList<Calendar>();

	public Vehicule(String type, String imma, int km, int classe) {
		this.type = type;
		this.immatriculation = imma;
		this.km = km;
		this.classe = classe;
	}

	// format data = YYYY/MM/JJ
	public void addIndisponiblePeriod(Calendar calDebut, Calendar calFin) {
		debutLocation.add(calDebut);
		finLocation.add(calFin);
	}

	public boolean isVehiculeDisponible(Calendar start, Calendar end) {

		for (int i = 0; i < debutLocation.size(); i++) {
			System.out.println(start.compareTo(debutLocation.get(i)));
			System.out.println(start.compareTo(finLocation.get(i)));
			System.out.println(end.compareTo(debutLocation.get(i)));
			System.out.println(end.compareTo(finLocation.get(i)));
		}

		return true;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public ArrayList<Calendar> getDebutLocation() {
		return debutLocation;
	}

	public void setDebutLocation(ArrayList<Calendar> debutLocation) {
		this.debutLocation = debutLocation;
	}

	public ArrayList<Calendar> getFinLocation() {
		return finLocation;
	}

	public void setFinLocation(ArrayList<Calendar> finLocation) {
		this.finLocation = finLocation;
	}

}
