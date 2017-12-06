package controle;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.formation.Dao.*;
import com.formation.model.*;

public class TraitementCE {
	public static Object[][] remplissageTab() {

		InnerCommandeDao icdao = new InnerCommandeDao();
		ResultSet result = icdao.commandecomplete();
		Object tab[][] = null;
		try {
			ResultSet nbl = icdao.commandecomplete();
			nbl.last();
			int nbligne = nbl.getRow();
			tab = new Object[nbligne][6];
			int i = 0, j = 0;

			while (result.next()) {
				j = 0;
				tab[i][j] = result.getInt("id_commande");
				j++;
				tab[i][j] = result.getString("code_categorie");
				j++;
				tab[i][j] = result.getString("designation");
				j++;
				tab[i][j] = result.getInt("quantité");
				j++;
				tab[i][j] = result.getDouble("prix_unitaire");
				j++;
				tab[i][j] = result.getDouble("total");
				i++;

			}
		} catch (SQLException e) {
			//JOptionPane.showMessageDialog(null, "Problème", "Veuillez appeller un administrateur",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

		return tab;
	}
}
