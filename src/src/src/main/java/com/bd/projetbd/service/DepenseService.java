package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Depense;



public interface DepenseService {
	Depense saveDepense(Depense dep) ;
//	void saveById(long idDocument);
	List<Depense> findAll();
//	List<Document> chercherDocument(String titre, String type, String nomAuteur,String theme);
//	List<Document> getByTitle(String titre);
	List<Depense> getByType(String type);
	void deleteByIdDepense(long idDepense) ;
//	List<Document> getProcessedDocumentReservation();
//	 List<Document> convertIdDocumentToBook(Collection<Long> docIds);
//	 void removeCurrentUserOfMultipleDocs(List<Document> docs);
//	 void removeCurrentUserOfDocs(Document doc);
//	 void removeBande(Bande bd) ;
	Depense getByIdDepense(long idDepense);
}
