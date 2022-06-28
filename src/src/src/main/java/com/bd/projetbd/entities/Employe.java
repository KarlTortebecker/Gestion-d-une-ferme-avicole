package com.bd.projetbd.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmploye;
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String nomEmploye, String prenomEmploye,String password, int tel, String statut) {
		super();
		this.nomEmploye = nomEmploye;
		this.prenomEmploye = prenomEmploye;
		this.tel = tel;
		this.password=password;
		this.statut = statut;
	}
	public Long getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public String getPrenomEmploye() {
		return prenomEmploye;
	}
	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	private String nomEmploye;
	private String prenomEmploye;
	private int tel;
	private String statut;
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@OneToMany(mappedBy="employeInfo")
	private List<Info> infoEmploye;
	@OneToMany(mappedBy="employeBande")
	private List<Bande> bandeEmploye;
	
	@OneToMany(mappedBy="employePart")
	private List<Partenaire> partEmploye;

	public List<Info> getInfoEmploye() {
		return infoEmploye;
	}
	public void setInfoEmploye(List<Info> infoEmploye) {
		this.infoEmploye = infoEmploye;
	}
	public List<Bande> getBandeEmploye() {
		return bandeEmploye;
	}
	public void setBandeEmploye(List<Bande> bandeEmploye) {
		this.bandeEmploye = bandeEmploye;
	}
	public List<Partenaire> getPartEmploye() {
		return partEmploye;
	}
	public void setPartEmploye(List<Partenaire> partEmploye) {
		this.partEmploye = partEmploye;
	}
	
}
