package com.bd.projetbd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pertes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPerte;
	
	public Pertes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pertes(String typePerte, String originePerte, int quantite) {
		super();
		this.typePerte = typePerte;
		this.originePerte = originePerte;
		this.quantite = quantite;
	}
	public Long getIdPerte() {
		return idPerte;
	}
	public void setIdPerte(Long idPerte) {
		this.idPerte = idPerte;
	}
	public String getTypePerte() {
		return typePerte;
	}
	public void setTypePerte(String typePerte) {
		this.typePerte = typePerte;
	}
	public String getOriginePerte() {
		return originePerte;
	}
	public void setOriginePerte(String originePerte) {
		this.originePerte = originePerte;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	private String typePerte;
	private String originePerte;
	private int quantite;
	
	@ManyToOne
	private Bande bandePerte;
}
