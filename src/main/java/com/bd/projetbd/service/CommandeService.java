package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Commande;


public interface CommandeService {
	Commande saveCommande(Commande cmd) ;
//	void saveById(long idDocument);
	List<Commande> findAll();
	List<Commande> getByNomCmd(String nomCmd);
	List<Commande> getByNomClient(String nomClient);
	List<Commande> getByPrenomClient(String prenomClient);
	void deleteByIdCommande(long idCommande) ;
//	 void removeBande(Bande bd) ;
	Commande getByIdCommande(long idCommande);
}
