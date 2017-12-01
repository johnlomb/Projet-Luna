package com.formation.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.formation.Dao.*;
import com.sun.jmx.remote.internal.ClientListenerInfo;

public class TestDao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ArticleDao monarticle = new ArticleDao();
		CommandeDao macommande = new CommandeDao();
		UserDao user1 = new UserDao();
		ClientDao client = new ClientDao();
		InnerCommandeDao lignecommande1 = new InnerCommandeDao();

		// Testé pour ArticleDao
		// monarticle.addArticle(1,"electromenager", "machine à laver",500);
		// monarticle.delArticle(2);
		/*
		 * ResultSet result=monarticle.getUnArticle(1); while (result.next()) {
		 * System.out.println(result.getInt("id_article")); }
		 */

		/*
		 * ResultSet result=monarticle.getAllArticle(); while (result.next()) {
		 * System.out.println(result.getInt( "id_article"));
		 * System.out.println(result.getString("code_categorie"));
		 * System.out.println(result.getString("designation"));
		 * System.out.println(result.getInt("prix_unitaire")); }
		 */

		// CommandeDao testé
		/*
		 * macommande.addCommande(1, "30/09/1994", "Ninie", "Espèces", 520);
		 * macommande.addCommande(2, "28/05/1993", "Benoit", "CB", 850);
		 * macommande.addCommande(3, "24/02/1994", "Marie", "Chèque", 55);
		 * macommande.addCommande(4, "17/07/1963", "Jean", "Espèces", 58);
		 * macommande.addCommande(5, "28/06/1991", "Orean", "CB", 654);
		 */

		// macommande.updateCommande(1, "30/11/2017", "Ninie", "Chèque", 562);
		// macommande.delCommande(2);

		/*
		 * ResultSet result=macommande.getAllCommande(); while (result.next()) {
		 * System.out.println(result.getInt( "id_commande"));
		 * System.out.println(result.getString("client"));
		 * System.out.println(result.getString("date"));
		 * System.out.println(result.getString("modepaiement"));
		 * System.out.println(result.getInt("totalTTC")); }
		 */
		/*
		 * ResultSet result=macommande.getUneCommande(3); while (result.next()) {
		 * System.out.println(result.getInt( "id_commande"));
		 * System.out.println(result.getString("client"));
		 * System.out.println(result.getString("date"));
		 * System.out.println(result.getString("modepaiement"));
		 * System.out.println(result.getInt("totalTTC")); }
		 */

		// Testé UserDao
		/*
		 * user1.addUser(1, "user1", "mdp1"); user1.addUser(2, "user2","mdp2");
		 * user1.addUser(3, "user3", "mdp3");
		 */

		// user1.updateUser(1, "nwahnawe", "mdp1");
		// user1.delUser(1);

		/*
		 * ResultSet result=user1.getAllUser(); while (result.next()) {
		 * System.out.println(result.getInt( "id_user"));
		 * System.out.println(result.getString("mdp"));
		 * System.out.println(result.getString("pseudo")); }
		 */

		/*
		 * ResultSet result = user1.getUnUtilisateur(2); while (result.next()) {
		 * System.out.println(result.getInt("id_user"));
		 * System.out.println(result.getString("mdp"));
		 * System.out.println(result.getString("pseudo")); }
		 */

		// Client Dao testé
		// client.addClient(1, "WAHNAWE", "Ninie", "0674549526", "0652455625", "6 rue de
		// la soif", "79000", "Boulogne", "lucian.naicul@hou.fr",true, "25/12/2017",
		// "client très fidèle");
		// client.addClient(2, "DIKO", "Sonia", "0615241536", "0678594786", "6 rue de la
		// faim", "86000", "Jokin", "gzgzgz.naicul@hou.fr",false, "25/07/2017", "client
		// rare ");
		// client.updateClient(1, "WAHNAWE", "Sonia", "0745125823", "0748568952", "19
		// rue de la famine", "68000", "Poitiers", "email@yahoo.fr", true, "25/05/2017",
		// "remarque");
		// client.delClient(1);

		/*
		 * ResultSet result = client.getAllClient(); while (result.next()) {
		 * System.out.println(result.getInt("id_client"));
		 * System.out.println(result.getString("nom"));
		 * System.out.println(result.getString("prenom"));
		 * System.out.println(result.getString("remarque"));
		 * System.out.println(result.getString("telfixe"));
		 * System.out.println(result.getString("telmobile"));
		 * System.out.println(result.getString("ville"));
		 * System.out.println(result.getString("adresse"));
		 * System.out.println(result.getString("codepostal"));
		 * System.out.println(result.getBoolean("cartefidelite"));
		 * System.out.println(result.getString("datecreation"));
		 * System.out.println(result.getString("email"));
		 * 
		 * }
		 */
		/* ResultSet result = client.getClient(1);
		while (result.next()) {
			System.out.println(result.getInt("id_client"));
			System.out.println(result.getString("nom"));
			System.out.println(result.getString("prenom"));
			System.out.println(result.getString("remarque"));
			System.out.println(result.getString("telfixe"));
			System.out.println(result.getString("telmobile"));
			System.out.println(result.getString("ville"));
			System.out.println(result.getString("adresse"));
			System.out.println(result.getString("codepostal"));
			System.out.println(result.getBoolean("cartefidelite"));
			System.out.println(result.getString("datecreation"));
			System.out.println(result.getString("email"));
		}
		*/
		
		// InnerCommandeDao
		
		//lignecommande1.addInnerCommande(1, 1, 6);
		//lignecommande1.addInnerCommande(1, 2, 1);
		//lignecommande1.addInnerCommande(2, 2, 58);
		

		//lignecommande1.delInnerCommande(1, 1);
		
	}

}
