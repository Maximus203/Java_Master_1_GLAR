package test;

import java.util.Scanner;

public class Factoriel {
	
	static int factoriel(int a) {
		if((a == 0) || (a == 1))
			return 1;
		else		
		return a * factoriel (a - 1);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Donnez moi un entier");
		int n = input.nextInt();
		input.nextLine();
		
		System.out.println("Le factoriel de "+n+" est: "+factoriel(n));

	}
	

}
