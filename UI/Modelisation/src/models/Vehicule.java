package models;

import java.util.Date;

public class Vehicule {
	String type;
	int id, km, classe;
	boolean dispo;
	
	Date debut, fin;
	
	public Vehicule(String type, int id, int km, int classe, boolean dispo) {
		super();
		this.type = type;
		this.id = id;
		this.km = km;
		this.classe = classe;
		this.dispo = dispo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
