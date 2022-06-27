package com.bd.projetbd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bd.projetbd.entities.Pertes;
@Repository
public interface PerteRepository extends JpaRepository<Pertes, Long> {
	List<Pertes> getByTypePerte(String typePerte);
	public List<Pertes> getByOriginePerte(String originePerte) ;
//	List<Document> getByType(String type);
//	 List<Document> getByTheme(String theme);
	Pertes getByIdPerte(long idPerte);
	
}
