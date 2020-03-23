package webservice.entity;

public class Personne {
	private int id;
	private String nom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	

}
