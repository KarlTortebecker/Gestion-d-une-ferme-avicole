package com.bd.projetbd.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.projetbd.entities.Pertes;
import com.bd.projetbd.repositories.PerteRepository;
import com.bd.projetbd.service.PertesServices;
@Service
@Transactional
public class PertesServiceImpl implements PertesServices {
    @Autowired
    private PerteRepository pertRepo;
    
	public PertesServiceImpl(PerteRepository pertRepo) {
		super();
		this.pertRepo = pertRepo;
	}

	@Override
	public Pertes savePertes(Pertes pert) {
		// TODO Auto-generated method stub
		return this.pertRepo.save(pert);
	}

	@Override
	public List<Pertes> findAll() {
		// TODO Auto-generated method stub
		return this.pertRepo.findAll();
	}

	@Override
	public List<Pertes> getByOriginePerte(String originePerte) {
		// TODO Auto-generated method stub
		return this.pertRepo.getByOriginePerte(originePerte);
	}

	@Override
	public List<Pertes> getByTypePerte(String typePerte) {
		// TODO Auto-generated method stub
		return this.pertRepo.getByTypePerte(typePerte);
	}

	@Override
	public void deleteByIdPerte(long idPerte) {
		// TODO Auto-generated method stub
      this.pertRepo.deleteById(idPerte);
	}

	@Override
	public Pertes getByIdPerte(long idPerte) {
		// TODO Auto-generated method stub
		return this.pertRepo.getByIdPerte(idPerte);
	}

}
