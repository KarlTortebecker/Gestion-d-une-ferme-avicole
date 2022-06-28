package com.bd.projetbd.controllers;

import com.bd.projetbd.ServiceImpl.EmployeeServiceImpl;
import com.bd.projetbd.entities.Employe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
@RequestMapping(value="/")
public class HomeController {
	private EmployeeServiceImpl emplService;
	

	@GetMapping({"/", "/home","login"})
	public String home(Model model){
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
