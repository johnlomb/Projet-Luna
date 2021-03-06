package com.formation.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.formation.db.*;

/**
 * <b>Couche de donn�es DAO pour l'objet Client</b>
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
 * On cr�e les couches DAO pour Article, Commande, User et InnerCommande.
 * </p>
 * 
 * @see ArticleDao
 * @see CommandeDao
 * @see UserDao
 * @see InnerCommandeDao
 * 
 * @author nwahnawe
 * @version 1.0
 */
public class ClientDao {

	Connection connexion = ObjetConnect.getInstance();

	public ResultSet getAllClient() {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select * from client");
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet getClient(int id) {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select * from client where id_client=" + id);
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int delClient(int id) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("DELETE FROM `client` WHERE id_client=" + id);
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int addClient(int id_client, String nom, String prenom, String telephonef, String telephonem, String adresse,
			String codepostal, String ville, String email, boolean cartefidelite, String datecreation,
			String remarque) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate(
					"INSERT INTO `client`(`id_client`,`nom`, `prenom`, `telfixe`,`telmobile`,`adresse`,`codepostal`,`ville`,`email`,`cartefidelite`,`datecreation`,`remarque`) VALUES ("
							+ id_client + ",'" + nom + "','" + prenom + "','" + telephonef + "','" + telephonem + "','"
							+ adresse + "','" + codepostal + "','" + ville + "','" + email + "'," + cartefidelite + ",'"
							+ datecreation + "','" + remarque + "')");
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateClient(int id, String nom, String prenom, String telephonef, String telephonem, String adresse,
			String codepostal, String ville, String email, boolean cartefidelite, String datecreation,
			String remarque) {
		try {
			Statement state = connexion.createStatement();
			int resultat = state.executeUpdate("UPDATE `client` SET `nom`='" + nom + "', `prenom`='" + prenom
					+ "', `telfixe`='" + telephonef + "',`telmobile`='" + telephonem + "',`adresse`='" + adresse
					+ "',`codepostal`='" + codepostal + "',`ville`='" + ville + "',`email`='" + email
					+ "',`cartefidelite`=" + cartefidelite + ",`datecreation`='" + datecreation + "',`remarque`='"
					+ remarque + "' WHERE id_client=" + id);
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ResultSet rechercheClient(int id, String datecreation, String prenom, String nom, String adresse,
			String telephonef, String telephonem, String email) {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery(
					"Select id_client,nom,prenom,cartefidelite,datecreation from client where id_client like '%" + id
							+ "%' and datecreation like'%" + datecreation + "%' and prenom like '%" + prenom
							+ "%' and nom like '%" + nom + "%' and adresse like '%" + adresse + "%' and telfixe like '%"
							+ telephonef + "%' and telmobile like '%" + telephonem + "%' and email like '%" + email
							+ "%'");
			/* Ex�cution d'une requ�te de lecture */

			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet rechercheClient(String datecreation, String prenom, String nom, String adresse, String telephonef,
			String telephonem, String email) {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery(
					"Select id_client,nom,prenom,cartefidelite,datecreation from client where datecreation like'%"
							+ datecreation + "%' and prenom like '%" + prenom + "%' and nom like '%" + nom
							+ "%' and adresse like '%" + adresse + "%' and telfixe like '%" + telephonef
							+ "%' and telmobile like '%" + telephonem + "%' and email like '%" + email + "%'");
			/* Ex�cution d'une requ�te de lecture */

			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}
