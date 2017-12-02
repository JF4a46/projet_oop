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
		JFrame location = new JFrame("Service de Location");
		location.setLayout(new BorderLayout());
		location.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		location.setBounds(100, 100, 500, 500);
		location.setVisible(true);

		LoginPanel nUI = new LoginPanel(location);
		SwingUtilities.updateComponentTreeUI(location);
	}

}
