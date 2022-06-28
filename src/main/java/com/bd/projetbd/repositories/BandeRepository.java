package com.bd.projetbd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.projetbd.entities.Bande;

@Repository
public interface BandeRepository extends JpaRepository<Bande, Long> {
	List<Bande> getByOrigine(String origine);
	public List<Bande> getByTypePerte(String typePerte) ;
//	List<Document> getByType(String type);
//	 List<Document> getByTheme(String theme);
	Bande getByIdBande(long idBande);
}
