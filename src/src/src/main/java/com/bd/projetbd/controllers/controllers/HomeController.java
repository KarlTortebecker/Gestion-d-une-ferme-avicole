package com.bd.projetbd.controllers;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
@RequestMapping(value="/")
public class HomeController {
	private EmployeeServiceImpl emplService;
	
	public HomeController(EmployeeServiceImpl emplService) {
		super();
		this.emplService = emplService;
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
//	     employe.setPassword(passwordEncoder.encode(getP));
//		String encodedPassword = passwordEncoder.encode(employe.getPassword());
	    employe.setPassword(employe.getPassword());
		emplService.saveEmploye(employe);

		return "redirect:/login";
	}
	@DeleteMapping("delete/{id}")
	public String deleteAccount(@PathVariable(name="id") long id) {
		emplService.deleteByIdEmploye(id);
		return"logout.html";
	}
}
