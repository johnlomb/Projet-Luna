package com.formation.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ObjetConnect {
	
	private String url="jdbc:mysql://localhost:3306/luna_projet";
	private String user="root";
	private String password="";
	
	private static Connection connect;
	
	private ObjetConnect(){
		try {
			connect=DriverManager.getConnection(url,user, password);
		}catch(SQLException e) {
			e.printStackTrace(); // affiche l'exception et l'état de la pile d'éxécution au moment de son appel
		}
	}
	
	public static Connection getInstance() {
		if (connect==null){
			new ObjetConnect();
			
		}return connect;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjetConnect monobjet=new ObjetConnect();
	}

}
