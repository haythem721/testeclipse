package com.saoudi.formation.gestion.de.produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saoudi.formation.gestion.de.produit.services.IGestionProduitService;

@SpringBootApplication
public class GestionDeProduitApplication  {
@ Autowired
IGestionProduitService service;
	public static void main(String[] args) {
		SpringApplication.run(GestionDeProduitApplication.class, args);
		System.out.println("ok");
	}

	

}
