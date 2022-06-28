package com.bd.projetbd.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.projetbd.entities.Commande;
import com.bd.projetbd.repositories.CommandeRepository;
import com.bd.projetbd.service.CommandeService;
@Service
@Transactional
public class CommandeServiceImpl implements CommandeService {
@Autowired
private CommandeRepository cmdRepo;

	public CommandeServiceImpl(CommandeRepository cmdRepo) {
	super();
	this.cmdRepo = cmdRepo;
}

	@Override
	public Commande saveCommande(Commande cmd) {
		// TODO Auto-generated method stub
		return this.cmdRepo.save(cmd);
	}

	@Override
	public List<Commande> findAll() {
		// TODO Auto-generated method stub
		return this.cmdRepo.findAll();
	}

	@Override
	public List<Commande> getByNomCmd(String nomCmd) {
		// TODO Auto-generated method stub
		return this.cmdRepo.getByNomCmd(nomCmd);
	}

	@Override
	public List<Commande> getByNomClient(String nomClient) {
		// TODO Auto-generated method stub
		return this.cmdRepo.getByNomClient(nomClient);
	}

	@Override
	public List<Commande> getByPrenomClient(String prenomClient) {
		// TODO Auto-generated method stub
		return this.cmdRepo.getByPrenomClient(prenomClient);
	}

	@Override
	public void deleteByIdCommande(long idCommande) {
		// TODO Auto-generated method stub
this.cmdRepo.deleteById(idCommande);
	}

	@Override
	public Commande getByIdCommande(long idCommande) {
		// TODO Auto-generated method stub
		return this.cmdRepo.getByIdCommande(idCommande);
	}

}
