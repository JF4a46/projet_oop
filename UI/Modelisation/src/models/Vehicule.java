package models;

import java.util.ArrayList;
import java.util.Calendar;

public class Vehicule {
	private String type;

	private int km, classe;
	private String immatriculation;
	private ArrayList<String> debutLocation = new ArrayList<String>();
	private ArrayList<String> finLocation = new ArrayList<String>();

	public Vehicule(String type, String imma, int km, int classe) {
		this.type = type;
		this.immatriculation = imma;
		this.km = km;
		this.classe = classe;
	}

	// format data = YYYY/MM/JJ
	public void addIndisponiblePeriod(String start, String end) {
		debutLocation.add(start);
		finLocation.add(end);
	}

	public boolean isVehiculeDisponible(Calendar start, Calendar end) {

		System.out.println(start.getTime().toString());

		return false;
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

	public ArrayList<String> getDebutLocation() {
		return debutLocation;
	}

	public void setDebutLocation(ArrayList<String> debutLocation) {
		this.debutLocation = debutLocation;
	}

	public ArrayList<String> getFinLocation() {
		return finLocation;
	}

	public void setFinLocation(ArrayList<String> finLocation) {
		this.finLocation = finLocation;
	}

}
