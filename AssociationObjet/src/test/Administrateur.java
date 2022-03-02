package test;

public class Administrateur {
	private int matr;
	private String prenom;
	private String nom;
	public Administrateur(int matr, String prenom, String nom) {
		super();
		this.matr = matr;
		this.prenom = prenom;
		this.nom = nom;
	}
	public int getMatr() {
		return matr;
	}
	public void setMatr(int matr) {
		this.matr = matr;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
