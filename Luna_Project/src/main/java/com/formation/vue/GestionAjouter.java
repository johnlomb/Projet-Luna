package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JFormattedTextField;

public class GestionAjouter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JFormattedTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionAjouter frame = new GestionAjouter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestionAjouter() {
		setTitle("Clients");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestionAjouter.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
		);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Client", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(new Color(204, 255, 255));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Etat Civil", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBackground(new Color(204, 255, 255));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Coordonn\u00E9es", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBackground(new Color(204, 255, 255));
		
		JLabel lblEmail_1 = new JLabel("Email");
		
		JLabel lblFixe = new JLabel("Fixe");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("Mobile");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblEmail_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(14))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblFixe)
							.addGap(25)))
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)))
					.addGap(20))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFixe)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail_1)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Remarques", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBackground(new Color(204, 255, 255));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 647, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
		);
		panel_5.setLayout(gl_panel_5);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 682, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
							.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 682, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		
		JLabel lblAjout = new JLabel("Ajout");
		lblAjout.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAjout.setIcon(new ImageIcon(GestionAjouter.class.getResource("/images/gestion/client/User-Add-64.png")));
		
		JButton btnAperu = new JButton("Aper\u00E7u");
		btnAperu.setIcon(new ImageIcon(GestionAjouter.class.getResource("/images/gestion/Preview-48.png")));
		
		JButton btnImprimer = new JButton("Imprimer");
		
		JButton btnExport = new JButton("Export");
		
		JButton btnAnnuler = new JButton("Annuler");
		
		SwingUtilities.invokeLater(()->btnAnnuler.requestFocusInWindow());
		btnAnnuler.setIcon(new ImageIcon(GestionAjouter.class.getResource("/images/gestion/Cancel-48.png")));
		
		JButton btnSauvegarder = new JButton("Sauvegarder");
		SwingUtilities.invokeLater(()->btnSauvegarder.requestFocusInWindow());
		btnSauvegarder.setIcon(new ImageIcon(GestionAjouter.class.getResource("/images/gestion/Save-48.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(34)
					.addComponent(lblAjout)
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAnnuler)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnExport, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnImprimer, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnAperu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(24, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(36, Short.MAX_VALUE)
					.addComponent(btnSauvegarder)
					.addGap(22))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblAjout)
					.addGap(29)
					.addComponent(btnSauvegarder)
					.addPreferredGap(ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
					.addComponent(btnAperu)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExport)
					.addGap(74)
					.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		
		JLabel lblNom = new JLabel("Nom");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblPrnom)
							.addGap(25))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblCodePostal)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
							.addComponent(lblAdresse, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 564, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_3.createSequentialGroup()
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblNom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_3.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
								.addGap(16)
								.addComponent(lblVille, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))))
					.addGap(28))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrnom)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNom)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdresse)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCodePostal)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblVille))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JFormattedTextField();
		textField_1.setColumns(10);
		
		JLabel lblCode = new JLabel("Code");
		
		JLabel lblCreLe = new JLabel("Cr\u00E9e le");
		
		JCheckBox chckbxCarteFidlit = new JCheckBox("Carte de fid\u00E9lit\u00E9");
		chckbxCarteFidlit.setContentAreaFilled(false);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(2)
					.addComponent(lblCode)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(lblCreLe)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxCarteFidlit)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCode)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCreLe)
						.addComponent(chckbxCarteFidlit))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
