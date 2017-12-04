package controle;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.formation.Dao.*;
import com.formation.model.*;

public class TraitementClient {
	public static Object[][] remplissageTab() {

		ClientDao cdao = new ClientDao();
		ResultSet result = cdao.getAllClient();
		Object tab[][]=null;
		try {
			ResultSet nbl=cdao.getAllClient();
			nbl.last();
			int nbligne=nbl.getRow();
			tab = new Object[nbligne][5];
			Client clt = new Client();
			int i = 0, j = 0;

			while (result.next()) {
				j = 0;
				clt.setIdclient(result.getInt("id_client"));
				tab[i][j] = clt.getIdclient();
				clt.setNom(result.getString("nom"));
				j++;
				tab[i][j] = clt.getNom();
				clt.setPrenom(result.getString("prenom"));
				j++;
				tab[i][j] = clt.getPrenom();
				clt.setCartefidelite(result.getBoolean("cartefidelite"));
				j++;
				tab[i][j] = clt.isCartefidelite();
				clt.setDatecreation(result.getString("datecreation"));
				j++;
				tab[i][j] = clt.getDatecreation();
				i++;

			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Problème", "Veuillez appeller un administrateur",
					JOptionPane.ERROR_MESSAGE);
		}

		return tab;
	}
}
