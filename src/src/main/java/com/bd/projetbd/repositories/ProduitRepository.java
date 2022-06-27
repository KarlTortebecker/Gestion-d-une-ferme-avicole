package com.bd.projetbd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bd.projetbd.entities.Produits;
@Repository
public interface ProduitRepository extends JpaRepository<Produits, Long> {
	List<Produits> getByTypeProduits(String typeProduits);
	public List<Produits> getByOrigine(String origine) ;
//	List<Document> getByType(String type);
//	 List<Document> getByTheme(String theme);
	Produits getByIdProduits(long idProduits);
}
