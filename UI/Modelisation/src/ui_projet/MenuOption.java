package ui_projet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MenuOption extends JPanel {

	private boolean admin;
	private JButton crLocation, client, end, vehicule, modParametre;
	private JPanel current;
	private JFrame main;

	public MenuOption(JFrame frame, boolean admin) {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		initComponents(true);
		this.admin = admin;
		current = this;
		frame.add(this);
		main = frame;
	}

	private void initComponents(boolean admin) {
		crLocation = new JButton("Creer location");
		client = new JButton("Liste des clients");
		end = new JButton("Deconnexion");
		vehicule = new JButton("Liste des vehicules");
		modParametre = new JButton("Modifier les parametres");

		crLocation.setBounds(50, 20, 180, 30);
		client.setBounds(270, 20, 180, 30);
		vehicule.setBounds(50, 60, 180, 30);
		modParametre.setBounds(270, 60, 180, 30);
		end.setBounds(190, 140, 120, 30);

		crLocation.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				main.remove(current);
				MenuClient create = new MenuClient(main, admin, true);
				SwingUtilities.updateComponentTreeUI(main);

			}

		});

		client.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				main.remove(current);
				MenuClient create = new MenuClient(main, admin, false);
				SwingUtilities.updateComponentTreeUI(main);
			}

		});

		vehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.remove(current);
				addVehicule addV = new addVehicule(main, admin);
				SwingUtilities.updateComponentTreeUI(main);
			}
		});

		modParametre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				main.remove(current);
				ModifParams param = new ModifParams(main);
				SwingUtilities.updateComponentTreeUI(main);
			}
		});

		end.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				main.remove(current);
				LoginPanel nUI = new LoginPanel(main);
				SwingUtilities.updateComponentTreeUI(main);
			}
		});

		this.add(crLocation);
		this.add(client);
		this.add(end);

		if (admin) {
			this.add(vehicule);
			this.add(modParametre);
		}

	}
}
