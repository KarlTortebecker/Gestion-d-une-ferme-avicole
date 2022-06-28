package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Client;



public interface ClientService {
	Client saveClient(Client cl) ;
	List<Client> findAll();
	List<Client> getByNomClient(String nomClient);
	List<Client> getByPrenomClient(String prenomClient);
	void deleteById(long idClient) ;
//	 void removeBande(Bande bd) ;
	Client getByIdClient(long idClient);
}
