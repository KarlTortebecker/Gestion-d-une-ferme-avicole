package com.bd.projetbd.entities;

import java.time.LocalDate;

import javax.persistence.Column;
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
    
    
	
	public Produits(byte[] image, String nomImage, String typeProduits, String origine, int quantite, LocalDate date,
			double prixProduit, String nomProduit) {
		super();
		this.image = image;
		this.nomImage = nomImage;
		this.typeProduits = typeProduits;
		this.origine = origine;
		this.quantite = quantite;
		this.date = date;
		this.prixProduit = prixProduit;
		this.nomProduit = nomProduit;
	}



	@Column(name="image",length=Integer.MAX_VALUE,nullable=true)
	private byte[] image;
	
	@Column(name="nomImage",length=Integer.MAX_VALUE,nullable=true)
	private String nomImage;
	
	
	

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getNomImage() {
		return nomImage;
	}

	public void setNomImage(String nomImage) {
		this.nomImage = nomImage;
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
	private LocalDate date=LocalDate.now();
	private double prixProduit;
	private String nomProduit;
	
	
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
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
