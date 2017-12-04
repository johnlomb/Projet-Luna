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

public class GestionCommande extends JFrame {

	private JPanel contentPane;

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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBorder(null);
		contentPane.add(panel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Accueil");
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
		panel_1.setBackground(new Color(240, 230, 140));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 228, 181));
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Mode de r\u00E9glement");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/commande/ATM-32.png")));
		
		JComboBox comboBox = new JComboBox();
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBorder(new LineBorder(new Color(184, 134, 11), 2));
		formattedTextField.setBackground(new Color(255, 140, 0));
		
		JButton btnNewButton_6 = new JButton("Valider la commande");
		btnNewButton_6.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorderPainted(false);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(88)
							.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addGap(76))
						.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
							.addComponent(btnNewButton_6)
							.addGap(28))))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(63))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_6))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 228, 181));
		panel_1.add(panel_3, BorderLayout.NORTH);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 607, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 393, Short.MAX_VALUE)
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 228, 181));
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(255, 200, 0), 3, true), "Valeurs de la commande", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(192, 192, 192)));
		panel_1.add(panel_4, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Selectionner un article");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setIcon(new ImageIcon(GestionCommande.class.getResource("/images/gestion/Search-48.png")));
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBackground(new Color(255, 165, 0));
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblCode)
					.addContainerGap(320, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCode)))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
	}
}
