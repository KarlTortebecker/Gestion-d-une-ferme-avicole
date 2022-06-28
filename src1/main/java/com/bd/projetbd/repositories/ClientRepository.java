package com.bd.projetbd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.projetbd.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	List<Client> getByNomClient(String nomClient);
	public List<Client> getByPrenomClient(String prenomClient) ;
//	List<Document> getByType(String type);
//	 List<Document> getByTheme(String theme);
	Client getByIdClient(long idClient);
}
