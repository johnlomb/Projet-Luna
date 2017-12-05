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
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
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
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
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
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
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
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
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
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
