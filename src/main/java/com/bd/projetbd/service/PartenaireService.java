package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Partenaire;


public interface PartenaireService {
	Partenaire savePartenaire(Partenaire part) ;
//	void saveById(long idDocument);
	List<Partenaire> findAll();
	List<Partenaire> getByNomPartenaire(String nomPartenaire);
	void deleteByIdPartenaire(long idPartenaire) ;
//	 void removeBande(Bande bd) ;
	Partenaire getByIdPartenaire(long idPartenaire);
	Partenaire getNomPartenaire(String nomPartenaire);
}
