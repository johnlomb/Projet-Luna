package com.formation.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.formation.db.ObjetConnect;
/**
 * <b>Couche de donn�es DAO pour l'objet User</b>
 * <p>
 * Les op�rations de stockage sont :
 * <ul>
 * <li>la cr�ation,</li>
 * <li>la lecture,</li>
 * <li>la modification,</li>
 * <li>la suppression.</li>
 * </ul>
 * </p>
 * <p>
 * On cr�e les couches DAO pour Client, Commande, Article et InnerCommande.
 * </p>
 * 
 * @see ClientDao
 * @see CommandeDao
 * @see ArticleDao
 * @see InnerCommandeDao
 * 
 * @author nwahnawe
 * @version 1.0
 */
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
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
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
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
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
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
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
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
