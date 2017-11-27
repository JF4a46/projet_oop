package ui_projet;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.util.*;

public class ClientResult extends JPanel {
	
	private boolean admin, nouvClient;
	private JLabel text;
	private ArrayList<String> results;
	private DefaultListModel<String> model = new DefaultListModel<String>();
	private JList<String> rJList;
	private JScrollPane listScroller;
	private JButton select, menu;
	private JPanel current;
	private JFrame main;	
	
	ClientResult(JFrame frame, boolean admin, boolean nouvClient){
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
		
		for(int i = 0; i < results.size(); i++) {
			String val =  results.get(i);
			model.addElement(val);
		}
		
		text = new JLabel("Resultats de la recherche");
		select = new JButton("Selectionner");
		menu = new JButton("Retour au menu");
		rJList = new JList<String>(model);
		listScroller = new JScrollPane();
		
		text.setBounds(50, 20, 280, 30);
		select.setBounds(50, 280, 100, 30);
		menu.setBounds(50, 400, 180, 30);
		listScroller.setBounds(50, 60, 200, 200);		
		listScroller.setViewportView(rJList);
		
		this.add(text);
		this.add(select);
		this.add(menu);
		this.add(listScroller);
		
		select.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				main.remove(current);
				
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
