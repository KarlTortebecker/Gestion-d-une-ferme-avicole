package com.bd.projetbd.service;

import java.util.List;

import com.bd.projetbd.entities.Pertes;



public interface PertesServices {
	Pertes savePertes(Pertes pert) ;
	List<Pertes> findAll();
	List<Pertes> getByOriginePerte(String originePerte);
	List<Pertes> getByTypePerte(String typePerte);
	void deleteByIdPerte(long idPerte) ;
//	 void removeBande(Bande bd) ;
	Pertes getByIdPerte(long idPerte);
	
}
