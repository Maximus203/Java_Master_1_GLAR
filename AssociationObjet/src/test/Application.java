package test;
import java.util.*;

public class Application {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Administrateur> listeadmin = new ArrayList<Administrateur>();
		ArrayList<Serveur> listeserv = new ArrayList<Serveur>();
		
		int choix = 0;
		String numero,ip,nomserv,nom,prenom;
		int matr,port;
		Administrateur adm= null;
		do {
			System.out.println("1. Ajouter un administrateur");
			System.out.println("2. Lister les administrateurs");
			System.out.println("3. Ajouter un serveur");
			System.out.println("4. Lister les seveurs");
			System.out.println("5. Lister les serveurs");
			System.out.println("6. Sortie");
			System.out.println("Faite votre choix");
			choix = sc.nextInt();
			sc.nextLine();
			
			switch(choix)
			{
				case 1:
					System.out.println("Matricule ?");
					matr = sc.nextInt();
					sc.nextLine();
					System.out.println("Nom ?");
					nom = sc.nextLine();
					System.out.println("Prenom ?");
					prenom = sc.nextLine();
					Administrateur admin = new Administrateur(matr, prenom, nom);
					break;
				case 2:
					for (Administrateur x : listeadmin)
					{
						System.out.println("_______________________________");
						System.out.println("Matricule: "+x.getMatr());
						System.out.println("Nom : "+x.getNom());
						System.out.println("Prenom"+x.getPrenom());
					}
					System.out.println("_______________________________");
					break;
				case 3:
					System.out.println("Ce serveur est t-il gere ? (O/N)");
					String reponse = sc.nextLine();
					if( reponse.equals("N"))
					{
						adm = null;
					}
					else
					{
						System.out.println("Numero de l'administrateur ?");
						int num = sc.nextInt();
						sc.nextLine();
						for(Administrateur y:listeadmin)
						{
							if(y.getMatr()==num)
							{
								adm = y;
								break;
							}
						}
						if( adm == null )
							System.out.println("Numero de l'administrateur");
						else
						{
							System.out.println("Numero de l'administrateur");
							numero = sc.nextLine();
							System.out.println("Nom du serveur");
							nomserv = sc.nextLine();
							System.out.println("IP du serveur");
							ip = sc.nextLine();
							System.out.println("Port du serveur");
							port = sc.nextInt();
							sc.nextLine();
							Serveur sv= new Serveur(numero, nomserv, ip, port, admin);
						}
					}
					break;
				case 4:
					for (Serveur t: listeserv)
					{
						System.out.println("______________________________");
						System.out.println("Numero du serveur "+t.getNumero());
						System.out.println("IP du serveur "+t.getIp());
						System.out.println("Nom du serveur "+t.getNom());
						System.out.println("Port du serveur "+t.getPort());
						System.out.println("______________________________");
					}
					break;
				case 5:
					for (Serveur t: listeserv)
					{
						System.out.println("______________________________");
						System.out.println("Numero du serveur "+t.getNumero());
						System.out.println("IP du serveur "+t.getIp());
						System.out.println("Nom du serveur "+t.getNom());
						System.out.println("Port du serveur "+t.getPort());
						if (t.getAdmin()==null)
							System.out.println("Administrateur inexistant !!!");
						else
						{
							System.out.println("Matricule Admin"+t.getAdmin().getMatr());
							System.out.println("Nom Admin: "+t.getAdmin().getNom());
							System.out.println("Prenom Admin: "+t.getAdmin().getPrenom());
							
						}
						System.out.println("______________________________");

					}
					break;
				case 6:
					break;
				default:
					System.out.println("Choix impossible !!!");
					break;
			}
			
		}while(choix!=6);
		System.out.println("Fin du programme");
	}
}
