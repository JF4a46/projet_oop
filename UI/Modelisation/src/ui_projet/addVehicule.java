package ui_projet;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.util.*;

public class addVehicule extends JPanel {

	private boolean admin;
	private defaultTextField type, price;
	private JButton menu, add, remove, info;
	private String vehicule[] = {"Classe Economique", "Classe Moyenne", "Classe Confort", "Classe de luxe", "Classe de vehicules utilitaires"};
	private ArrayList<String> vehicList = new  ArrayList<String>(Arrays.asList(vehicule));
	private int prix[] = {39, 49, 59, 99, 89};
	private ArrayList<Integer> prixList = new ArrayList<Integer>();	
	private DefaultListModel<String> model = new DefaultListModel<String>();
	private JList<String> vJList;
	private JScrollPane listScroller;
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
		
		for (int i = 0; i < prix.length; i++) {
			int val = prix[i];
			prixList.add(val);
		}
		
		for(int i = 0; i < vehicList.size(); i++) {
			String val =  vehicList.get(i);
			model.addElement(val);
		}
		
		type = new defaultTextField("Type de vehicule");
		price = new defaultTextField("Prix");
		menu = new JButton("Retour au menu");
		add = new JButton("Ajouter");
		remove = new JButton("Enlever");
		info = new JButton("Information");
		vJList = new JList<String>(model);
		listScroller = new JScrollPane();
		
		
		type.setBounds(50, 20, 180, 30);
		price.setBounds(50, 60, 180, 30);
		menu.setBounds(50, 400, 180, 30);
		add.setBounds(50, 260, 100, 30);
		remove.setBounds(200, 260, 100, 30);
		info.setBounds(350, 260, 100, 30);
		listScroller.setBounds(260, 20, 190, 200);		
		listScroller.setViewportView(vJList);
		
		this.add(type);
		this.add(price);
		this.add(menu);
		this.add(add);
		this.add(remove);
		this.add(info);
		this.add(listScroller);
		
		add.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(type.getText().equals("Type de vehicule") == false) {
					if(price.getText().equals("Prix") == false) {
						try {
							int num = Integer.parseInt(price.getText());
							prixList.add(num);
						}catch (NumberFormatException e) {
							 
						}
					}
					vehicList.add(type.getText());
					model.addElement(type.getText());
					vJList.setModel(model);
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
				int selectedIndex = vJList.getSelectedIndex();
				if(selectedIndex != -1) {
					model.removeElementAt(selectedIndex);
					vehicList.remove(selectedIndex);
					prixList.remove(selectedIndex);
					vJList.setModel(model);
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
		
		
		info.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				int selectedIndex = vJList.getSelectedIndex();
				if(selectedIndex != -1) {
					JFrame infoF = new JFrame("Info");
					infoF.setLayout(new BorderLayout());
					infoF.setBounds(250, 250, 280, 140);
					JPanel infoP = new JPanel();
					infoP.setLayout(null);
					infoP.setBounds(250, 250, 280, 140);
					JLabel vehicInfo = new JLabel("Type: " + vehicList.get(selectedIndex));
					JLabel prixInfo = new JLabel("Prix: " + prixList.get(selectedIndex));
					vehicInfo.setBounds(20, 20, 220, 30);
					prixInfo.setBounds(20, 60, 220, 30);
					infoP.add(vehicInfo);
					infoP.add(prixInfo);
					infoF.add(infoP);
					SwingUtilities.updateComponentTreeUI(infoF);
					infoF.setVisible(true);
					
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
		
	}
}
