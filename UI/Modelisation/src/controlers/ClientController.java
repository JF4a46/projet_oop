package controlers;

import java.util.ArrayList;
import java.util.Date;

import daos.ClientDAO;
import models.Client;

public class ClientController {

	private ClientDAO clientDao;

	public ClientController() {
		this.clientDao = new ClientDAO();
	}

	public void saveClient(Client client) {
		this.clientDao.save(client);
	}

	public Client creerClient(int idClient, String nom, String prenom, String telephoneMaison, String cellulaire,
			String telephoneBureau, Date dateNaissance, String courriel, String adresse, String permisConduire,
			String classeConduite) {

		Client client = new Client(idClient, nom, prenom, telephoneMaison, cellulaire, telephoneBureau, dateNaissance,
				courriel, adresse, permisConduire, classeConduite);

		this.saveClient(client);
		return client;
	}

	public Client searchClientByName(String prenom, String nom) {
		return null;
	}

	public ArrayList<Integer> searchClientIdByPhone(String telephone) {
		return this.clientDao.getClientIdByPhone(telephone);
	}

}
