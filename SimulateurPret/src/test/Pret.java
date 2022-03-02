package test;

import java.util.*;

public class Pret {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int na;
		double mpret,tia;
		
		System.out.println("Donnez le montant du pret");
		mpret = input.nextDouble();
		input.nextLine();
		
		System.out.println("Donnez le nombre d'annee");
		na = input.nextInt();
		input.nextLine();
		
		System.out.println("Donnez le taux d'interet annuel");
		tia = input.nextDouble();
		input.nextLine();
		
		double tim = tia / 1200;
		
		double mmensuel = ( mpret * tim ) / ( 1 - ( 1 / Math.pow((1+tim),(12*na))));
		
		double mglobal = 12 * na * mmensuel;
		
		System.out.println("Mensualite: "+mmensuel+"\nMontant global: "+mglobal);

	}

}
