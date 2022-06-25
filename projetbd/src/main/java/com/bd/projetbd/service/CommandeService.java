package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Commande;


public interface CommandeService {
	Commande saveCommande(Commande cmd) ;
//	void saveById(long idDocument);
	List<Commande> findAll();
//	List<Document> chercherDocument(String titre, String type, String nomAuteur,String theme);
//	List<Document> getByTitle(String titre);
	List<Commande> getByNomCmd(String nomCmd);
	List<Commande> getByNomClient(String nomClient);
	List<Commande> getByPrenomClient(String prenomClient);
	void deleteByIdCommande(long idCommande) ;
//	List<Document> getProcessedDocumentReservation();
//	 List<Document> convertIdDocumentToBook(Collection<Long> docIds);
//	 void removeCurrentUserOfMultipleDocs(List<Document> docs);
//	 void removeCurrentUserOfDocs(Document doc);
//	 void removeBande(Bande bd) ;
	Commande getByIdCommande(long idCommande);
}
