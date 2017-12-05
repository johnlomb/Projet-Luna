package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Messages;

import controle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GestionArticle extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JLabel lblArticle;
	private JButton lblAperu;
	private JButton lblImprimer;
	private JButton lblExport;
	private JButton lblAcceuil;
	private JPanel panel_1;
	private JPanel panel_3;
	private JTextField textField_5;
	private JLabel lblRecherche;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPanel panel;
	private JTable table;
	private final Action action = new ActionAjouter();
	private final Action action2 = new ActionModifier();
	private final Action action3 = new ActionSupprimer();
	private Object tab[][];

	/**
	 * Launch the application.
	 */

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
		lblArticle.setIcon(
				new ImageIcon(GestionArticle.class.getResource("/images/gestion/article/Product-64-actif.png")));

		lblAperu = new JButton("Aper\u00E7u");
		lblAperu.setBorderPainted(false);
		lblAperu.setContentAreaFilled(false);
		lblAperu.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Preview-48.png")));

		lblImprimer = new JButton("Imprimer");
		lblImprimer.setContentAreaFilled(false);
		lblImprimer.setBorderPainted(false);
		lblImprimer.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Printer-48.png")));

		lblExport = new JButton("Export");
		lblExport.setContentAreaFilled(false);
		lblExport.setBorderPainted(false);
		lblExport.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Data-Export-48.png")));

		lblAcceuil = new JButton("Accueil");
		lblAcceuil.setBorderPainted(false);
		lblAcceuil.setContentAreaFilled(false);
		lblAcceuil.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Home-48.png")));
		lblAcceuil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestionArticle.this.dispose();
				Menu LaFenetreMenu = new Menu();
				LaFenetreMenu.setLocationRelativeTo(null);
				LaFenetreMenu.setVisible(true);
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2
				.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(5).addComponent(lblArticle,
								GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createSequentialGroup().addContainerGap(27, Short.MAX_VALUE)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addComponent(lblAcceuil)
										.addComponent(lblExport).addComponent(lblImprimer).addComponent(lblAperu))
								.addGap(30)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addGap(5).addComponent(lblArticle).addGap(85)
						.addComponent(lblAperu).addPreferredGap(ComponentPlacement.RELATED).addComponent(lblImprimer)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblExport)
						.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE).addComponent(lblAcceuil)
						.addGap(47)));
		panel_2.setLayout(gl_panel_2);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));

		panel_3 = new JPanel();

		panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 717, Short.MAX_VALUE)
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)));

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);

		table = new JTable();
		tab = TraitementArticle.remplissageTab();
		DefaultTableModel matable = new DefaultTableModel(tab,
				new String[] { "Code", "Code Catégorie", "Désignation", "Prix Unitaire" });
		table.setModel(matable);
		scrollPane.setViewportView(table);

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

		JSlider slider = new JSlider();
		slider.setBorder(null);
		slider.setPaintTicks(true);

		textField_4 = new JTextField();
		textField_4.setBackground(UIManager.getColor("Button.shadow"));
		textField_4.setColumns(10);

		JLabel lblQuantit = new JLabel("Quantit\u00E9");

		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setAction(action);
		btnAjouter.setContentAreaFilled(false);
		btnAjouter.setBorderPainted(false);
		btnAjouter.setPressedIcon(
				new ImageIcon(GestionArticle.class.getResource("/images/gestion/Add-New-48-actif.png")));
		btnAjouter.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Add-New-48.png")));

		JButton btnModifier = new JButton("Modifier");
		btnModifier.setAction(action2);
		btnModifier.setBorderPainted(false);
		btnModifier.setContentAreaFilled(false);
		btnModifier.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Data-Edit-48.png")));

		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setAction(action3);
		btnSupprimer.setContentAreaFilled(false);
		btnSupprimer.setBorderPainted(false);
		btnSupprimer.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Garbage-Open-48.png")));

		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.setContentAreaFilled(false);
		btnEffacer.setBorderPainted(false);
		btnEffacer.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Cancel-48.png")));
		btnEffacer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		JLabel label_1 = new JLabel("\u20AC");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(81).addComponent(btnAjouter).addGap(4)
						.addComponent(btnModifier).addGap(32).addComponent(btnSupprimer).addGap(18)
						.addComponent(btnEffacer))
				.addGroup(gl_panel_1.createSequentialGroup().addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addGap(24).addComponent(lblQuantit)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(slider, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
								.addComponent(lblNewLabel).addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(label_1)
								.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel_1.createSequentialGroup().addGap(10).addComponent(lblDsignation)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(textField_2, 637, 637, 637))
						.addGroup(gl_panel_1.createSequentialGroup().addGap(41).addComponent(lblCode).addGap(4)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
								.addGap(52).addComponent(lblCatgorie).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGap(10)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addGap(3).addComponent(lblCode))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup().addGap(3)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblCatgorie)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup().addGap(9).addComponent(lblDsignation))
								.addGroup(gl_panel_1.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addComponent(lblQuantit)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_1).addComponent(lblNewLabel)))
						.addGap(11)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(btnModifier)
										.addComponent(btnAjouter))
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(btnEffacer)
										.addComponent(btnSupprimer)))
						.addContainerGap()));
		panel_1.setLayout(gl_panel_1);

		lblRecherche = new JLabel("Recherche");
		lblRecherche.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Search-32.png")));

		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					synchronized(this) {
						String desi=textField_2.getText();
						tab=TraitementArticle.rechercheTab(desi);
						table.setModel(new DefaultTableModel(tab,new String[] { "Code", "Code Catégorie", "Désignation", "Prix Unitaire" }));
						}
					}
			}
		});
		textField_5.setColumns(10);
		

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cat\u00E9gorie");

		JRadioButton rdbtnCode = new JRadioButton("Code");

		JLabel lblTrierPar = new JLabel("Trier par");
		lblTrierPar.setIcon(new ImageIcon(GestionArticle.class.getResource("/images/gestion/Sort-Ascending-32.png")));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap(183, Short.MAX_VALUE)
						.addComponent(lblTrierPar).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(rdbtnCode)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(rdbtnNewRadioButton).addGap(18)
						.addComponent(lblRecherche).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel_3.createSequentialGroup().addContainerGap(101, Short.MAX_VALUE)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRecherche).addComponent(rdbtnNewRadioButton).addComponent(rdbtnCode)
								.addComponent(lblTrierPar))
						.addContainerGap()));
		panel_3.setLayout(gl_panel_3);
		contentPane.setLayout(gl_contentPane);
	}

	private class ActionAjouter extends AbstractAction {
		public ActionAjouter() {
			putValue(NAME, "Ajouter");
			putValue(SHORT_DESCRIPTION, "ajouter un article");
		}

		public void actionPerformed(ActionEvent e) {
			ajouter();
			JOptionPane.showMessageDialog(null, "article ajouté", "Ajout", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void ajouter() {
		int id = Integer.parseInt(textField_1.getText());
		String categorie = textField.getText();
		String designation = textField_2.getText();
		Double prixunitaire = Double.parseDouble(textField_3.getText());

		tab = TraitementArticle.ajouteTab(id, categorie, designation, prixunitaire);
		table.setModel(new DefaultTableModel(tab,

				new String[] { "Code", "Code Catégorie", "Désignation", "Prix Unitaire" }));

	}

	private class ActionModifier extends AbstractAction {
		public ActionModifier() {
			putValue(NAME, "Modifier");
			putValue(SHORT_DESCRIPTION, "modifier un article");
		}

		public void actionPerformed(ActionEvent e) {
			modifier();
			JOptionPane.showMessageDialog(null, "article modifié", "Modification", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void modifier() {
		int id = Integer.parseInt(textField_1.getText());
		String categorie = textField.getText();
		String designation = textField_2.getText();
		Double prixunitaire = Double.parseDouble(textField_3.getText());

		tab = TraitementArticle.modifTab(id, categorie, designation, prixunitaire);
		table.setModel(
				new DefaultTableModel(tab, new String[] { "Code", "Code Catégorie", "Désignation", "Prix Unitaire" }));
	}

	private class ActionSupprimer extends AbstractAction {
		public ActionSupprimer() {
			putValue(NAME, "Supprimer");
			putValue(SHORT_DESCRIPTION, "supprimer un article");
		}

		public void actionPerformed(ActionEvent e) {
			int n = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment supprimer l'article");
			supprimer(n);

		}
	}

	public void supprimer(int n) {
		int id = Integer.parseInt(textField_1.getText());
		if (n == 0) {
			tab = TraitementArticle.supprTab(id);
			table.setModel(new DefaultTableModel(tab,
					new String[] { "Code", "Code Catégorie", "Désignation", "Prix Unitaire" }));
			JOptionPane.showMessageDialog(null, "article supprimé", "Suppression", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
