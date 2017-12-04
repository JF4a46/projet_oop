package ui_projet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

import models.Client;

public class ClientInfo extends JPanel {

	private boolean admin, nouvClient;
	private JLabel firstNameL, lastNameL, phoneNumberL, licenseNumberL, numLocationL, locationNumberL;
	private JTextField firstNameF, lastNameF, phoneNumberF, licenseNumberF, numLocationF, locationNumberF;
	private JButton menu, save, change, infoLoc;
	private JPanel current;
	private JFrame main;
	private String phone;
	private Client client;

	public void editable(boolean flag) {
		firstNameF.setEditable(flag);
		lastNameF.setEditable(flag);
		phoneNumberF.setEditable(flag);
		licenseNumberF.setEditable(flag);
	}

	public ClientInfo(JFrame frame, boolean admin, boolean nouvClient, String phoneNumber) {
		String phoneNum;
		setLayout(null);
		setBounds(100, 100, 500, 500);
		phoneNum = phoneNumber;
		initComponents(admin, nouvClient, phoneNumber);
		this.admin = admin;
		this.nouvClient = nouvClient;
		current = this;
		frame.getContentPane().add(this);
		main = frame;
	}

	public void initComponents(boolean admin, boolean nouvClient, String phoneNumber) {
		firstNameL = new JLabel("Prenom");
		lastNameL = new JLabel("Nom de famille");
		phoneNumberL = new JLabel("Numero de telephone");
		licenseNumberL = new JLabel("Numero de permis");
		locationNumberL = new JLabel("Numero de location");
		firstNameF = new JTextField();
		lastNameF = new JTextField();
		phoneNumberF = new JTextField();
		phoneNumberF.setText(phoneNumber);
		licenseNumberF = new JTextField();
		locationNumberF = new JTextField();
		save = new JButton("Sauvegarder");
		change = new JButton("Modifier");
		infoLoc = new JButton("Information de location");
		menu = new JButton("Retour au menu");

		firstNameL.setBounds(50, 20, 200, 30);
		lastNameL.setBounds(50, 60, 200, 30);
		phoneNumberL.setBounds(50, 100, 200, 30);
		licenseNumberL.setBounds(50, 140, 200, 30);
		locationNumberL.setBounds(50, 180, 200, 30);
		firstNameF.setBounds(270, 20, 200, 30);
		lastNameF.setBounds(270, 60, 200, 30);
		phoneNumberF.setBounds(270, 100, 200, 30);
		licenseNumberF.setBounds(270, 140, 200, 30);
		locationNumberF.setBounds(270, 180, 200, 30);
		save.setBounds(50, 220, 200, 30);
		change.setBounds(50, 220, 200, 30);
		infoLoc.setBounds(270, 220, 200, 30);
		menu.setBounds(50, 400, 180, 30);
		
		locationNumberF.setEditable(false);

		this.add(firstNameL);
		this.add(lastNameL);
		this.add(phoneNumberL);
		this.add(licenseNumberL);
		this.add(locationNumberL);
		this.add(firstNameF);
		this.add(lastNameF);
		this.add(phoneNumberF);
		this.add(licenseNumberF);
		this.add(locationNumberF);
		this.add(save);
		this.add(change);
		this.add(infoLoc);
		this.add(menu);

		if (nouvClient) {
			change.setVisible(false);
		} else {
			client = Magasin.searchClients(phoneNumberF.getText()).get(0);
			firstNameF.setText(client.getPrenom());
			lastNameF.setText(client.getNom());
			licenseNumberF.setText(client.getPermisConduire());
			locationNumberF.setText(""+client.getLocation().getNumID());
			save.setVisible(false);
			editable(false);

		}
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change.setVisible(true);
				save.setVisible(false);
				editable(false);
				if (nouvClient) {
					client  = new Client(0, lastNameF.getText(), firstNameF.getText(), phoneNumberF.getText(), licenseNumberF.getText());
					locationNumberF.setText(""+ client.getLocation().getNumID());
				}
				else {
					client.setNom(lastNameF.getText());
					client.setPrenom(firstNameF.getText());
					client.setTelephone(phoneNumberF.getText());
					client.setPermisConduire(licenseNumberF.getText());
				}
				SwingUtilities.updateComponentTreeUI(main);
			}

		});
		
		change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save.setVisible(true);
				change.setVisible(false);
				editable(true);
				SwingUtilities.updateComponentTreeUI(main);
				

			}

		});
		
		infoLoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(current);
				LocationInfo info = new LocationInfo(main, admin, nouvClient, client);
				SwingUtilities.updateComponentTreeUI(main);

			}

		});
		
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(current);
				MenuOption menu = new MenuOption(main, admin);
				SwingUtilities.updateComponentTreeUI(main);
				
			}});
	}
}
