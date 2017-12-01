package depart;

import java.awt.EventQueue;

import com.formation.vue.Launcher;

public class Start implements Runnable {
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Start());
	}
	public void run() {
		Launcher frame = new Launcher();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
