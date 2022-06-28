package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Produits;


public interface ProduitService {
	Produits saveProduits(Produits prod) ;
//	void saveById(long idDocument);
	List<Produits> findAll();
	List<Produits> getByOrigineProduits(String origine);
	List<Produits> getByTypeProduits(String typeProduits);
	void deleteByIdProduits(long idProduits) ;
//	 void removeBande(Bande bd) ;
	Produits getByIdProduits(long idProduits);
}
