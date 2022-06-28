package com.bd.projetbd.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.projetbd.entities.Bande;
import com.bd.projetbd.repositories.BandeRepository;
import com.bd.projetbd.service.BandeService;
@Service
@Transactional
public class BandeServiceImpl implements BandeService {

	@Autowired
	private BandeRepository bdRepo;
	
	public BandeServiceImpl(BandeRepository bdRepo) {
		super();
		this.bdRepo = bdRepo;
	}

	@Override
	public Bande saveBande(Bande bd) {
		// TODO Auto-generated method stub
		return this.bdRepo.save(bd);
	}

	@Override
	public List<Bande> findAll() {
		// TODO Auto-generated method stub
		return this.bdRepo.findAll();
	}

	@Override
	public List<Bande> getByOrigine(String origine) {
		// TODO Auto-generated method stub
		return this.bdRepo.getByOrigine(origine);
	}

	@Override
	public List<Bande> getByTypePerte(String typePerte) {
		// TODO Auto-generated method stub
		return this.bdRepo.getByTypePerte(typePerte);
	}

	@Override
	public void deleteById(long idBande) {
		// TODO Auto-generated method stub
         bdRepo.deleteById(idBande);
	}

//	@Override
//	public void removeBande(Bande bd) {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public Bande getByIdBande(long idBande) {
		// TODO Auto-generated method stub
		return this.bdRepo.getByIdBande(idBande);
	}

}
