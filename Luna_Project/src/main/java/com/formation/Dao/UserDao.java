package com.formation.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.formation.db.ObjetConnect;

public class UserDao {

	Connection connexion = ObjetConnect.getInstance();

	public ResultSet getAllUser() {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select * from utilisateur");
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet getUnUtilisateur(int id) {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select * from utilisateur where id_user=" + id);
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int delUser(int id) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("DELETE FROM `utilisateur` WHERE id_user=" + id);
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int addUser(int id, String pseudo, String mdp) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate(
					"INSERT INTO `utilisateur`(`id_user`,`pseudo`, `mdp`) VALUES (" + id
							+ ",'" + pseudo + "','" + mdp + "')");
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateUser(int id, String pseudo, String mdp) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("UPDATE `utilisateur` SET `pseudo`='"
					+ pseudo + "',`mdp`='" + mdp+  "' WHERE `id_user`=" + id);
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
