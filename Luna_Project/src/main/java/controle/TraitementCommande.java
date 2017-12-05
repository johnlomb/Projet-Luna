package controle;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.formation.Dao.*;
import com.formation.model.Commande;
public class TraitementCommande {

	public static Object[][] remplissageTab() {
		CommandeDao cdao= new CommandeDao();
		ResultSet result = cdao.getAllCommande();
		Object tab[][]=null;
		
		try {
			ResultSet nbl=cdao.getAllCommande();
			nbl.last();
			int nbligne=nbl.getRow();
			tab = new Object[nbligne][4];
			Commande com = new Commande();
			int i = 0, j = 0;

			while (result.next()) {
				j = 0;
				com.setIdcommande(result.getInt("id_commande"));
				tab[i][j] = com.getIdcommande();
				com.setClient(result.getString("client"));
				j++;
				tab[i][j] = com.getDate();
				com.setDate(result.getString("date"));
				j++;
				tab[i][j] = com.getModepaiement();
				com.setModepaiement(result.getString("modepaiement"));
				j++;
				tab[i][j] = com.getTotalTTC();
				com.setTotalTTC(result.getDouble("totalTTC"));
				i++;

			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Problème", "Veuillez appeller un administrateur",
					JOptionPane.ERROR_MESSAGE);
		}
		return tab;
	}
}
