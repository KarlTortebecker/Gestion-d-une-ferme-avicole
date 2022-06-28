package com.bd.projetbd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bd.projetbd.entities.Partenaire;
@Repository
public interface PartenaireRepository extends JpaRepository<Partenaire, Long> {
	List<Partenaire> getByNomPartenaire(String nomPartenaire);
	public List<Partenaire> getByPrenomPartenaire(String prenomPartenaire) ;
//	List<Document> getByType(String type);
//	 List<Document> getByTheme(String theme);
	Partenaire getByIdPartenaire(long idClient);
	Partenaire findByNomPartenaire(String nomPartenaire);
}
