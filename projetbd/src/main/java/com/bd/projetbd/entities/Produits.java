package com.bd.projetbd.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produits {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduits;
	
	public Produits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produits(String typeProduits, String origine, int quantite, LocalDate date, double prixProduit) {
		super();
		this.typeProduits = typeProduits;
		this.origine = origine;
		this.quantite = quantite;
		this.date = date;
		this.prixProduit = prixProduit;
	}
	public Long getIdProduits() {
		return idProduits;
	}
	public void setIdProduits(Long idProduits) {
		this.idProduits = idProduits;
	}
	public String getTypeProduits() {
		return typeProduits;
	}
	public void setTypeProduits(String typeProduits) {
		this.typeProduits = typeProduits;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}
	private String typeProduits;
	private String origine;
	private int quantite;
	private LocalDate date;
	private double prixProduit;
	
	@ManyToOne
	private Bande bandeProduit;
	
	
	@ManyToOne
	private Commande cmdProduit;

	public Bande getBandeProduit() {
		return bandeProduit;
	}
	public void setBandeProduit(Bande bandeProduit) {
		this.bandeProduit = bandeProduit;
	}

	public Commande getCmdProduit() {
		return cmdProduit;
	}
	public void setCmdProduit(Commande cmdProduit) {
		this.cmdProduit = cmdProduit;
	}
	
	
	
	
}
