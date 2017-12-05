package controle;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.formation.Dao.*;
import com.formation.model.*;

public class TraitementClient {
	ClientDao cdao = new ClientDao();

	public static Object[][] remplissageTab() {

		ClientDao cdao = new ClientDao();
		ResultSet result = cdao.getAllClient();
		Object tab[][] = null;
		try {
			ResultSet nbl = cdao.getAllClient();
			nbl.last();
			int nbligne = nbl.getRow();
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

	public void ajouteTab(int id_client, String datecreation, String prenom, String nom, String adresse,
			String codepostal, String ville, String telephonef, String telephonem, String email, boolean cartefidelite,
			String remarque) {
		cdao.addClient(id_client, nom, prenom, telephonef, telephonem, adresse, codepostal, ville, email, cartefidelite,
				datecreation, remarque);
	}

	public void modifTab(int id_client, String datecreation, String prenom, String nom, String adresse,
			String codepostal, String ville, String telephonef, String telephonem, String email, boolean cartefidelite,
			String remarque) {
		cdao.updateClient(id_client, nom, prenom, telephonef, telephonem, adresse, codepostal, ville, email,
				cartefidelite, datecreation, remarque);
	}

	public void supprTab(int id) {
		cdao.delClient(id);
	}

	public static Object[][] rechercheTab(int id, String date, String prenom, String nom, String adresse, String tfixe,
			String tmobile, String email) {
		ResultSet result;
		ClientDao cdao = new ClientDao();
		Object tab[][] = null;
		int nbligne;
		try {
			if (id != 0) {
				result = cdao.rechercheClient(id, date, prenom, nom, adresse, tfixe, tmobile, email);
				ResultSet nbl = cdao.rechercheClient(id, date, prenom, nom, adresse, tfixe, tmobile, email);
				nbl.last();
				nbligne = nbl.getRow();
			} else {
				result = cdao.rechercheClient(date, prenom, nom, adresse, tfixe, tmobile, email);
				ResultSet nbl = cdao.rechercheClient(date, prenom, nom, adresse, tfixe, tmobile, email);;
				nbl.last();
				nbligne = nbl.getRow();
			}

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
