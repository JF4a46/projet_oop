package ui_projet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MenuClient extends JPanel {
	
	private boolean admin, nouvClient;
	private JLabel text;
	private defaultTextField firstName, lastName;
	private JButton button, menu;
	private JPanel current;
	private JFrame main;
	
	public MenuClient(JFrame frame, boolean admin, boolean nouvClient) {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		initComponents(admin, nouvClient);
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
		menu = new JButton("Retour au menu");
		
		text.setBounds(50, 20, 280, 30);
		firstName.setBounds(50, 60, 180, 30);
		lastName.setBounds(50, 100, 180, 30);
		button.setBounds(50, 140, 100,30);
		menu.setBounds(50, 400, 180, 30);
		
		this.add(text);
		this.add(firstName);
		this.add(lastName);
		this.add(button);
		this.add(menu);
		
		button.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		menu.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				main.remove(current);
				MenuOption menu = new MenuOption(main, admin);
				SwingUtilities.updateComponentTreeUI(main);
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
				
	}

}