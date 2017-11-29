package ui_projet;

import java.awt.*;

import javax.swing.*;

public class UI extends JFrame {
	
	public UI() {
		JFrame location = new JFrame("Service de Location");
		location.setLayout(new BorderLayout());
		location.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		location.setBounds(100, 100, 500, 500);
		location.setVisible(true);
		LoginPanel nUI = new LoginPanel(location);
		SwingUtilities.updateComponentTreeUI(location);
	}
}
