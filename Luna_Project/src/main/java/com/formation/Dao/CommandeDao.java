package com.formation.Dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.formation.db.*;

public class CommandeDao {

	Connection connexion = ObjetConnect.getInstance();

	public ResultSet getAllCommande() {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select * from commande");
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet getUneCommande(int id) {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select * from commande where id_commande=" + id);
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int delCommande(int id) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("DELETE FROM `commande` WHERE id_commande=" + id);
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int addCommande(int id, String date, String client, String modepaiement, double totalTTC) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate(
					"INSERT INTO `commande`(`id_commande`,`date`, `client`, `modepaiement`) VALUES (" + id
							+ ",'" + date + "','" + client + "'," + modepaiement + totalTTC + ")");
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateCommande( int id, String date, String client, String modepaiement, double totalTTC) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("UPDATE `commande` SET `date`=" + date + ",`client`='"
					+ client + "',`modepaiement`=" + modepaiement+ "',`totalTTC`=" + totalTTC + " WHERE id=" + id);
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
