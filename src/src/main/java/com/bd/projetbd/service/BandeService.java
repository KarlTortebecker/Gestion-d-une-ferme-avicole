package com.bd.projetbd.service;

import java.util.Collection;
import java.util.List;

import com.bd.projetbd.entities.Bande;



public interface BandeService {
	Bande saveBande(Bande bd) ;
//	void saveById(long idDocument);
	List<Bande> findAll();
//	List<Document> chercherDocument(String titre, String type, String nomAuteur,String theme);
//	List<Document> getByTitle(String titre);
//	List<Document> getByAuthor(String nomAuteur);
	List<Bande> getByOrigine(String origine);
	List<Bande> getByNomBande(String nomBande);
	void deleteById(long idBande) ;
//	List<Document> getProcessedDocumentReservation();
//	 List<Document> convertIdDocumentToBook(Collection<Long> docIds);
//	 void removeCurrentUserOfMultipleDocs(List<Document> docs);
//	 void removeCurrentUserOfDocs(Document doc);
//	 void removeBande(Bande bd) ;
	 Bande getByIdBande(long idBande);
	 Bande getNomBande(String nomBande);
//	List<Document> getUnprocessedDocumentReservation();
//	List<Document> getByTitre(String titre);
//	List<Document> getByNomAuteur(String nomAuteur);
}
