package models;

import java.util.Date;

public class Client {
	
	private int idClient;
	private String nom;
	private String prenom;
	private String telephoneMaison;
	private String cellulaire;
	private Date dateNaissance;
	private String courriel;
	private String adresse;
	private String permisConduire;
	private String classeConduite;
	private String telephoneBureau;
	
	public Client(int idClient, 
			String nom, 
			String prenom,
			String telephoneMaison,
			String cellulaire,
			String telephoneBureau,
			Date dateNaissance,
	 		String courriel,
	 		String adresse,
	 		String permisConduire,
	 		String classeConduite){
		
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.telephoneMaison = telephoneMaison;
		this.cellulaire = cellulaire;
		this.telephoneBureau = telephoneBureau;
		this.dateNaissance = dateNaissance;
		this.courriel = courriel;
		this.adresse = adresse;
		this.permisConduire = permisConduire;
		this.classeConduite = classeConduite;
	}
	
	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephoneMaison() {
		return telephoneMaison;
	}

	public void setTelephoneMaison(String telephoneMaison) {
		this.telephoneMaison = telephoneMaison;
	}

	public String getCellulaire() {
		return cellulaire;
	}

	public void setCellulaire(String cellulaire) {
		this.cellulaire = cellulaire;
	}
	
	public String getTelephoneBureau() {
		return telephoneBureau;
	}

	public void setTelephoneBureau(String telephoneBureau) {
		this.telephoneBureau = telephoneBureau;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPermisConduire() {
		return permisConduire;
	}

	public void setPermisConduire(String permisConduire) {
		this.permisConduire = permisConduire;
	}
	
	public String getClasseConduite() {
		return classeConduite;
	}

	public void setClasseConduite(String classeConduite) {
		this.classeConduite = classeConduite;
	}
	
}
