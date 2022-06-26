package com.bd.projetbd.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.projetbd.entities.Partenaire;
import com.bd.projetbd.repositories.PartenaireRepository;
import com.bd.projetbd.service.PartenaireService;
@Service
@Transactional
public class PartenaireServiceImpl implements PartenaireService {
    @Autowired
    private PartenaireRepository partRepo;
    
	public PartenaireServiceImpl(PartenaireRepository partRepo) {
		super();
		this.partRepo = partRepo;
	}

	@Override
	public Partenaire savePartenaire(Partenaire part) {
		// TODO Auto-generated method stub
		return this.partRepo.save(part);
	}

	@Override
	public List<Partenaire> findAll() {
		// TODO Auto-generated method stub
		return this.partRepo.findAll();
	}

	@Override
	public List<Partenaire> getByNomPartenaire(String nomPartenaire) {
		// TODO Auto-generated method stub
		return this.partRepo.getByNomPartenaire(nomPartenaire);
	}

	@Override
	public void deleteByIdPartenaire(long idPartenaire) {
		// TODO Auto-generated method stub
       this.partRepo.deleteById(idPartenaire);
	}

	@Override
	public Partenaire getByIdPartenaire(long idPartenaire) {
		// TODO Auto-generated method stub
		return this.partRepo.getByIdPartenaire(idPartenaire);
	}

	@Override
	public Partenaire getNomPartenaire(String nomPartenaire) {
		// TODO Auto-generated method stub
		return this.partRepo.findByNomPartenaire(nomPartenaire);
	}

}
