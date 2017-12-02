package ui_projet;

import java.awt.*;
import java.util.Date;

import javax.swing.*;

import controlers.ClientController;

public class Main extends JFrame {
	/*
	 * public static void main(String[] args) { ClientController cc = new
	 * ClientController(); cc.creerClient(1, "Tanguay", "Marie",
	 * "1111111113","2222222222", "3333333333",new Date(), "mh@hotmail.com",
	 * "9 Gatineau", "TANM", "A5"); System.out.println("Voici l'id du client : ");
	 * 
	 * for(int i : cc.searchClientIdByPhone("1111111113")) {
	 * System.out.println("ID : " + i); } }
	 */

	public static void main(String[] args) {
		Magasin.wakeUp();

		// API examples pour location
		// int[] dateDebut = { 2018, 9, 7, 13 };
		// int[] dateFin = { 2018, 10, 21, 12 };
		/*
		 * int[] dateDebut = { 2018, 9, 6, 13 }; int[] dateFin = { 2018, 11, 20, 12 };
		 * Magasin.getVehiculesDisponible(dateDebut, dateFin);
		 */
		// Magasin.removeLocation(Magasin.makeCalendar(dateDebut),
		// Magasin.makeCalendar(dateFin), "4G53G3");
		// Magasin.createLocation(dateDebut, dateFin, "5K7J6K");

		JFrame location = new JFrame("Service de Location");
		location.setLayout(new BorderLayout());
		location.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		location.setBounds(100, 100, 500, 500);
		location.setVisible(true);

		LoginPanel nUI = new LoginPanel(location);
		SwingUtilities.updateComponentTreeUI(location);
	}

}
