package test;

public class Application {

	public static void main(String[] args) {
		CompteEpargne c1 = new CompteEpargne("1101", 200000);
		CompteEpargne c2 = new CompteEpargne("1102", 300000);
		
		System.out.println("Numero de c1: "+c1.getNumero());
		System.out.println("Solde de c1: "+c1.getSolde());
		
		//Debiter le solde de c2 de 6000000
		c2.debiter(600000);
		
		//Crediter le solde de c1 par celui de c2
		c1.crediter(c2.getSolde());
		System.out.println("Nouveau solde de c1:"+c1.getSolde());
		

	}

}
