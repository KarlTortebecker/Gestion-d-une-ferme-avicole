package com.bd.projetbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bd.projetbd.ServiceImpl.ClientServiceImpl;

@SpringBootApplication
public class ProjetbdApplication {
//	@Autowired
//	private ClientServiceImpl client;
//	@Autowired
//	
	public static void main(String[] args) {
		SpringApplication.run(ProjetbdApplication.class, args);
	}

}
