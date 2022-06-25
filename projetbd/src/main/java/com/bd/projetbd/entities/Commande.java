package com.bd.projetbd.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCommande;

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 @ManyToOne
	 private Client clientCmd;
	 
	 @OneToMany(mappedBy="cmdProduit")
	 private List<Produits> produitCmd;

	public Client getClientCmd() {
		return clientCmd;
	}

	public void setClientCmd(Client clientCmd) {
		this.clientCmd = clientCmd;
	}

	public List<Produits> getProduitCmd() {
		return produitCmd;
	}

	public void setProduitCmd(List<Produits> produitCmd) {
		this.produitCmd = produitCmd;
	}
	 
	 private String nomCmd;
	 
	 public Commande(String nomCmd, String nomClient, String prenomClient) {
		super();
		this.nomCmd = nomCmd;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
	}

	public String getNomCmd() {
		return nomCmd;
	}

	public void setNomCmd(String nomCmd) {
		this.nomCmd = nomCmd;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	private String nomClient;
	 private String prenomClient;
	 
	 
	 
}
