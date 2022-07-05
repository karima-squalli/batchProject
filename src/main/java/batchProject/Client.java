package batchProject;

import java.util.Date;

public class Client {

	private int id;
	private String nom;
	private String prénom;
	
	private Date date;
	private String produit;
	private double montant;
	private String statut;
	
	public Client(int id, String nom, String prénom, Date date, String produit, double montant, String statut) {
		this.id = id;
		this.nom = nom;
		this.prénom = prénom;
		this.date = date;
		this.produit = produit;
		this.montant = montant;
		this.statut = statut;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrénom() {
		return prénom;
	}
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProduit() {
		return produit;
	}
	public void setProduit(String produit) {
		this.produit = produit;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
}
