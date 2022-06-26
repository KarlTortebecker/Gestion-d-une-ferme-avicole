package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Employe;

public interface EmployeeService {
	Employe saveEmploye(Employe empl) ;
	List<Employe> findAll();
	List<Employe> getByNomEmploye(String nomEmploye);
	List<Employe> getByStatut(String statut);
	void deleteByIdEmploye(long idEmploye) ;
//	 void removeBande(Bande bd) ;
	Employe getByIdEmploye(long idEmploye);
	Employe getNomEmploye(String nomEmploye);
}
