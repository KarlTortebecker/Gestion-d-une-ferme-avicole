package com.bd.projetbd.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Info {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idInfo;
	
	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Info(int nbreDeces, int nbreProduit, LocalDate dateDeces) {
		super();
		this.nbreDeces = nbreDeces;
		this.nbreProduit = nbreProduit;
		this.dateDeces = dateDeces;
	}
	private int nbreDeces;
	private int nbreProduit;
	private LocalDate dateDeces;
	public Long getIdInfo() {
		return idInfo;
	}
	public void setIdInfo(Long idInfo) {
		this.idInfo = idInfo;
	}
	public int getNbreDeces() {
		return nbreDeces;
	}
	public void setNbreDeces(int nbreDeces) {
		this.nbreDeces = nbreDeces;
	}
	public int getNbreProduit() {
		return nbreProduit;
	}
	public void setNbreProduit(int nbreProduit) {
		this.nbreProduit = nbreProduit;
	}
	public LocalDate getDateDeces() {
		return dateDeces;
	}
	public void setDateDeces(LocalDate dateDeces) {
		this.dateDeces = dateDeces;
	}
	
	@ManyToOne
	private Employe employeInfo;
}
