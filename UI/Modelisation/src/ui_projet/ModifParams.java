package ui_projet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class ModifParams extends JPanel {
	private JFrame main;

	String[] info = { "Classe économique", "Classe moyenne", "Classe de luxe", "Classe utilitaire", "Assurance",
			"Coût km", "Minimum Kilo", "Forfait illimité KM", "Frais de retard %", "Taxe provinciale", "Taxe fédérale",
			"Coût litre d'essence" };
	String[] textBouton = { "Retour", "Sauvegarder" };

	public ModifParams(JFrame frame) {
		setBounds(100, 100, 500, 500);
		setLayout(null);
		setSize(800, 600);
		frame.add(this);
		main = frame;
		initComponents();
	}

	private void initComponents() {
		JLabel[] arrayLab = new JLabel[info.length];
		JTextField[] arrayText = new JTextField[info.length];
		JButton[] boutons = new JButton[2];

		for (int i = 0; i < boutons.length; i++) {
			boutons[i] = new JButton(textBouton[i]);
			boutons[i].setBounds(300 * i + 40, 410, 130, 25);
			add(boutons[i]);
		}

		int[] dataDB = getDataDB();
		for (int i = 0; i < arrayLab.length; i++) {
			arrayLab[i] = new JLabel(info[i]);
			arrayText[i] = new JTextField();
			arrayText[i].setText("" + dataDB[i]);
			arrayLab[i].setBounds(50, 30 * i + 30, 130, 25);
			arrayText[i].setBounds(200, 30 * i + 30, 150, 25);
			add(arrayLab[i]);
			add(arrayText[i]);

		}
		boutons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancel();
			}
		});

		boutons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
	}

	protected void save() {
		// SAVE DATA
		cancel();

	}

	private void cancel() {
		main.remove(this);
		MenuOption menu = new MenuOption(main, true);
		SwingUtilities.updateComponentTreeUI(main);
	}

	private int[] getDataDB() {
		int[] data = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		return data;
	}
}
