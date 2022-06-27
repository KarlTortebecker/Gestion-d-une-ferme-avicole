package com.bd.projetbd.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	
	private String nomClient;
	private String prenomClient;
	 private int tel;
	 private String email;
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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
	public Client(String nomClient, String prenomClient, int tel, String email) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.tel = tel;
		this.email = email;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

	
	@OneToMany(mappedBy="clientCmd")
	private List<Commande> cmdClient;
	
}
