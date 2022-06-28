package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Partenaire;


public interface PartenaireService {
	Partenaire savePartenaire(Partenaire part) ;
//	void saveById(long idDocument);
	List<Partenaire> findAll();
//	List<Document> chercherDocument(String titre, String type, String nomAuteur,String theme);
	List<Partenaire> getByNomPartenaire(String nomPartenaire);
//	List<Employe> getByStatut(String statut);
	void deleteByIdPartenaire(long idPartenaire) ;
//	List<Document> getProcessedDocumentReservation();
//	 List<Document> convertIdDocumentToBook(Collection<Long> docIds);
//	 void removeCurrentUserOfMultipleDocs(List<Document> docs);
//	 void removeCurrentUserOfDocs(Document doc);
//	 void removeBande(Bande bd) ;
	Partenaire getByIdPartenaire(long idPartenaire);
	Partenaire getNomPartenaire(String nomPartenaire);
}
