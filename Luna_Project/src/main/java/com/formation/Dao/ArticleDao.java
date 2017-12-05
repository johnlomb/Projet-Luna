package com.formation.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.formation.db.*;

public class ArticleDao {

	Connection connexion = ObjetConnect.getInstance();

	public ResultSet getAllArticle() {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select * from article");
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet getUnArticle(int id) {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select * from article where id_article=" + id);
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int delArticle(int id) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("DELETE FROM `article` WHERE id_article=" + id);
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int addArticle(int id, String categorie, String desi, double prixUnitaire) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate(
					"INSERT INTO `article`(`id_article`,`code_categorie`, `designation`, `prix_unitaire`) VALUES (" + id
							+ ",'" + categorie + "','" + desi + "'," + prixUnitaire + ")");
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateArticle(int id, String desi, String categorie, double prixUnitaire) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("UPDATE `article` SET `code_categorie`='" + categorie
					+ "',`designation`='" + desi + "',`prix_unitaire`=" + prixUnitaire + " WHERE id_article=" + id);
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ResultSet rechercheArticle(String desi) {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("Select * from article where designation like '%" + desi + "%'");
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
