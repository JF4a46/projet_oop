package models;

import java.util.ArrayList;
import java.util.Date;

public class Vehicule {
	String type;
	int km, classe;
	String immatriculation;
	ArrayList<Date> debutLocation = new ArrayList<Date>();
	ArrayList<Date> finLocation = new ArrayList<Date>();

	public Vehicule(String type, String imma, int km, int classe) {
		this.type = type;
		this.immatriculation = imma;
		this.km = km;
		this.classe = classe;
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

}
