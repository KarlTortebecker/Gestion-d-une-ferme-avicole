package com.bd.projetbd.ServiceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.projetbd.entities.Info;
import com.bd.projetbd.repositories.InfoRepository;
import com.bd.projetbd.service.InfoService;
@Service
@Transactional
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoRepository infoRepo;
    
	public InfoServiceImpl(InfoRepository infoRepo) {
		super();
		this.infoRepo = infoRepo;
	}

	@Override
	public Info saveInfo(Info info) {
		// TODO Auto-generated method stub
		return this.infoRepo.save(info);
	}

	@Override
	public List<Info> findAll() {
		// TODO Auto-generated method stub
		return this.infoRepo.findAll();
	}

	@Override
	public List<Info> getByDateDeces(LocalDate dateDeces) {
		// TODO Auto-generated method stub
		return this.infoRepo.getByDateDeces(dateDeces);
	}

	@Override
	public void deleteByIdInfo(long idInfo) {
		// TODO Auto-generated method stub
       this.infoRepo.deleteById(idInfo);
	}

	@Override
	public Info getByIdInfo(long idInfo) {
		// TODO Auto-generated method stub
		return this.infoRepo.getByIdInfo(idInfo);
	}

	@Override
	public Info getDateDeces(LocalDate dateDeces) {
		// TODO Auto-generated method stub
		return this.infoRepo.findByDateDeces(dateDeces);
	}

}
