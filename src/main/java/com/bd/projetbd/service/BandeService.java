package com.bd.projetbd.service;

import com.bd.projetbd.entities.Bande;

import java.util.List;


public interface BandeService {
	Bande saveBande(Bande bd) ;
	List<Bande> findAll();
	List<Bande> getByOrigine(String origine);
	List<Bande> getByTypePerte(String typePerte);
	void deleteById(long idBande) ;
	 Bande getByIdBande(long idBande);
}
