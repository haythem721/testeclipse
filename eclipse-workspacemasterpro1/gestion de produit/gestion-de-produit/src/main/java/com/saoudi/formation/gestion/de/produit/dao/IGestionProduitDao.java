package com.saoudi.formation.gestion.de.produit.dao;

import java.util.List;

import com.saoudi.formation.gestion.de.produit.entities.Produit;

public interface IGestionProduitDao {
	public void addProduit(Produit p);
	public List<Produit> getallProduits();
	public Produit getProduit(int id);

}
