package ui_projet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LocationInfo extends JPanel{
	private boolean admin, nouvClient;
	private JLabel startDateL, dureeL, vehicTypeL, idVehicL, montantL, locationNumberL;
	private JTextField startDateF, dureeF, vehicTypeF, idVehicF, montantF, locationNumberF;
	private JButton menu, save, change, pay, end;
	private JPanel current;
	private JFrame main;

	public void editable(boolean flag) {
		startDateF.setEditable(flag);
		dureeF.setEditable(flag);
		vehicTypeF.setEditable(flag);
		vehicTypeF.setEditable(flag);
	}
	public LocationInfo(JFrame frame, boolean admin, boolean nouvClient){
		setLayout(null);
		setBounds(100, 100, 500, 500);
		initComponents(admin, nouvClient);
		this.admin = admin;
		this.nouvClient = nouvClient;
		current = this;
		frame.getContentPane().add(this);
		main = frame;
	}
	
	public void initComponents(boolean admin, boolean nouvClient){
		startDateL = new JLabel("Date de debut de la location");
		dureeL = new JLabel("Duree de la location");
		vehicTypeL = new JLabel("Classe du vehicule");
		idVehicL = new JLabel("Numero de plaque du vehicule");
		montantL = new JLabel("Montant a payer");
		locationNumberL = new JLabel("Numero de location");
		startDateF = new JTextField();
		dureeF = new JTextField();
		vehicTypeF = new JTextField();
		idVehicF = new JTextField();
		montantF = new JTextField();
		locationNumberF = new JTextField();
		save = new JButton("Sauvegarder");
		change = new JButton("Modifier");
		pay = new JButton("Effectuer un paiement");
		end = new JButton("Terminer location");
		menu = new JButton("Retour au menu");

		startDateL.setBounds(50, 20, 200, 30);
		dureeL.setBounds(50, 60, 200, 30);
		vehicTypeL.setBounds(50, 100, 200, 30);
		idVehicL.setBounds(50, 140, 200, 30);
		montantL.setBounds(50, 180, 200, 30);
		locationNumberL.setBounds(50, 220, 200, 30);
		startDateF.setBounds(270, 20, 200, 30);
		dureeF.setBounds(270, 60, 200, 30);
		vehicTypeF.setBounds(270, 100, 200, 30);
		idVehicF.setBounds(270, 140, 200, 30);
		montantF.setBounds(270, 180, 200, 30);
		locationNumberF.setBounds(270, 220, 200, 30);
		save.setBounds(50, 260, 200, 30);
		change.setBounds(50, 260, 200, 30);
		pay.setBounds(270, 260, 200, 30);
		end.setBounds(50, 300, 200, 30);
		menu.setBounds(50, 400, 180, 30);

		this.add(startDateL);
		this.add(dureeL);
		this.add(vehicTypeL);
		this.add(idVehicL);
		this.add(montantL);
		this.add(locationNumberL);
		this.add(startDateF);
		this.add(dureeF);
		this.add(vehicTypeF);
		this.add(idVehicF);
		this.add(montantF);
		this.add(locationNumberF);
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
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change.setVisible(true);
				save.setVisible(false);
				editable(false);
				SwingUtilities.updateComponentTreeUI(main);
				

			}

		});
		
		change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save.setVisible(true);
				change.setVisible(false);
				SwingUtilities.updateComponentTreeUI(main);
				

			}

		});
		
		pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.remove(current);
				Paiement pay = new Paiement(main, admin, nouvClient);
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