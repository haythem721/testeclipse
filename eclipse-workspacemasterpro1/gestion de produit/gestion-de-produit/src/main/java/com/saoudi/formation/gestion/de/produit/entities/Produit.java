package com.saoudi.formation.gestion.de.produit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designation;
	private int quantite;
	private double prix;
	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", quantite=" + quantite + ", prix=" + prix + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(int id, String designation, int quantite, double prix) {
		super();
		this.id = id;
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
	}
	
}
