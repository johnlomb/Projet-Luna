package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;

public class Brouillon extends JFrame {

	private JPanel contentPane;
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
					Brouillon frame = new Brouillon();
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
	public Brouillon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("Code");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("Cat\u00E9gorie");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("D\u00E9signation");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("Quantit\u00E9");
		
		JSlider slider = new JSlider();
		slider.setToolTipText("jiji");
		slider.setPaintTicks(true);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("Prix Unitaire");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("\u20AC");
		
		JLabel label_6 = new JLabel("Ajouter");
		
		JLabel label_7 = new JLabel("Modifier");
		
		JLabel label_8 = new JLabel("Supprimer");
		
		JLabel label_9 = new JLabel("Effacer");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 615, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(230)
					.addComponent(label)
					.addGap(4)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_1)
					.addGap(4)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(199)
					.addComponent(label_2)
					.addGap(4)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(199)
					.addComponent(label_3)
					.addGap(6)
					.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_4)
					.addGap(4)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(label_5))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(247)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_7)
					.addGap(46)
					.addComponent(label_8)
					.addGap(27)
					.addComponent(label_9))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 458, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(label))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_6)
						.addComponent(label_7)
						.addComponent(label_8)
						.addComponent(label_9)))
		);
		panel.setLayout(gl_panel);
	}

}
