package com.formation.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.formation.db.ObjetConnect;
/**
 * <b>Couche de données DAO pour l'objet InnerCommande</b>
 * <p>
 * Cette classe permet de gérer les lignes de commande.
 * Les opérations de stockage sont :
 * <ul>
 * <li>la création,</li>
 * <li>la lecture,</li>
 * <li>la modification,</li>
 * <li>la suppression.</li>
 * </ul>
 * </p>
 * <p>
 * On crée les couches DAO pour Client, Commande, User et Article.
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
	public ResultSet commandecomplete() {
		try {
			Statement state = connexion.createStatement();
			ResultSet resultat = state.executeQuery("select c.id_commande,a.code_categorie,a.designation,i.quantité,a.prix_unitaire,i.quantité*a.prix_unitaire as total from innercommande as i,commande as c, article as a where c.id_commande=i.id_commande and a.id_article=i.id_article");
			/* Exécution d'une requête de lecture */

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
