package test;
import java.util.*;
public class SommeChiffres {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Valeur de x?");
		int x = in.nextInt();
		in.nextLine();
		
		int S=0;
		int r;
		int q;
		q =x/10;
		
		for(;q!=0;)
		{
			r = x%10;
			S = S+r;
			x = q;
			q = x/10;
		}
		r = x%10;
		S = S+r;
		
		System.out.println("Somme: "+S);

	}

}
