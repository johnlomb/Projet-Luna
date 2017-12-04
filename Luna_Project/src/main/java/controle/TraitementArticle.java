package controle;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.formation.Dao.ArticleDao;
import com.formation.model.Article;

public class TraitementArticle {

	public static Object[][] remplissageTab() {

		ArticleDao adao = new ArticleDao();
		ResultSet result = adao.getAllArticle();
		Object tab[][]=null;
		try {
			ResultSet nbl=adao.getAllArticle();
			nbl.last();
			int nbligne=nbl.getRow();
			tab = new Object[nbligne][4];
			Article art = new Article();
			int i = 0, j = 0;

			while (result.next()) {
				j = 0;
				art.setIdarticle(result.getInt("id_article"));
				tab[i][j] = art.getIdarticle();
				art.setCodecategorie(result.getString("code_categorie"));
				j++;
				tab[i][j] = art.getCodecategorie();
				art.setDesignation(result.getString("designation"));
				j++;
				tab[i][j] = art.getDesignation();
				art.setPrixunitaire(result.getDouble("prix_unitaire"));
				j++;
				tab[i][j] = art.getPrixunitaire();
				i++;

			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Problème", "Veuillez appeller un administrateur",
					JOptionPane.ERROR_MESSAGE);
		}

		return tab;
	}
}
