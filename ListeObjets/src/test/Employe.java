package test;

public class Employe {
	private String nom;
	private String prenom;
	private int matr;
	private int salbase;
	
	public Employe(String nom, String prenom, int matr, int salbase) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matr = matr;
		this.salbase = salbase;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getMatr() {
		return matr;
	}
	public void setMatr(int matr) {
		this.matr = matr;
	}
	public int getSalbase() {
		return salbase;
	}
	public void setSalbase(int salbase) {
		this.salbase = salbase;
	}
	
	
}
