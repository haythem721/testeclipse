package com.saoudi.formation.gestion.de.produit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saoudi.formation.gestion.de.produit.dao.IGestionProduitDao;
import com.saoudi.formation.gestion.de.produit.entities.Produit;
@Service
public class GestionProduitService implements IGestionProduitService {
     @Autowired
     IGestionProduitDao gestiondao;
     
	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		gestiondao
		.addProduit(p);

	}

	@Override
	public List<Produit> getallProduits() {
		// TODO Auto-generated method stub
		return gestiondao.getallProduits();
	}

	@Override
	public Produit getProduit(int id) {
		// TODO Auto-generated method stub
		return gestiondao.getProduit(id);
	}

}
