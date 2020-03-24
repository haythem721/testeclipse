package com.saoudi.formation.gestion.de.produit.controleurrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saoudi.formation.gestion.de.produit.entities.Produit;
import com.saoudi.formation.gestion.de.produit.services.IGestionProduitService;

@RestController
@RequestMapping("/api")
public class Controleur {
	@Autowired
	IGestionProduitService service;
	
	@GetMapping("/")
	public String getinit()
	{
		return "hello";
	}
	@GetMapping("/produits")
	public List<Produit> getallProduits()
	{
		return service.getallProduits();
	}
	@GetMapping("/produits/{id}")
	public Produit getProduit(@PathVariable("id")int id)
	{
		return service.getProduit(id);
	}

}
