package com.bd.projetbd.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Depense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDepense;
	
	private String type;
	private int quantite;
	
	private double prixunit;
     
	private LocalDate date=LocalDate.now();
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Depense getBandeDepense() {
		return bandeDepense;
	}

	public void setBandeDepense(Depense bandeDepense) {
		this.bandeDepense = bandeDepense;
	}

	public Long getIdDepense() {
		return idDepense;
	}

	public void setIdDepense(Long idDepense) {
		this.idDepense = idDepense;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrixunit() {
		return prixunit;
	}

	public void setPrixunit(double prixunit) {
		this.prixunit = prixunit;
	}

	public Depense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depense(String type, int quantite, double prixunit) {
		super();
		this.type = type;
		this.quantite = quantite;
		this.prixunit = prixunit;
	}
	
	@ManyToOne
	private Depense bandeDepense;
	
	
}
