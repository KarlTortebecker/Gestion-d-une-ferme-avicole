package com.bd.projetbd;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bd.projetbd.ServiceImpl.BandeServiceImpl;
import com.bd.projetbd.ServiceImpl.ClientServiceImpl;
import com.bd.projetbd.ServiceImpl.CommandeServiceImpl;
import com.bd.projetbd.ServiceImpl.DepenseServiceImpl;
import com.bd.projetbd.ServiceImpl.EmployeeServiceImpl;
import com.bd.projetbd.ServiceImpl.InfoServiceImpl;
import com.bd.projetbd.ServiceImpl.PartenaireServiceImpl;
import com.bd.projetbd.ServiceImpl.PertesServiceImpl;
import com.bd.projetbd.ServiceImpl.ProduitsServicesImpl;
import com.bd.projetbd.entities.Client;
import com.bd.projetbd.entities.Employe;
import com.bd.projetbd.entities.Partenaire;
import com.bd.projetbd.entities.Produits;



@SpringBootApplication
public class ProjetbdApplication implements CommandLineRunner{
	@Autowired
	private EmployeeServiceImpl client;
	@Autowired
	private PartenaireServiceImpl prtService;
	@Autowired
	private BandeServiceImpl bandeService;
	@Autowired
	private InfoServiceImpl infoService;
	@Autowired
	private ClientServiceImpl clientService;
	@Autowired
	private ProduitsServicesImpl prodService;
	@Autowired
	private PertesServiceImpl perteService;
	@Autowired
	private DepenseServiceImpl depenseService;
	@Autowired
	private CommandeServiceImpl cmdService;
	public static void main(String[] args) {
		SpringApplication.run(ProjetbdApplication.class, args);
	}

@Override
//@Transactional
public void run(String... args) throws Exception {
	Employe e=new Employe();
	e.setNomEmploye("Doria");
	e.setPrenomEmploye("Love");
	e.setStatut("fermiere");
	e.setTel(696814793);
	Employe m= new Employe();
	m.setNomEmploye("Djeunang");
	m.setPrenomEmploye("Amanda");
	m.setStatut("fermiere");
	m.setTel(695748870);
	client.saveEmploye(m);
	client.saveEmploye(e);
	Partenaire p = new Partenaire();
	p.setEmail("juliaenyegua@gmail.com");
	p.setNomPartenaire("Tchoumi");
	p.setPrenomPartenaire("Karlin");
	p.setTel(656302780);
	p.setTypePartenaire("fournisseur provande");
	p.setEmployePart(m);
	Partenaire a= new Partenaire();
	a.setEmail("eojldottou@gmail.com");
	a.setEmployePart(m);
	a.setNomPartenaire("Garba");
	a.setPrenomPartenaire("Vicky");
	a.setTypePartenaire("banquiere");
	a.setTel(656779697);
	Client c= new Client();
	c.setEmail("azanguewill@gmail.com");
	c.setNomClient("Azangue");
	c.setPrenomClient("William");
	c.setTel(681281467);
	clientService.saveClient(c);
	Produits o= new Produits();
	o.setDate(LocalDate.now());
	o.setOrigine("ferme 1");
	o.setPrixProduit(75);
	o.setTypeProduits("volaille");
	o.setQuantite(100);
	prodService.saveProduits(o);
	prtService.savePartenaire(a);
	prtService.savePartenaire(p);
	m.setPartEmploye(Arrays.asList(p));
	m.setPartEmploye(Arrays.asList(a));
}
}
