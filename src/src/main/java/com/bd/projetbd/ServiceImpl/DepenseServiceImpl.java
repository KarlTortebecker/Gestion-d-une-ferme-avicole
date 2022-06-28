package com.bd.projetbd.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.projetbd.entities.Depense;
import com.bd.projetbd.repositories.DepenseRepository;
import com.bd.projetbd.service.DepenseService;
@Service
@Transactional
public class DepenseServiceImpl implements DepenseService {
   @Autowired
   private DepenseRepository depRepo;
   
   
	public DepenseServiceImpl(DepenseRepository depRepo) {
	super();
	this.depRepo = depRepo;
}

	@Override
	public Depense saveDepense(Depense dep) {
		// TODO Auto-generated method stub
		return this.depRepo.save(dep);
	}

	@Override
	public List<Depense> findAll() {
		// TODO Auto-generated method stub
		return this.depRepo.findAll();
	}

	@Override
	public List<Depense> getByType(String type) {
		// TODO Auto-generated method stub
		return this.depRepo.getByType(type);
	}

	@Override
	public void deleteByIdDepense(long idDepense) {
		// TODO Auto-generated method stub
         this.depRepo.deleteById(idDepense);
	}

	@Override
	public Depense getByIdDepense(long idDepense) {
		// TODO Auto-generated method stub
		return this.depRepo.getByIdDepense(idDepense);
	}

}
