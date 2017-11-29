package com.formation.model;

public class Commande {

	private int idcommande;
	private String date;
	private int client;
	private String modepaiement;
	private double totalTTC;
	
	public Commande() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Commande(int idcommande, String date, int client, String modepaiement, double totalTTC) {
		super();
		this.idcommande = idcommande;
		this.date = date;
		this.client = client;
		this.modepaiement = modepaiement;
		this.totalTTC = totalTTC;
	}



	public int getIdcommande() {
		return idcommande;
	}

	public void setIdcommande(int idcommande) {
		this.idcommande = idcommande;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public String getModepaiement() {
		return modepaiement;
	}

	public void setModepaiement(String modepaiement) {
		this.modepaiement = modepaiement;
	}

	public double getTotalTTC() {
		return totalTTC;
	}

	public void setTotalTTC(double totalTTC) {
		this.totalTTC = totalTTC;
	}
	
	
}
