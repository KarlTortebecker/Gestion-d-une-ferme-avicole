package com.bd.projetbd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bd.projetbd.entities.Commande;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
	List<Commande> getByNomCmd(String nomCmd);
	public List<Commande> getByPrenomClient(String prenomClient) ;
	List<Commande> getByNomClient(String nomClient);
//	List<Document> getByType(String type);
//	 List<Document> getByTheme(String theme);
	Commande getByIdCommande(long idCommande);
}
