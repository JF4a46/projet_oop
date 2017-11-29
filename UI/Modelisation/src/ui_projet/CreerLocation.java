package ui_projet;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.util.*;

public class CreerLocation extends JPanel {
	
	private boolean admin, nouvClient;
	private JLabel text;
	private defaultTextField firstName, lastName;
	private JButton button;
	private JPanel current;
	private JFrame main;
	
	public CreerLocation(JFrame frame, boolean admin, boolean nouvClient) {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		initComponents(true, nouvClient);
		this.admin = admin;
		this.nouvClient = nouvClient;
		current = this;
		frame.add(this);
		main = frame;
				
	}
	
	public void initComponents(boolean admin, boolean nouvClient) {
		
		text =  new JLabel("Entrer le nom du client");		
		firstName = new defaultTextField("Prenom");
		lastName = new defaultTextField("Nom de famille");
		if(nouvClient) {
			button = new JButton("Creer");
		}else {
			button = new JButton("Chercher");
		}
	}
}