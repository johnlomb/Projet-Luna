package com.formation.Dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.formation.db.*;
/**
 * <b>Couche de donn�es DAO pour l'objet Commande</b>
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
 * On cr�e les couches DAO pour Client, Article, User et InnerCommande.
 * </p>
 * 
 * @see ClientDao
 * @see ArticleDao
 * @see UserDao
 * @see InnerCommandeDao
 * 
 * @author nwahnawe
 * @version 1.0
 */
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
					"INSERT INTO `commande`(`id_commande`,`date`, `client`, `modepaiement`,`totalTTC`) VALUES (" + id
							+ ",'" + date + "','" + client + "','" + modepaiement + "'," + totalTTC + ")");
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
			int resultat = state.executeUpdate("UPDATE `commande` SET `date`='" + date + "',`client`='"
					+ client + "',`modepaiement`='" + modepaiement+ "',`totalTTC`=" + totalTTC + " WHERE id_commande=" + id);
			/* Ex�cution d'une requ�te de lecture */

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
