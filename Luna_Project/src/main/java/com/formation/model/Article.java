package com.formation.model;
/*
 * @param idarticle
 * 		L'identifiant de l'article
 * @param codecategorie
 * 		Le code catégorie
 * @param designation
 * 		La désignation de l'article
 * @param quantite
 * 		Le nombre d'articles déclarés dans la commande
 * @param prixunitaire
 * 		Le prix unitaire de l'article
 */

public class Article {

	private int idarticle;
	private String codecategorie;
	private String designation;
	private int quantite;
	private double prixunitaire;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Article(int idarticle, String codecategorie, String designation, int quantite, double prixunitaire) {
		super();
		this.idarticle = idarticle;
		this.codecategorie = codecategorie;
		this.designation = designation;
		this.quantite = quantite;
		this.prixunitaire = prixunitaire;
	}


	public int getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(int idarticle) {
		this.idarticle = idarticle;
	}

	public String getCodecategorie() {
		return codecategorie;
	}

	public void setCodecategorie(String codecategorie) {
		this.codecategorie = codecategorie;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrixunitaire() {
		return prixunitaire;
	}

	public void setPrixunitaire(double prixunitaire) {
		this.prixunitaire = prixunitaire;
	}

	
}
