package ui_projet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.util.*;

public class addVehicule extends JPanel {

	private boolean admin;
	private defaultTextField type, price;
	private JButton menu, add, remove;
	private String vehicule[] = {"Classe Economique", "Classe Moyenne", "Classe Confort", "Classe de luxe", "Classe de vehicules utilitaires"};
	private ArrayList<String> vehicList = new  ArrayList<String>(Arrays.asList(vehicule));
	private JList<String> vehiculeList; 
	private JList<String> vJList = new JList<String>(new DefaultListModel<String>());
	private JPanel current;
	private JFrame main;	
	
	
	public addVehicule(JFrame frame, boolean admin) {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		initComponents();
		this.admin = admin;
		current = this;
		frame.add(this);
		main = frame;
	}
	
	public void initComponents() {
		type = new defaultTextField("Type de vehicule");
		price = new defaultTextField("Prix");
		menu = new JButton("Retour au menu");
		add = new JButton("Ajouter");
		remove = new JButton("Enlever");
		vehiculeList = new JList<String>(vehicule);
		vJList = new JList<String>(vehicule);
		
		type.setBounds(50, 20, 180, 30);
		price.setBounds(50, 60, 180, 30);
		menu.setBounds(50, 400, 180, 30);
		add.setBounds(50, 260, 100, 30);
		remove.setBounds(270, 260, 100, 30);
		vehiculeList.setBounds(270, 20, 180, 200);
		
		this.add(type);
		this.add(price);
		this.add(menu);
		this.add(add);
		this.add(remove);
		this.add(vehiculeList);
		
		add.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(type.getText().equals("Type de vehicule") == false) {
				DefaultListModel<String> model = (DefaultListModel) vJList.getModel();
				model.addElement(type.getText());
				}
				
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
		
		remove.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				int selectedIndex = vehiculeList.getSelectedIndex();
				if(selectedIndex != -1) {
					vehicList.remove(selectedIndex);
					vehiculeList.remove(selectedIndex);
				}
				
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
