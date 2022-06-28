package com.bd.projetbd.service;

import java.time.LocalDate;
import java.util.List;

import com.bd.projetbd.entities.Info;


public interface InfoService {
	Info saveInfo(Info info) ;
	List<Info> findAll();
	List<Info> getByDateDeces(LocalDate dateDeces);
	void deleteByIdInfo(long idInfo) ;
//	 void removeBande(Bande bd) ;
	Info getByIdInfo(long idInfo);
	Info getDateDeces(LocalDate dateDeces);
}
