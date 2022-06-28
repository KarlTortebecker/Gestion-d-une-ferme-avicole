package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Client;



public interface ClientService {
	Client saveClient(Client cl) ;
//	void saveById(long idDocument);
	List<Client> findAll();
//	List<Document> chercherDocument(String titre, String type, String nomAuteur,String theme);
//	List<Document> getByTitle(String titre);
//	List<Document> getByAuthor(String nomAuteur);
	List<Client> getByNomClient(String nomClient);
	List<Client> getByPrenomClient(String prenomClient);
	void deleteById(long idClient) ;
//	List<Document> getProcessedDocumentReservation();
//	 List<Document> convertIdDocumentToBook(Collection<Long> docIds);
//	 void removeCurrentUserOfMultipleDocs(List<Document> docs);
//	 void removeCurrentUserOfDocs(Document doc);
//	 void removeBande(Bande bd) ;
	Client getByIdClient(long idClient);
//	List<Document> getUnprocessedDocumentReservation();
//	List<Document> getByTitre(String titre);
//	List<Document> getByNomAuteur(String nomAuteur);
}
