package com.formation.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.formation.db.*;
/**
 * <b>Couche de données DAO pour l'objet Client</b>
 * <p>
 * Les opérations de stockage sont :
 * <ul>
 * <li>la création,</li>
 * <li>la lecture,</li>
 * <li>la modification,</li>
 * <li>la suppression.</li>
 * </ul>
 * </p>
 * <p>
 * On crée les couches DAO pour Article, Commande, User et InnerCommande.
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

	Connection connexion=ObjetConnect.getInstance();
	public ResultSet getAllClient() {
		try {
			Statement state=connexion.createStatement();
			ResultSet resultat=state.executeQuery("select * from client");
			/* Exécution d'une requête de lecture */
			

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public ResultSet getClient(int id) {
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from client where id_client="+id);
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public  int delClient(int id){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("DELETE FROM `client` WHERE id_client="+id);
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public   int addClient(int id_client,String nom, String prenom,String telephonef,String telephonem,String adresse,String codepostal, String ville,String email,boolean cartefidelite,String datecreation,String remarque){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("INSERT INTO `client`(`id_client`,`nom`, `prenom`, `telfixe`,`telmobile`,`adresse`,`codepostal`,`ville`,`email`,`cartefidelite`,`datecreation`,`remarque`) VALUES ("+id_client+",'"+nom+"','"+prenom+"','"+telephonef+"','"+telephonem+"','"+adresse+"','"+codepostal+"','"+ville+"','"+email+"',"+cartefidelite+",'"+datecreation+"','"+remarque+"')");
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public   int updateClient(int id,String nom, String prenom,String telephonef,String telephonem,String adresse,String codepostal, String ville,String email,boolean cartefidelite,String datecreation,String remarque){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("UPDATE `client` SET `nom`='"+nom+"', `prenom`='"+prenom+"', `telfixe`='"+telephonef+"',`telmobile`='"+telephonem+"',`adresse`='"+adresse+"',`codepostal`='"+codepostal+"',`ville`='"+ville+"',`email`='"+email+"',`cartefidelite`="+cartefidelite+",`datecreation`='"+datecreation+"',`remarque`='"+remarque+"' WHERE id_client="+id);
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
