package com.bd.projetbd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Partenaire {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPartenaire;
	
	private String nomPartenaire;
	private String prenomPartenaire;
	private int tel;
	private String email;
	private String typePartenaire;
	public Long getIdPartenaire() {
		return idPartenaire;
	}
	public void setIdPartenaire(Long idPartenaire) {
		this.idPartenaire = idPartenaire;
	}
	public String getNomPartenaire() {
		return nomPartenaire;
	}
	public void setNomPartenaire(String nomPartenaire) {
		this.nomPartenaire = nomPartenaire;
	}
	public String getPrenomPartenaire() {
		return prenomPartenaire;
	}
	public void setPrenomPartenaire(String prenomPartenaire) {
		this.prenomPartenaire = prenomPartenaire;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTypePartenaire() {
		return typePartenaire;
	}
	public void setTypePartenaire(String typePartenaire) {
		this.typePartenaire = typePartenaire;
	}
	public Partenaire(String nomPartenaire, String prenomPartenaire, int tel, String email, String typePartenaire) {
		super();
		this.nomPartenaire = nomPartenaire;
		this.prenomPartenaire = prenomPartenaire;
		this.tel = tel;
		this.email = email;
		this.typePartenaire = typePartenaire;
	}
	public Partenaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne
	private Employe employePart;
	public Employe getEmployePart() {
		return employePart;
	}
	public void setEmployePart(Employe employePart) {
		this.employePart = employePart;
	}
	
	
}
