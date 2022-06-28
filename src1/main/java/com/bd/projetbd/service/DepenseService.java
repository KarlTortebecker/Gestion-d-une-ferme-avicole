package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Depense;



public interface DepenseService {
	Depense saveDepense(Depense dep) ;
//	void saveById(long idDocument);
	List<Depense> findAll();
	List<Depense> getByType(String type);
	void deleteByIdDepense(long idDepense) ;
//	 void removeBande(Bande bd) ;
	Depense getByIdDepense(long idDepense);
}
