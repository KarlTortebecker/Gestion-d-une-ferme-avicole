package com.bd.projetbd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.projetbd.entities.Employe;
@Repository
public interface EmployeeRepository extends JpaRepository<Employe, Long> {
	List<Employe> getByNomEmploye(String nomEmploye);
	public List<Employe> getByPrenomEmploye(String prenomEmploye) ;
	List<Employe> getByStatut(String statut);
//	 List<Document> getByTheme(String theme);
	Employe getByIdEmploye(long idEmploye);
	Employe findByNomEmploye(String nomEmploye);
}
