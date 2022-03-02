package test;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Combien de ligne ?");
		int n = input.nextInt();
		input.nextLine();
		

		for(int i=0;i<n;i++)
		{
			for(int k=n-1;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
