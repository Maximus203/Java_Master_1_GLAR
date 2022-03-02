package test;

import java.util.*;

public class Application 
{

	public static void main(String[] args) 
	{
		ArrayList<Employe> liste = new ArrayList<Employe>();
		int matr,salbase;
		String nom,prenom;
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("1. Ajouter un employe");
			System.out.println("2. Afficher les employes");
			System.out.println("3. Statistiques");
			System.out.println("4. Sortie");
			System.out.println(" Votre choix ?");
			choix = sc.nextInt();
			sc.nextLine();
			
			switch(choix)
			{
				case 1:
					System.out.println("Matricule?");
					matr = sc.nextInt();
					sc.nextLine();
					System.out.println("Nom?");
					nom = sc.nextLine();
					System.out.println("Prenom?");
					prenom = sc.nextLine();
					System.out.println("Salaire de base?");
					salbase = sc.nextInt();
					sc.nextLine();
					Employe emp = new Employe(nom, prenom, matr, salbase);
					liste.add(emp);
					break;
				case 2:
					for (Employe x:liste)
					{
						System.out.println("_______________");
						System.out.println("Matrcule: "+x.getMatr());
						System.out.println("Nom: "+x.getNom());
						System.out.println("Prenom: "+x.getPrenom());
						System.out.println("Salaire de base: "+x.getSalbase());
						
					}
					System.out.println("_______________");
					break;
				case 3:
					int  taille=liste.size();
					System.out.println("Nombre d'employes: "+taille);
					int ct1 = 0;
					int ct2 = 0;
					int ct3 = 0;

					for(Employe y:liste)
					{
						if(y.getSalbase()<300000)
							ct1++;
						else
							if(y.getSalbase()<600000)
								ct2++;
							else
								ct3++;
					}
					System.out.println("Moins de 300000: "+ct1);
					System.out.println("Entre 300000 et 600000: "+ct2);
					System.out.println("Plus de 600000: "+ct3);
				case 4:
					break;
				default:
					System.out.println("Choix invalide !!!");
					break;
					
			}
			
		}
		while(choix != 4);
		System.out.println("Fin de l'application");

	}

}
