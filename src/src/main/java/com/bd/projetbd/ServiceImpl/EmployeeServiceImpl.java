package com.bd.projetbd.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.projetbd.entities.Employe;
import com.bd.projetbd.repositories.EmployeeRepository;
import com.bd.projetbd.service.EmployeeService;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository emplRepo;
    
	public EmployeeServiceImpl(EmployeeRepository emplRepo) {
		super();
		this.emplRepo = emplRepo;
	}

	@Override
	public Employe saveEmploye(Employe empl) {
		// TODO Auto-generated method stub
		return this.emplRepo.save(empl);
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return this.emplRepo.findAll();
	}

	@Override
	public List<Employe> getByNomEmploye(String nomEmploye) {
		// TODO Auto-generated method stub
		return this.emplRepo.getByNomEmploye(nomEmploye);
	}

	@Override
	public List<Employe> getByStatut(String statut) {
		// TODO Auto-generated method stub
		return this.emplRepo.getByStatut(statut);
	}

	@Override
	public void deleteByIdEmploye(long idEmploye) {
		// TODO Auto-generated method stub
        this.emplRepo.deleteById(idEmploye);
	}

	@Override
	public Employe getByIdEmploye(long idEmploye) {
		// TODO Auto-generated method stub
		return this.emplRepo.getByIdEmploye(idEmploye);
	}

	@Override
	public Employe getNomEmploye(String nomEmploye) {
		// TODO Auto-generated method stub
		return this.emplRepo.findByNomEmploye(nomEmploye);
	}

}
