package ui_projet;

import java.awt.*;

import javax.swing.*;

public class Main extends JFrame {
	
	
	public static void main(String[] args) {
		
		JFrame location = new JFrame("Service de Location");
		location.setLayout(new BorderLayout());
		location.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Container contentPane = location.getContentPane();
		//contentPane.setLayout(new FlowLayout());
		location.setBounds(100, 100, 500, 500);
		location.setVisible(true);
		//contentPane.setVisible(true);
		
		
		LoginPanel nUI = new LoginPanel(location);
		SwingUtilities.updateComponentTreeUI(location);
		//nUI.setVisible(true);
		//identificationUI nUI = new identificationUI();
		//nUI.setVisible(true);
	}

}
