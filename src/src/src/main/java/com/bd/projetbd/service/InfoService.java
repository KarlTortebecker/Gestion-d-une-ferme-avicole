package com.bd.projetbd.service;

import java.time.LocalDate;
import java.util.List;

import com.bd.projetbd.entities.Info;


public interface InfoService {
	Info saveInfo(Info info) ;
//	void saveById(long idDocument);
	List<Info> findAll();
//	List<Document> chercherDocument(String titre, String type, String nomAuteur,String theme);
	List<Info> getByDateDeces(LocalDate dateDeces);
	void deleteByIdInfo(long idInfo) ;
//	List<Document> getProcessedDocumentReservation();
//	 List<Document> convertIdDocumentToBook(Collection<Long> docIds);
//	 void removeCurrentUserOfMultipleDocs(List<Document> docs);
//	 void removeCurrentUserOfDocs(Document doc);
//	 void removeBande(Bande bd) ;
	Info getByIdInfo(long idInfo);
	Info getDateDeces(LocalDate dateDeces);
}
