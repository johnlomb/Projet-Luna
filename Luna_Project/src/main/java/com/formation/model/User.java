package com.formation.model;

public class User {

	private int iduser;
	private String pseudo;
	private String mdp;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int iduser, String pseudo, String mdp) {
		super();
		this.iduser = iduser;
		this.pseudo = pseudo;
		this.mdp = mdp;
	}


	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
}
