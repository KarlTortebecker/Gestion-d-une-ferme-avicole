package com.bd.projetbd.controllers;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bd.projetbd.ServiceImpl.BandeServiceImpl;
import com.bd.projetbd.ServiceImpl.ClientServiceImpl;
import com.bd.projetbd.ServiceImpl.CommandeServiceImpl;
import com.bd.projetbd.ServiceImpl.DepenseServiceImpl;
import com.bd.projetbd.ServiceImpl.EmployeeServiceImpl;
import com.bd.projetbd.ServiceImpl.InfoServiceImpl;
import com.bd.projetbd.ServiceImpl.PartenaireServiceImpl;
import com.bd.projetbd.ServiceImpl.PertesServiceImpl;
import com.bd.projetbd.ServiceImpl.ProduitsServicesImpl;
import com.bd.projetbd.entities.Bande;
import com.bd.projetbd.entities.Client;
import com.bd.projetbd.entities.Commande;
import com.bd.projetbd.entities.Depense;
import com.bd.projetbd.entities.Employe;
import com.bd.projetbd.entities.Info;
import com.bd.projetbd.entities.Partenaire;
import com.bd.projetbd.entities.Pertes;
import com.bd.projetbd.entities.Produits;
@RestController
@RequestMapping(value="/admin")
public class AdminController {
	private EmployeeServiceImpl emplService;
	
	private PartenaireServiceImpl partService;
	private BandeServiceImpl bandeService;
	private InfoServiceImpl infoService;
	private ClientServiceImpl clientService;
	private ProduitsServicesImpl prodService;
	private PertesServiceImpl perteService;
	private DepenseServiceImpl depenseService;
	private CommandeServiceImpl cmdService;
	
	public AdminController(EmployeeServiceImpl emplService, PartenaireServiceImpl partService,
			BandeServiceImpl bandeService, InfoServiceImpl infoService, ClientServiceImpl clientService,
			ProduitsServicesImpl prodService, PertesServiceImpl perteService, DepenseServiceImpl depenseService,
			CommandeServiceImpl cmdService) {
		super();
		this.emplService = emplService;
		this.partService = partService;
		this.bandeService = bandeService;
		this.infoService = infoService;
		this.clientService = clientService;
		this.prodService = prodService;
		this.perteService = perteService;
		this.depenseService = depenseService;
		this.cmdService = cmdService;
	}
	@GetMapping(value="/login")
	public String personnelHome() {
	 return "login";
 }
	@GetMapping(value="/register")
	public String register(Model model) {
		Employe emp= new Employe();
		model.addAttribute("newAccount",emp);
		return "register";
	}
	@PostMapping(value="register/save")
	public String saveNewAccount(@ModelAttribute("employe") Employe employe) {
//	     employe.setPassword(password);
		emplService.saveEmploye(employe);

		return "redirect:/login";
	}

	@GetMapping(value="/bandes/new")
	public String bande(Model model) {
		Bande emp= new Bande();
		model.addAttribute("newBande",emp);
		return "newbandePage";//pour l'ajout d'une info, les return ayant new sont pour la page d'ajout d'une entite
	}
	@PostMapping(value="bandes/post")
	public String infoPertes(@ModelAttribute("bande")Bande bande) {
		bandeService.saveBande(bande);
		return "redirect:/bandePage";
	}
	@DeleteMapping(value="/bandes/delete/{id}")
	public String deleteBande(@PathVariable(name="id") long id) {
		bandeService.deleteById(id);
		return"redirect:/bandePage";}
	@DeleteMapping(value="/pertes/delete/{id}")
	public String deletePerte(@PathVariable(name="id") long id) {
		perteService.deleteByIdPerte(id);
		return "redirect:/pertePage";
	}

	@GetMapping("/pertes/editPertes/{id}")
	public String editPerte(@PathVariable long id,Model model) {
		model.addAttribute("perte",perteService.getByIdPerte(id));
		return "editPertes";
	}
	@GetMapping("/infos/editInfos/{id}")
	public String editInfo(@PathVariable long id,Model model) {
		model.addAttribute("info",infoService.getByIdInfo(id));
		return "editInfo";
	}
	@GetMapping("/depenses/editDepenses/{id}")
	public String editDepense(@PathVariable long id,Model model) {
		model.addAttribute("depense",depenseService.getByIdDepense(id));
		return "editDepense";
	}
	@GetMapping(value="/bandePage")
	public String bande() {
		return "bandePage";
	}
	@GetMapping(value="/productsPage")
	public String prodPage(Model model) {
		model.addAttribute("productsPage",prodService.findAll());
		return "productPage";
	}
	@GetMapping(value="/infoPage")
	public String infoPage(Model model) {
		model.addAttribute("infoPage",infoService.findAll());
		return "infoPage";
	}
	@GetMapping(value="/pertesPage")
	public String pertePage(Model model) {
		model.addAttribute("pertesPage",perteService.findAll());;
		return "pertePage";
	}
	@GetMapping(value="/depensePage")
	public String depensePage(Model model) {
		model.addAttribute("depensePage",depenseService.findAll());;
		return "depensePage";
	}
	@GetMapping("/bandes/editBandes/{id}")
	public String editbandes(@PathVariable long id,Model model) {
		model.addAttribute("bande",bandeService.getByIdBande(id));
		return "editProducts";
	}
	@PostMapping("/editInfo/{id}")
	public String modifyInfo(@PathVariable long id,Model model,@ModelAttribute("info") Info info) {
		Info existInfo= infoService.getByIdInfo(id);
		existInfo.setIdInfo(id);
		existInfo.setDateDeces(existInfo.getDateDeces());
		existInfo.setNbreDeces(existInfo.getNbreDeces());
		existInfo.setNbreProduit(existInfo.getNbreProduit());
		infoService.saveInfo(existInfo);
		return "redirect:/infoPage";		
	}
	@PostMapping("/editBande/{id}")
	public String modifyBande(@PathVariable long id,Model model,@ModelAttribute("bande") Bande bande) {
		Bande existBande= bandeService.getByIdBande(id);
		existBande.setIdBande(id);
		existBande.setNomBande(existBande.getNomBande());
//		existBande.setEmployeBande(existBande.getEmployeBande());
		existBande.setOrigine(existBande.getOrigine());
		existBande.setQuantite(existBande.getQuantite());
		bandeService.saveBande(existBande);
		return "redirect:/pageBande";		
	}
	@PostMapping("/editDepense/{id}")
	public String modifyDepense(@PathVariable long id,Model model,@ModelAttribute("depense") Depense depense) {
		Depense existDepense= depenseService.getByIdDepense(id);
		existDepense.setIdDepense(id);
		existDepense.setDate(existDepense.getDate());
//		existBande.setEmployeBande(existBande.getEmployeBande());
		existDepense.setPrixunit(existDepense.getPrixunit());
		existDepense.setQuantite(existDepense.getQuantite());
		existDepense.setType(existDepense.getType());
		depenseService.saveDepense(existDepense);
		return "redirect:/depensePage";		
	}
	@PostMapping("/editPertes/{id}")
	public String modifyPertes(@PathVariable long id,Model model,@ModelAttribute("perte") Pertes perte) {
		Pertes existPertes= perteService.getByIdPerte(id);
		existPertes.setIdPerte(id);
		existPertes.setDate(existPertes.getDate());
//		existBande.setEmployeBande(existBande.getEmployeBande());
		existPertes.setOriginePerte(existPertes.getOriginePerte());
		existPertes.setQuantite(existPertes.getQuantite());
		existPertes.setTypePerte(existPertes.getTypePerte());
		perteService.savePertes(existPertes);
		return "redirect:/pertePage";		
	}
	@GetMapping(value="/infoemploye")
	public String infoEmploye(@RequestParam (required = false) String firstName,
									
									Model model) {
		Employe users = emplService.getNomEmploye(firstName);
		
		model.addAttribute("users", users);
		model.addAttribute("firstName", firstName);
		return "employeePage";
	}
	@GetMapping(value="/allemploye")
	public String allEmployees(
									Model model) {
		List<Employe> users = emplService.findAll();
		
		model.addAttribute("users", users);
		return "employeesPage";
	}
	@GetMapping(value="/allpartenaire")
	public String allPartenaires(
									Model model) {
		List<Partenaire> users = partService.findAll();
		
		model.addAttribute("users", users);
		return "partenairesPage";
	}
	@GetMapping(value="/infopatenaire")
	public String infoPartenaire(@RequestParam (required = false) String firstName,
									
									Model model) {
		Partenaire users = partService.getNomPartenaire(firstName);
		
		model.addAttribute("users", users);
		model.addAttribute("firstName", firstName);
		return "partenairesPage";
	}
	@GetMapping(value="/infobande")
	public String infoBande(@RequestParam (required = false) String nomBande,
									
									Model model) {
		Bande bande= bandeService.getNomBande(nomBande);
		
		model.addAttribute(" bande", bande);
		model.addAttribute("nomBande", nomBande);
		return "bandePage";
	}
	@GetMapping(value="/allbandes")
	public String allBande(
									Model model) {
		List<Bande> bandes = bandeService.findAll();
		
		model.addAttribute("bandes", bandes);
		return "bandePage";
		
	}
	@GetMapping(value="/allproducts")
	public String allProducts(
									Model model) {
		List<Produits> products = prodService.findAll();
		
		model.addAttribute("products", products);
		return "productPage";
		
	}
	@GetMapping(value="/allCommandes")
	public String allCommandes(
									Model model) {
		List<Commande> comds = cmdService.findAll();
		
		model.addAttribute("comds", comds);
		return "commandePage";
		
	}
	@GetMapping(value="/infoclient")
	public String infoClient(@RequestParam (required = false) long id,
									
									Model model) {
		Client client= clientService.getByIdClient(id);
		
		model.addAttribute(" client", client);
		return "ClientPage";
	}
	@GetMapping(value="/allclients")
	public String allClients(
									Model model) {
		List<Client> clients = clientService.findAll();
		
		model.addAttribute("clients", clients);
		return "bandePage";
		
	}
	@DeleteMapping("delete/{id}")
	public String deleteAccount(@PathVariable(name="id") long id) {
		emplService.deleteByIdEmploye(id);
		return"logout.html";
	}
}
