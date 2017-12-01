package com.formation.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.formation.db.ObjetConnect;

public class InnerCommandeDao {

	Connection connexion = ObjetConnect.getInstance();

	public ResultSet getAllArticleCommande(int id) {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select * from innercommande where id_commande=" + id);
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int delInnerCommande(int idc, int ida) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate(
					"DELETE FROM `innercommande` WHERE `id_commande`= " + idc + " AND id_article = " + ida);
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int addInnerCommande(int idc, int ida, int quantite) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state
					.executeUpdate("INSERT INTO `innercommande`(`id_commande`,`id_article`, `quantit�`) VALUES (" + idc
							+ "," + ida + "," + quantite + ")");
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateInnerCommande(int ida, int idc, int quantite) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("UPDATE `innercommande` SET `quantit�`= " + quantite
					+ " WHERE `id_article`= " + ida + " AND `id_commande`= " + idc);
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
