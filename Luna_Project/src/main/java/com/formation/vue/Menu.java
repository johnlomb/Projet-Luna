package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setLocationRelativeTo(null);

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
	public Menu() {
		setTitle("Accueil");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 489);
		setResizable(false);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);

		JMenu mnVues = new JMenu("Vues");
		menuBar.add(mnVues);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.WEST);

		JButton btnNewButton = new JButton("Quitter");
		btnNewButton.setIcon(new ImageIcon(Menu.class.getResource("/images/connection/Stop-48.png")));
		SwingUtilities.invokeLater(() -> btnNewButton.requestFocusInWindow());
		btnNewButton.addActionListener((ActionEvent e) -> {
			dispose();
		});

		JLabel lblSarlLuna = new JLabel("SARL LUNA");
		lblSarlLuna.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE).addGap(0))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup().addGap(20)
						.addComponent(lblSarlLuna, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(lblSarlLuna)
						.addPreferredGap(ComponentPlacement.RELATED, 335, Short.MAX_VALUE).addComponent(btnNewButton)
						.addContainerGap()));
		panel.setLayout(gl_panel);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);

		JButton button = new JButton("");
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setPressedIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Diagram-128.png")));
		button.setRolloverIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Diagram-128-actif.png")));
		button.setIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Diagram-128.png")));

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setPressedIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Settings-02-128.png")));
		btnNewButton_1
				.setRolloverIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Settings-02-128-actif.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Settings-02-128.png")));

		JButton button_1 = new JButton("");
		button_1.setRolloverIcon(new ImageIcon(Menu.class.getResource("/images/accueil/People-128-actif.png")));
		button_1.setPressedIcon(new ImageIcon(Menu.class.getResource("/images/accueil/People-128.png")));
		button_1.setBorderPainted(false);
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setIcon(new ImageIcon(Menu.class.getResource("/images/accueil/People-128.png")));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.this.dispose();
				GestionClient LaFenetreClient = new GestionClient();
				LaFenetreClient.setLocationRelativeTo(null);
				LaFenetreClient.setVisible(true);
			}
		});

		JButton button_2 = new JButton("");
		button_2.setRolloverIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Product-128-actif.png")));
		button_2.setPressedIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Product-128.png")));
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Product-128.png")));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu.this.dispose();
				GestionArticle LaFenetreArticle = new GestionArticle();
				LaFenetreArticle.setLocationRelativeTo(null);
				LaFenetreArticle.setVisible(true);
			}
		});
		JButton button_3 = new JButton("");
		button_3.setRolloverIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Shopping-Bag-128-actif.png")));
		button_3.setPressedIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setIcon(new ImageIcon(Menu.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addComponent(button_1)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addComponent(button_2)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup().addComponent(button)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(button_3))
										.addComponent(btnNewButton_1)))
						.addContainerGap(189, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addComponent(button_3)
								.addGroup(gl_panel_1.createSequentialGroup().addComponent(button_2)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
												.addComponent(button).addComponent(button_1))))
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnNewButton_1)
						.addContainerGap(117, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);
	}
}
