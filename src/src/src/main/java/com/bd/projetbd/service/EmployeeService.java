package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Employe;

public interface EmployeeService {
	Employe saveEmploye(Employe empl) ;
//	void saveById(long idDocument);
	List<Employe> findAll();
//	List<Document> chercherDocument(String titre, String type, String nomAuteur,String theme);
	List<Employe> getByNomEmploye(String nomEmploye);
	List<Employe> getByStatut(String statut);
	void deleteByIdEmploye(long idEmploye) ;
//	List<Document> getProcessedDocumentReservation();
//	 List<Document> convertIdDocumentToBook(Collection<Long> docIds);
//	 void removeCurrentUserOfMultipleDocs(List<Document> docs);
//	 void removeCurrentUserOfDocs(Document doc);
//	 void removeBande(Bande bd) ;
	Employe getByIdEmploye(long idEmploye);
	Employe getNomEmploye(String nomEmploye);
}
