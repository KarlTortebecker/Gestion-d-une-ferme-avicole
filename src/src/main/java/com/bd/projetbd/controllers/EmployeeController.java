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
import com.bd.projetbd.entities.Employe;
import com.bd.projetbd.entities.Info;
import com.bd.projetbd.entities.Partenaire;
import com.bd.projetbd.entities.Pertes;
import com.bd.projetbd.entities.Produits;
import com.si.casdj.entity.Products;



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
	return "newinfoPage";
}
@GetMapping(value="/products/new")
public String product(Model model) {
	Produits emp= new Produits();
	model.addAttribute("newProduct",emp);
	return "newproductsPage";
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
@GetMapping(value="/depensesPage")
public String depensePage(Model model) {
	model.addAttribute("depensesPage", depenseService.findAll());
	return "depensePage";
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

	emplService.saveEmploye(employe);

	return "redirect:/login";
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
//@GetMapping(path="/productPic/{idProduct}",produces=MediaType.IMAGE_PNG_VALUE)
//public byte[] getPic(@PathVariable("idProducts") Long id) throws Exception{
//	Produits p=prodService.getByIdProduits(id);
//	return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/casd/products/"+p.getNomImage()));
//}
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
//@GetMapping(value="/infoemploye")
//public String infoEmploye(@RequestParam (required = false) String firstName,
//								
//								Model model) {
//	Employe users = emplService.getNomEmploye(firstName);
//	
//	model.addAttribute("users", users);
//	model.addAttribute("firstName", firstName);
//	return "employeePage";
//}
//@GetMapping(value="/allemploye")
//public String allEmployees(
//								Model model) {
//	List<Employe> users = emplService.findAll();
//	
//	model.addAttribute("users", users);
//	return "employeesPage";
//}
//@GetMapping(value="/allpartenaire")
//public String allPartenaires(
//								Model model) {
//	List<Partenaire> users = partService.findAll();
//	
//	model.addAttribute("users", users);
//	return "partenairesPage";
//}
//@GetMapping(value="/infopatenaire")
//public String infoPartenaire(@RequestParam (required = false) String firstName,
//								
//								Model model) {
//	Partenaire users = partService.getNomPartenaire(firstName);
//	
//	model.addAttribute("users", users);
//	model.addAttribute("firstName", firstName);
//	return "partenairesPage";
//}
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
}
