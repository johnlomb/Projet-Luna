package com.formation.model;

public class Client {
	
	private int idclient;
	private String nom;
	private String prenom;
	private boolean cartefidelite;
	private String datecreation;
	private String adresse;
	private String telfixe;
	private String telmobile;
	private String email;
	private String remarques;
	private int codepostal;
	private String ville;
	
	

	

	public Client(int idclient, String nom, String prenom, boolean cartefidelite, String datecreation, String adresse,
			String telfixe, String telmobile, String email, String remarques, int codepostal, String ville) {
		super();
		this.idclient = idclient;
		this.nom = nom;
		this.prenom = prenom;
		this.cartefidelite = cartefidelite;
		this.datecreation = datecreation;
		this.adresse = adresse;
		this.telfixe = telfixe;
		this.telmobile = telmobile;
		this.email = email;
		this.remarques = remarques;
		this.codepostal = codepostal;
		this.ville = ville;
	}



	public int getIdclient() {
		return idclient;
	}



	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public boolean isCartefidelite() {
		return cartefidelite;
	}



	public void setCartefidelite(boolean cartefidelite) {
		this.cartefidelite = cartefidelite;
	}



	public String getDatecreation() {
		return datecreation;
	}



	public void setDatecreation(String datecreation) {
		this.datecreation = datecreation;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getTelfixe() {
		return telfixe;
	}



	public void setTelfixe(String telfixe) {
		this.telfixe = telfixe;
	}



	public String getTelmobile() {
		return telmobile;
	}



	public void setTelmobile(String telmobile) {
		this.telmobile = telmobile;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getRemarques() {
		return remarques;
	}



	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}



	public int getCodepostal() {
		return codepostal;
	}



	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}
	
	

}
