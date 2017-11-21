package ui_projet;

import java.awt.BorderLayout;

import javax.swing.*;

public class Main extends JFrame {
	
	
	public static void main(String[] args) {
		
		JFrame location = new JFrame("Service de Location");
		location.setLayout(new BorderLayout());
		location.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		location.setBounds(100, 100, 500, 500);
		location.setVisible(true);
		
		
		LoginPanel nUI = new LoginPanel(location);
		SwingUtilities.updateComponentTreeUI(location);
		//nUI.setVisible(true);
		//identificationUI nUI = new identificationUI();
		//nUI.setVisible(true);
	}

}
