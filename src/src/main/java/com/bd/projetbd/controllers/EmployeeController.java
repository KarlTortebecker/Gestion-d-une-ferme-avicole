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
@RequestMapping(value="/employee")
public class EmployeeController {

private EmployeeServiceImpl emplService;
	
private PartenaireServiceImpl partService;
private BandeServiceImpl bandeService;
private InfoServiceImpl infoService;
private ClientServiceImpl clientService;
private ProduitsServicesImpl prodService;
private PertesServiceImpl perteService;
private DepenseServiceImpl depenseService;
private CommandeServiceImpl cmdService;
   
	public EmployeeController(EmployeeServiceImpl emplService, PartenaireServiceImpl partService,
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
@GetMapping(value="/infos/new")
public String info(Model model) {
	Info emp= new Info();
	model.addAttribute("newInfo",emp);
	return "newinfoPage";//pour l'ajout d'une info, les return ayant new sont pour la page d'ajout d'une entite
}
@GetMapping(value="/products/new")
public String product(Model model) {
	Produits emp= new Produits();
	model.addAttribute("newProduct",emp);
	return "newproductsPage";
}
@GetMapping(value="/orders/new")
public String bandes(Model model) {
	Commande emp= new Commande();
	model.addAttribute("newCommande",emp);
	return "newCommandePage";
}
@GetMapping(value="/depenses/new")
public String depense(Model model) {
	Depense emp= new Depense();
	model.addAttribute("newDepense",emp);
	return "newproductsPage";
}
@GetMapping(value="/clients/new")
public String newClient(Model model) {
	Client c= new Client();
	model.addAttribute("newClient",c);
	return"newClientPage";
}

@GetMapping(value="/productsPage")
public String prodPage(Model model) {
	model.addAttribute("productsPage",prodService.findAll());
	return "productPage";
}
@GetMapping(value="/ordersPage")
public String orderPage(Model model) {
	model.addAttribute("ordersPage",cmdService.findAll());
	return "orderPage";
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
@GetMapping(value="/depensesPage")
public String depensePage(Model model) {
	model.addAttribute("depensesPage", depenseService.findAll());
	return "depensePage";
}
@GetMapping(value="/clientPage")
public String clientPage(Model model) {
	model.addAttribute("clientPage",clientService.findAll());
	return "clientPage";
}
@GetMapping(value="/pertes/new")
public String pertes(Model model) {
	Pertes emp= new Pertes();
	model.addAttribute("newPerte",emp);
	return "newpertesPage";
}
@GetMapping(value="/bandesPages")
public String bandes() {

	return "bandesPage";
}
@GetMapping(value="/bandePage")
public String bande() {
	return "bandePage";
}
//@PostMapping(value="/register/save")
//public String saveNewAccount(Employe model) {
//	Employe account = new Employe();
//	emplService.saveEmploye(account);
//account.setStatut(account.getStatut());
//model.addAttribute("account", account);
//return "redirect:/login";
//}
@PostMapping(value="register/save")
public String saveNewAccount(@ModelAttribute("employe") Employe employe) {
//     employe.setPassword(password);
	emplService.saveEmploye(employe);

	return "redirect:/login";
}
@PostMapping(value="/client/save")
public String saveClient(@ModelAttribute("client") Client client) {
	clientService.saveClient(client);
	return "redirect:/clientPage";
}
@PostMapping(value="info/post")
public String infoBande(@ModelAttribute("info")Info info) {
	infoService.saveInfo(info);
	return "redirect:/infoPage";
}
@PostMapping(value="products/post")
public String infoProduct(@ModelAttribute("products")Produits products) {
	prodService.saveProduits(products);
	return "redirect:/productPage";
}
@PostMapping(value="pertes/post")
public String infoPertes(@ModelAttribute("pertes")Pertes pertes) {
	perteService.savePertes(pertes);
	return "redirect:/pertePage";
}
@GetMapping("/products/editProducts/{id}")
public String editProduct(@PathVariable long id,Model model) {
	model.addAttribute("products",prodService.getByIdProduits(id));
	return "editProducts";
}
@PostMapping("/editProducts/{id}")
public String modifyProduct(@PathVariable long id,Model model,@ModelAttribute("products") Produits products) {
	Produits existProduct= prodService.getByIdProduits(id);
	existProduct.setIdProduits(id);
	existProduct.setDate(existProduct.getDate());
	existProduct.setNomProduit(existProduct.getNomProduit());
	existProduct.setOrigine(existProduct.getOrigine());
	existProduct.setPrixProduit(existProduct.getPrixProduit());
	existProduct.setQuantite(existProduct.getQuantite());
	existProduct.setTypeProduits(existProduct.getTypeProduits());
	prodService.saveProduits(existProduct);
	return "redirect:/productPage";		
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
	return "bandesPage";
	
}
@DeleteMapping("delete/{id}")
public String deleteAccount(@PathVariable(name="id") long id) {
	emplService.deleteByIdEmploye(id);
	return"logout.html";
}
@DeleteMapping("deleteclient/{id}")
public String deleteClient(@PathVariable(name="id") long id) {
	clientService.deleteById(id);
	return "redirect:/clientPage";
}
}
