package models;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Location {

	private ParametresFacturation params;
	private String phoneNumber;
	private Client client;
	private Vehicule vehicule;
	private Date dateDebut;
	private Date dateFin;
	private int numID;
	private static int IDNumber = 1;
	private int[] startDate, endDate;
	private int montantDue;
	private String immatriculation;
	
	public Location(ParametresFacturation params, Client client) {
		this.numID = IDNumber;
		this.client = client;
		IDNumber++;
		this.params = params;
	}

	public Location(Client client) {
		this.numID = IDNumber;
		this.client = client;
		setPhoneNumber(client.getTelephone());
		client.setLocationNum(numID);
		IDNumber++;
	}

	public Location(Client client, ParametresFacturation params, int[] startDate, int[] endDate, int numId) {
		setClient(client);
		this.params = params;
		setStartDate(startDate);
		setEndDate(endDate);
		setNumID(numId);
	}
	
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

	public void calculerPrix() {
	}

	public void calculerTotal() {

		long jours = TimeUnit.MILLISECONDS.toDays(dateFin.getTime() - dateDebut.getTime());

	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
