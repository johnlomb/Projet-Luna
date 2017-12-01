package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionArticle extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JLabel lblArticle;
	private JLabel lblAperu;
	private JLabel lblImprimer;
	private JLabel lblExport;
	private JLabel lblAcceuil;
	private JPanel panel_1;
	private JPanel panel_3;
	private JTextField textField_5;
	private JLabel lblRecherche;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionArticle frame = new GestionArticle();
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
	public GestionArticle() {
		setTitle("Gestion des Articles");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GestionArticle.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 153, 0));
		
		lblArticle = new JLabel("Articles");
		lblArticle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblArticle.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/article/Product-64-actif.png")));
		
		lblAperu = new JLabel("Aper\u00E7u");
		lblAperu.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Preview-48.png")));
		
		lblImprimer = new JLabel("Imprimer");
		lblImprimer.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Printer-48.png")));
		
		lblExport = new JLabel("Export");
		lblExport.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Data-Export-48.png")));
		
		lblAcceuil = new JLabel("Accueil");
		lblAcceuil.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Home-48.png")));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblArticle, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAcceuil)
						.addComponent(lblExport)
						.addComponent(lblImprimer)
						.addComponent(lblAperu))
					.addGap(30))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblArticle)
					.addGap(85)
					.addComponent(lblAperu)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblImprimer)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblExport)
					.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
					.addComponent(lblAcceuil)
					.addGap(47))
		);
		panel_2.setLayout(gl_panel_2);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		
		panel_3 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_3, 0, 0, Short.MAX_VALUE)
							.addGap(8))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 603, Short.MAX_VALUE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addGap(279)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
					.addGap(32))
		);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblCatgorie = new JLabel("Cat\u00E9gorie");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblCode = new JLabel("Code");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblDsignation = new JLabel("D\u00E9signation");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prix Unitaire");
		
		JLabel label = new JLabel("\u20AC");
		
		JSlider slider = new JSlider();
		slider.setBorder(null);
		slider.setPaintTicks(true);
		
		textField_4 = new JTextField();
		textField_4.setBackground(UIManager.getColor("Button.shadow"));
		textField_4.setColumns(10);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setContentAreaFilled(false);
		btnAjouter.setBorderPainted(false);
		btnAjouter.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Add-New-48.png")));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBorderPainted(false);
		btnModifier.setContentAreaFilled(false);
		btnModifier.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Data-Edit-48.png")));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setContentAreaFilled(false);
		btnSupprimer.setBorderPainted(false);
		btnSupprimer.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.setContentAreaFilled(false);
		btnEffacer.setBorderPainted(false);
		btnEffacer.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Cancel-48.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(41)
					.addComponent(lblCode)
					.addGap(4)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(lblCatgorie)
					.addGap(4)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDsignation)
					.addGap(4)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(24)
					.addComponent(lblQuantit)
					.addGap(4)
					.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(73)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(117)
					.addComponent(label))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(48)
					.addComponent(btnAjouter)
					.addGap(6)
					.addComponent(btnModifier)
					.addGap(6)
					.addComponent(btnSupprimer)
					.addGap(73)
					.addComponent(btnEffacer))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCode))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCatgorie))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDsignation))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuantit)
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label)))
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAjouter)
						.addComponent(btnModifier)
						.addComponent(btnSupprimer)
						.addComponent(btnEffacer)))
		);
		panel_1.setLayout(gl_panel_1);
		
		lblRecherche = new JLabel("Recherche");
		lblRecherche.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Search-32.png")));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cat\u00E9gorie");
		
		JRadioButton rdbtnCode = new JRadioButton("Code");
		
		JLabel lblTrierPar = new JLabel("Trier par");
		lblTrierPar.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Sort-Ascending-32.png")));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(183, Short.MAX_VALUE)
					.addComponent(lblTrierPar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnCode)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton)
					.addGap(18)
					.addComponent(lblRecherche)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap(101, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRecherche)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnCode)
						.addComponent(lblTrierPar))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		contentPane.setLayout(gl_contentPane);
	}
}
