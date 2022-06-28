package com.bd.projetbd.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.projetbd.entities.Client;
import com.bd.projetbd.repositories.ClientRepository;
import com.bd.projetbd.service.ClientService;
@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clRepo;
	
	public ClientServiceImpl(ClientRepository clRepo) {
		super();
		this.clRepo = clRepo;
	}

	@Override
	public Client saveClient(Client cl) {
		// TODO Auto-generated method stub
		return this.clRepo.save(cl);
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return this.clRepo.findAll();
	}

	@Override
	public List<Client> getByNomClient(String nomClient) {
		// TODO Auto-generated method stub
		return this.clRepo.getByNomClient(nomClient);
	}

	@Override
	public List<Client> getByPrenomClient(String prenomClient) {
		// TODO Auto-generated method stub
		return this.clRepo.getByPrenomClient(prenomClient);
	}

	@Override
	public void deleteById(long idClient) {
		// TODO Auto-generated method stub
          this.clRepo.deleteById(idClient);
	}

	@Override
	public Client getByIdClient(long idClient) {
		// TODO Auto-generated method stub
		return this.clRepo.getByIdClient(idClient);
	}

}
