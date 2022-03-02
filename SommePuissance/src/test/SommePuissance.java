package test;

import java.util.Scanner;

public class SommePuissance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Donnez le nombre n");
		int n = input.nextInt();
		input.nextLine();
		
		System.out.println("Donnez la puissance");
		int x = input.nextInt();
		input.nextLine();
		
		double somme = 0;
		
		for(int i=1;i<=n;i++)
		{
			somme = somme + Math.pow(i, x);
		}
		
		System.out.println("La somme des nombres entre 1 et n: "+somme);
	}

}
