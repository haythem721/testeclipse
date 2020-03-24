package com.saoudi.formation.gestion.de.produit.services;

import java.util.List;

import com.saoudi.formation.gestion.de.produit.entities.Produit;

public interface IGestionProduitService {
	public void addProduit(Produit p);
	public List<Produit> getallProduits();
	public Produit getProduit(int id);
}
