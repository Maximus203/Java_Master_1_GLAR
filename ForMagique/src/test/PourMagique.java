package test;
import java.util.*;
public class PourMagique {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Valeur de n");
		int n = in.nextInt();
		in.nextLine();
		
		int i=1;
		for(;i<=n;)
		{
			System.out.println(i);
			i++;
		}
	}
}
