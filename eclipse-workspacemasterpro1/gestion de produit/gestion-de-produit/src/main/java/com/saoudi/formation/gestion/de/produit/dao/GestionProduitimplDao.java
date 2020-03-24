package com.saoudi.formation.gestion.de.produit.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saoudi.formation.gestion.de.produit.entities.Produit;
@Repository
public class GestionProduitimplDao implements IGestionProduitDao {
	EntityManager em;
	@Autowired
	 public GestionProduitimplDao(EntityManager em) {
		// TODO Auto-generated constructor stub
		this.em=em;
	}
	

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		em.persist(p);

	}

	@Override
	public List<Produit> getallProduits() {
		// TODO Auto-generated method stub
		Query q=em.createQuery("select p from Produit p");
		
		return q.getResultList();
	}

	@Override
	public Produit getProduit(int id) {
		// TODO Auto-generated method stub
		return em.find(Produit.class, id);
	}

}
