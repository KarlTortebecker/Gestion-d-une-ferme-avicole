package com.bd.projetbd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.projetbd.entities.Depense;
@Repository
public interface DepenseRepository extends JpaRepository<Depense,Long>{
	List<Depense> getByType(String type);
	
//	List<Document> getByType(String type);
//	 List<Document> getByTheme(String theme);
	Depense getByIdDepense(long idDepense);
}
