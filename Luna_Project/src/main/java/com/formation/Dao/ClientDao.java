package com.formation.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.formation.db.*;

public class ClientDao {

	Connection connexion=ObjetConnect.getInstance();
	public ResultSet getAllClient() {
		try {
			Statement state=connexion.createStatement();
			ResultSet resultat=state.executeQuery("select * from client");
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
