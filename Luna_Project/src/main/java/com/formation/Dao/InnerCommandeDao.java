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
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
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
					.executeUpdate("INSERT INTO `innercommande`(`id_commande`,`id_article`, `quantité`) VALUES (" + idc
							+ "," + ida + "," + quantite + ")");
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateInnerCommande(int ida, int idc, int quantite) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("UPDATE `innercommande` SET `quantité`= " + quantite
					+ " WHERE `id_article`= " + ida + " AND `id_commande`= " + idc);
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
