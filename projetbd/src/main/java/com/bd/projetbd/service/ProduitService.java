package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Produits;


public interface ProduitService {
	Produits saveProduits(Produits prod) ;
//	void saveById(long idDocument);
	List<Produits> findAll();
//	List<Document> chercherDocument(String titre, String type, String nomAuteur,String theme);
	List<Produits> getByOrigineProduits(String origine);
	List<Produits> getByTypeProduits(String typeProduits);
	void deleteByIdProduits(long idProduits) ;
//	List<Document> getProcessedDocumentReservation();
//	 List<Document> convertIdDocumentToBook(Collection<Long> docIds);
//	 void removeCurrentUserOfMultipleDocs(List<Document> docs);
//	 void removeCurrentUserOfDocs(Document doc);
//	 void removeBande(Bande bd) ;
	Produits getByIdProduits(long idProduits);
//	Produits getOrigine(String origine);
//	Produits getTypeProduits(String )
}
