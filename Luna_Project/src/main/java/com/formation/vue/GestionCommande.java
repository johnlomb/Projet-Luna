package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JSpinner;

import controle.TraitementCE;
import controle.TraitementCommande;

import java.awt.Component;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionCommande extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionCommande frame = new GestionCommande();
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
	public GestionCommande() {
		setResizable(false);
		setTitle("Gestion des Clients");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestionClient.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBorder(null);
		
		JButton btnNewButton = new JButton("Accueil");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionCommande.this.dispose();
				Menu LaFenetreMenu = new Menu();
				LaFenetreMenu.setLocationRelativeTo(null);
				LaFenetreMenu.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon(GestionClient.class.getResource("/images/gestion/Home-48.png")));
		SwingUtilities.invokeLater(()->btnNewButton.requestFocusInWindow());
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionCommande.this.dispose();
				Menu LaFenetreMenu = new Menu();
				LaFenetreMenu.setLocationRelativeTo(null);
				LaFenetreMenu.setVisible(true);
			}
		});
		JButton btnNewButton_1 = new JButton("Export");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(GestionClient.class.getResource("/images/gestion/Data-Export-48.png")));
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnImprimer.setForeground(Color.WHITE);
		btnImprimer.setContentAreaFilled(false);
		btnImprimer.setBorderPainted(false);
		btnImprimer.setIcon(new ImageIcon(GestionClient.class.getResource("/images/gestion/Printer-48.png")));
		
		JButton btnNewButton_2 = new JButton("Aper\u00E7u");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon(GestionClient.class.getResource("/images/gestion/Preview-48.png")));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		
		JButton btnNewButton_3 = new JButton("Supprimer toutes les lignes");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setIcon(new ImageIcon(GestionClient.class.getResource("/images/gestion/Garbage-Open-48.png")));
		
		JButton btnNewButton_4 = new JButton("Valider la commande");
		btnNewButton_4.setPressedIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/commande/Shopping-Cart-05-48-actif.png")));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		
		JButton btnRecherche = new JButton("Supprimer");
		btnRecherche.setPressedIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/Cancel-48-actif.png")));
		btnRecherche.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRecherche.setForeground(Color.WHITE);
		btnRecherche.setContentAreaFilled(false);
		btnRecherche.setBorderPainted(false);
		btnRecherche.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/Cancel-48.png")));
		
		JButton btnAjouter = new JButton("Commandes existantes");
		btnAjouter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionCommande.this.dispose();
				GestionCommandesExist LaFenetreGCE = new GestionCommandesExist();
				LaFenetreGCE.setLocationRelativeTo(null);
				LaFenetreGCE.setVisible(true);
			}
		});
		btnAjouter.setPressedIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/commande/Receipt-48-actif.png")));
		btnAjouter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAjouter.setForeground(Color.WHITE);
		btnAjouter.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/commande/Receipt-48.png")));
		btnAjouter.setBorderPainted(false);
		btnAjouter.setContentAreaFilled(false);
		
		JButton btnNewButton_5 = new JButton("Commande");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/commande/Shopping-Bag-64-actif.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_5)
						.addComponent(btnAjouter)
						.addComponent(btnRecherche)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnImprimer)
						.addComponent(btnNewButton_2))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAjouter)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRecherche)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_4)
					.addGap(27)
					.addComponent(btnNewButton_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(65))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 181));
		
		JLabel label_6 = new JLabel("Mode de r\u00E9glement");
		label_6.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/commande/ATM-32.png")));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JComboBox comboBox = new JComboBox();
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBorder(new LineBorder(new Color(255, 102, 0), 2));
		formattedTextField.setBackground(new Color(255, 204, 51));
		
		JButton button = new JButton("Valider la commande");
		button.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 638, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 627, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 102, 0), 2, true), "Valeurs de la commande", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(100, 100, 100)));
		panel_2.setBackground(new Color(255, 228, 181));
		
		JLabel label = new JLabel("D\u00E9signation");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("Selectionner un article");
		label_1.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/Search-48.png")));
		label_1.setOpaque(true);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBorder(new LineBorder(new Color(255, 102, 0)));
		label_1.setBackground(new Color(255, 204, 51));
		
		JLabel label_2 = new JLabel("Code");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("Montant");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel label_4 = new JLabel("Cat\u00E9gorie");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel label_5 = new JLabel("Quantit\u00E9");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JSpinner spinner = new JSpinner();
		
		JButton btnAjouter_1 = new JButton("Ajouter");
		btnAjouter_1.setContentAreaFilled(false);
		btnAjouter_1.setBorderPainted(false);
		btnAjouter_1.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/Add-New-48.png")));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/Data-Edit-48.png")));
		btnModifier.setContentAreaFilled(false);
		btnModifier.setBorderPainted(false);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/Cancel-48.png")));
		btnSupprimer.setContentAreaFilled(false);
		btnSupprimer.setBorderPainted(false);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(14)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(25)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))
					.addGap(42)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(12)
							.addComponent(label_4)
							.addGap(10)
							.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(18)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
					.addGap(9))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(58)
					.addComponent(btnAjouter_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnModifier, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addGap(92))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 576, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(16)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGap(1)
									.addComponent(label_4))
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2))))
					.addGap(6)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAjouter_1)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
		);
		
		table = new JTable();
		Object tab[][]= TraitementCE.remplissageTab();
		DefaultTableModel matable = new DefaultTableModel(tab,new String[] {
				"Code", "Code Catégorie", "Désignation", "Quantité", "Prix Unitaire", "Total"
			});
		table.setModel(matable);
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setToolTipText("");
		panel_3.setBackground(new Color(255, 228, 196));
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(255, 102, 0), 2), "Informations g\u00E9n\u00E9rales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
								.addComponent(button)
								.addGap(40))
							.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
								.addGap(133)
								.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addGap(89)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 589, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button)
					.addGap(20))
		);
		
		JLabel lblCommandeEnCours = new JLabel("Commande en cours");
		lblCommandeEnCours.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblNomDuClient = new JLabel("S\u00E9lectionner le client");
		lblNomDuClient.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/Search-48.png")));
		lblNomDuClient.setOpaque(true);
		lblNomDuClient.setForeground(Color.WHITE);
		lblNomDuClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomDuClient.setBorder(new LineBorder(new Color(255, 102, 0)));
		lblNomDuClient.setBackground(new Color(255, 204, 51));
		
		JLabel lblNomDuClient_1 = new JLabel("Nom du client");
		lblNomDuClient_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCommandeEnCours, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomDuClient_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
							.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNomDuClient, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
					.addGap(22))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblCommandeEnCours, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomDuClient, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomDuClient_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
