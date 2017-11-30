package ui_projet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class ClientInfo extends JPanel {

	private boolean admin, nouvClient;
	private JLabel firstNameL, lastNameL, phoneNumberL, licenseNumberL, startDateL, dureeL, balanceL;
	private JTextField firstNameF, lastNameF, phoneNumberF, licenseNumberF, startDateF, dureeF, balanceF;
	private JButton menu, save, change, pay;
	private JPanel current;
	private JFrame main;

	public void editable(boolean flag) {
		firstNameF.setEditable(flag);
		lastNameF.setEditable(flag);
		phoneNumberF.setEditable(flag);
		licenseNumberF.setEditable(flag);
		startDateF.setEditable(flag);
		dureeF.setEditable(flag);
		balanceF.setEditable(flag);
	}

	ClientInfo(JFrame frame, boolean admin, boolean nouvClient) {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		initComponents(admin, nouvClient);
		this.admin = admin;
		this.nouvClient = nouvClient;
		current = this;
		frame.getContentPane().add(this);
		main = frame;
	}

	public void initComponents(boolean admin, boolean nouvClient) {
		firstNameL = new JLabel("Prenom");
		lastNameL = new JLabel("Nom de famille");
		phoneNumberL = new JLabel("Numero de telephone");
		licenseNumberL = new JLabel("Numero de permis");
		startDateL = new JLabel("Debut de la location");
		dureeL = new JLabel("Duree de la location");
		balanceL = new JLabel("Montant a payer");
		firstNameF = new JTextField();
		lastNameF = new JTextField();
		phoneNumberF = new JTextField();
		licenseNumberF = new JTextField();
		startDateF = new JTextField();
		dureeF = new JTextField();
		balanceF = new JTextField();
		save = new JButton("Sauvegarder");
		change = new JButton("Modifier");
		pay = new JButton("Effectuer un paiement");
		menu = new JButton("Retour au menu");

		firstNameL.setBounds(50, 20, 200, 30);
		lastNameL.setBounds(50, 60, 200, 30);
		phoneNumberL.setBounds(50, 100, 200, 30);
		licenseNumberL.setBounds(50, 140, 200, 30);
		startDateL.setBounds(50, 180, 200, 30);
		dureeL.setBounds(50, 220, 200, 30);
		balanceL.setBounds(50, 260, 200, 30);
		firstNameF.setBounds(280, 20, 200, 30);
		lastNameF.setBounds(280, 60, 200, 30);
		phoneNumberF.setBounds(280, 100, 200, 30);
		licenseNumberF.setBounds(280, 140, 200, 30);
		startDateF.setBounds(280, 180, 200, 30);
		dureeF.setBounds(280, 220, 200, 30);
		balanceF.setBounds(280, 260, 200, 30);
		save.setBounds(50, 300, 200, 30);
		change.setBounds(50, 300, 200, 30);
		pay.setBounds(280, 300, 200, 30);
		menu.setBounds(50, 400, 180, 30);

		this.add(firstNameL);
		this.add(lastNameL);
		this.add(phoneNumberL);
		this.add(licenseNumberL);
		this.add(startDateL);
		this.add(dureeL);
		this.add(balanceL);
		this.add(firstNameF);
		this.add(lastNameF);
		this.add(phoneNumberF);
		this.add(licenseNumberF);
		this.add(startDateF);
		this.add(dureeF);
		this.add(balanceF);
		this.add(save);
		this.add(change);
		this.add(pay);
		this.add(menu);

		if (nouvClient) {
			change.setVisible(false);
		} else {
			save.setVisible(false);
			editable(false);

		}
	}
}
