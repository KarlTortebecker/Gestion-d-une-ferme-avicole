package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Pertes;



public interface PertesServices {
	Pertes savePertes(Pertes pert) ;
//	void saveById(long idDocument);
	List<Pertes> findAll();
//	List<Document> chercherDocument(String titre, String type, String nomAuteur,String theme);
	List<Pertes> getByOriginePerte(String originePerte);
	List<Pertes> getByTypePerte(String typePerte);
	void deleteByIdPerte(long idPerte) ;
//	List<Document> getProcessedDocumentReservation();
//	 List<Document> convertIdDocumentToBook(Collection<Long> docIds);
//	 void removeCurrentUserOfMultipleDocs(List<Document> docs);
//	 void removeCurrentUserOfDocs(Document doc);
//	 void removeBande(Bande bd) ;
	Pertes getByIdPerte(long idPerte);
	
}
