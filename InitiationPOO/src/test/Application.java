package test;

public class Application {

	public static void main(String[] args) 
	{
		// TODO Creation des  objets + (Constructeur)
		// TODO Ensuite appel aux autres methodes de la classe
		// TODO Pour faire des operations quelconques sur les objets
		// TODO Class_C nom_objet = new Class_C(parametres_intialisations)
		
		Point p1 = new Point(5,8);
		
		System.out.println("Abscisse de P1: "+p1.getX());
		System.out.println("Ordonnee de P1: "+p1.getY());

		Point p2 = new Point(4,3);
		
		System.out.println("Abscisse de P2: "+p2.getX());
		System.out.println("Ordonnee de P2: "+p2.getY());
		
		//Modifier l'abscisse de p2 par 10
		p2.setX(10);
		System.out.println("Nouvelle abscisse de P2:"+p2.getX());
		
		//Translater le point p1 avec les coordonnees de  p2
		p1.translater(p2.getX(),p2.getY());
		
		System.out.println("Apres translation, abscisse de P1: "+p1.getX());
		System.out.println("Apres translation, ordonnee de P1: "+p1.getY());

		
	}

}
