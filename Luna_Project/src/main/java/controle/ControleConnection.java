package controle;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.formation.Dao.UserDao;
import com.formation.model.User;
import com.mysql.jdbc.Messages;

public class ControleConnection {

	public boolean verifUser(String userName, String password) {
		UserDao udao = new UserDao();
		ResultSet result = udao.getAllUser();
		User utilisateur=new User();
		try {
			while (result.next()) {
				utilisateur.setPseudo(result.getString("pseudo"));
				utilisateur.setMdp(result.getString("mdp"));
				if (utilisateur.getPseudo().equals(userName) && utilisateur.getMdp().equals(password)) {
					return true;
				}
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Problème","Veuillez appeller un administrateur",JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}
