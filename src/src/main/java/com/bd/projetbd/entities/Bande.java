package com.bd.projetbd.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Bande {

	public Bande(String nomBande, String origine, int quantite) {
		super();
		this.nomBande = nomBande;
		this.origine = origine;
		this.quantite = quantite;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idBande;
	
	private String nomBande;
	private String origine;
	private int quantite;
	public Long getIdBande() {
		return idBande;
	}
	public void setIdBande(Long idBande) {
		this.idBande = idBande;
	}
	public String getNomBande() {
		return nomBande;
	}
	public void setNomBande(String nomBande) {
		this.nomBande = nomBande;
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
	public Bande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(mappedBy="bandeDepense")
	private List<Depense> depenseBande;
	
	@OneToMany(mappedBy="bandeProduit")
	private List<Produits> produitBande;
	
	@ManyToOne
	private Employe employeBande;
	
	@OneToMany(mappedBy="bandePerte")
	private List<Pertes> perteBande;
	public List<Depense> getDepenseBande() {
		return depenseBande;
	}
	public void setDepenseBande(List<Depense> depenseBande) {
		this.depenseBande = depenseBande;
	}
	public List<Produits> getProduitBande() {
		return produitBande;
	}
	public void setProduitBande(List<Produits> produitBande) {
		this.produitBande = produitBande;
	}

	public Employe getEmployeBande() {
		return employeBande;
	}
	public void setEmployeBande(Employe employeBande) {
		this.employeBande = employeBande;
	}
	public List<Pertes> getPerteBande() {
		return perteBande;
	}
	public void setPerteBande(List<Pertes> perteBande) {
		this.perteBande = perteBande;
	}
	
}
