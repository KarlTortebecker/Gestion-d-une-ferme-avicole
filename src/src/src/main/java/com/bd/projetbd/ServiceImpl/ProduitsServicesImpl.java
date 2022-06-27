package com.bd.projetbd.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.projetbd.entities.Produits;
import com.bd.projetbd.repositories.ProduitRepository;
import com.bd.projetbd.service.ProduitService;
@Service
@Transactional
public class ProduitsServicesImpl implements ProduitService {
     @Autowired
     private ProduitRepository proRepo;
     
	public ProduitsServicesImpl(ProduitRepository proRepo) {
		super();
		this.proRepo = proRepo;
	}

	@Override
	public Produits saveProduits(Produits prod) {
		// TODO Auto-generated method stub
		return this.proRepo.save(prod);
	}

	@Override
	public List<Produits> findAll() {
		// TODO Auto-generated method stub
		return this.proRepo.findAll();
	}

	@Override
	public List<Produits> getByOrigineProduits(String origine) {
		// TODO Auto-generated method stub
		return this.proRepo.getByOrigine(origine);
	}

	@Override
	public List<Produits> getByTypeProduits(String typeProduits) {
		// TODO Auto-generated method stub
		return this.proRepo.getByTypeProduits(typeProduits);
	}

	@Override
	public void deleteByIdProduits(long idProduits) {
		// TODO Auto-generated method stub
		this.proRepo.deleteById(idProduits);

	}

	@Override
	public Produits getByIdProduits(long idProduits) {
		// TODO Auto-generated method stub
		return this.proRepo.getByIdProduits(idProduits);
	}

}
