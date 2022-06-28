package com.bd.projetbd.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bd.projetbd.entities.Info;
@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {
	List<Info> getByDateDeces(LocalDate dateDeces);
//	 List<Document> getByTheme(String theme);
	Info findByDateDeces(LocalDate dateDeces );
	Info getByIdInfo(long idInfo);
}
