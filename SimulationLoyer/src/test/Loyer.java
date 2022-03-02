package test;

import java.util.*;

public class Loyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int li,na;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Donnez le loyer initiale");
		li = input.nextInt();
		input.nextLine();
		
		System.out.println("Donnez le nombre d'annee");
		na = input.nextInt();
		input.nextLine();
		
		double lf = li;
		
		for(int i=0; i<na; i++)
		{
			lf = lf + (lf * 5 / (double)100);
		}
		
		System.out.println("Au bout de "+na+" ans, votre loyer sera: "+lf);
	}

}