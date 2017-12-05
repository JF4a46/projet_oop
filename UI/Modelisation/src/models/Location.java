package models;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import ui_projet.Magasin;


public class Location {

	private ParametresFacturation params;
	private String phoneNumber;
	private Client client;
	private Vehicule vehicule;
	private int numID;
	private static int IDNumber = 1;
	private int[] startDate, endDate;
	private int montantDue;
	private boolean assurances;
	private boolean kiloIllim;

	public Location(ParametresFacturation params, Client client) {
		this.numID = IDNumber;
		this.client =  client;
		client.setLocationNum(numID);
		IDNumber++;
		this.params = params;
	}
	
	/*public Location(Client client) {
=======
	private String immatriculation;
	
	public Location(ParametresFacturation params, Client client) {
		this.numID = IDNumber;
		this.client = client;
		IDNumber++;
		this.params = params;
	}

	public Location(Client client) {
>>>>>>> cfcda3e8c0c77bf90c74228ac8bfd72971544b55
		this.numID = IDNumber;
		this.client = client;
		setPhoneNumber(client.getTelephone());
		client.setLocationNum(numID);
		IDNumber++;
<<<<<<< HEAD
	}*/
//=======
	//}

	public Location(Client client, ParametresFacturation params, int[] startDate, int[] endDate, int numId) {
		setClient(client);
		this.params = params;
		setStartDate(startDate);
		setEndDate(endDate);
		setPhoneNumber(client.getTelephone());
		client.setLocationNum(numID);
		setNumID(numId);
	}
//>>>>>>> cfcda3e8c0c77bf90c74228ac8bfd72971544b55
	
	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public int[] getStartDate() {
		return startDate;
	}

	public String startDateToString() {

		return "" + startDate[0] + " " + startDate[1] + " " + startDate[2] + " " + startDate[3];
	}

	public String endDateToString() {

		return "" + endDate[0] + " " + endDate[1] + " " + endDate[2] + " " + endDate[3];
	}

	public void setStartDate(int[] startDate) {
		this.startDate = startDate;
	}

	public int[] getEndDate() {
		return endDate;
	}

	public void setEndDate(int[] endDate) {
		this.endDate = endDate;
	}

	public int getMontantDue() {
		return montantDue;
	}

	public void setMontantDue(int montantDue) {
		this.montantDue = montantDue;
	}
	
	public void setAssurances(boolean assurances){
		this.assurances = assurances;
	}
	
	public void setKiloIllim(boolean kiloIllim){
		this.kiloIllim = kiloIllim;
	}
	
	public double calculerPrix() {
		long jours = TimeUnit.MILLISECONDS.toDays(Magasin.makeCalendar(this.endDate).getTimeInMillis() - Magasin.makeCalendar(this.startDate).getTimeInMillis());
		 
		double coutTotal = 0;
		double coutJour = 0;
		
		if(assurances){
			coutTotal += params.getAssurance();
		}
		
		if(kiloIllim){
			coutTotal += params.getForfaitIllimiteKM();
		}
				
		switch (this.vehicule.getClasse()){
		case 0:
			coutJour = this.params.getClasseEconomique();
			break;
		case 1: 
			coutJour = this.params.getClasseMoyenne();
			break;
		case 2: 
			coutJour = this.params.getClasseConfort();
			break;
		case 3:
			coutJour = this.params.getClasseLuxe();
			break;
		case 4: 
			coutJour = this.params.getClasseUtilitaire();
			break;
		}
		//TODO ajouter les options de cout supp.
		coutTotal += jours * coutJour;
		coutTotal = coutTotal + coutTotal * params.getTaxeFederale();
		coutTotal = coutTotal + coutTotal * params.getTaxeProvinciale();
		return coutTotal;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
