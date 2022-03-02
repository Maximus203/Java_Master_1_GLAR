package test;

import java.util.Scanner;

public class Convertissseur {

	public static void main(String[] args) {
		
		int choice,restart,counter=0;
		
		do{
			Scanner input = new Scanner(System.in);
			
			// Conversion choice
			do{
				System.out.println("Quel conversion souhaitez-vous faire ?\n\nTaper 1 :pour Celsus => Fahrenheit\nTaper 2 :pour Fahrenheit => Celsus ");
				choice = input.nextInt();
				input.nextLine();
				//Input check
				if((choice != 1)&&(choice !=2))
				{
					if(counter==0)
					{
						counter++;
												
					}
					else {
						
						if(counter==1)
						{
							System.out.println("Vous vous etes trompe :)");
							counter++;
							
						}
						else {
							if(counter==2)
							{
								System.out.println("Ecrit bien mon gars ;)");
								counter++;
						
							}
							else {

								if(counter==3)
								{
									System.out.println("Mais t'as pas tes lunettes ???");
									counter++;
									
								}
								else {
									
									if(counter==4)
									{
										System.out.println("ON NE VA Y PASSER TOUTES LA JOURNEE AUSSI !!!");
										counter++;
										
									}
									else {
										
										if(counter==5)
										{
											System.out.println("M*****, C'EST PAS DIFFICILE DE FAIRE UN CHOIX ENTRE 1 ET 2 NON ???");
											counter++;
											
										}
										else
										{
											if(counter==6)
											{
												System.out.println("Bon je vais faire un choix pour vous");
												choice = 1;
												
											}
										}
									}
								}
							}
						}
					}
				}
				
			} while((choice != 1) && (choice != 2));
			
			switch(choice)
			{
				case 1:
					System.out.println("Donnez la valeur de la temperature en degres Celcius");
					float tempeC = input.nextFloat();
					input.nextLine();
					float tempeF = ((float)9*tempeC/5)+32;
					
					System.out.println(tempeC+" degres Celcius => "+tempeF+" degres Fahrenheit");
					break;
				case 2:
					System.out.println("Donnez la valeur de de la temperature en degres Fahrenheit");
					float tempF = input.nextFloat();
					input.nextLine();
					float tempC = (tempF-32)*(float)5/9;
					
					System.out.println(tempF+" degres Fahrenheit => "+tempC+" degres Celcius");
					break;
				default:
					System.out.println("Alors ca gaze ?");
			}
			counter = 0;
			do{
				System.out.println("Voulez-vous faire une autre conversion ?\n\nTaper 1 :pour une autre conversion\nTaper 2 :pour quitter");
				restart = input.nextInt();
				input.nextLine();
				// Input check
				if((restart != 1)&&(restart !=2))
				{
					if(counter==0)
					{
						counter++;
												
					}
					else {
						
						if(counter==1)
						{
							System.out.println("Vous vous etes trompe :)");
							counter++;
							
						}
						else {
							if(counter==2)
							{
								System.out.println("Ecrit bien mon gars ;)");
								counter++;
						
							}
							else {

								if(counter==3)
								{
									System.out.println("Mais t'as pas tes lunettes ???");
									counter++;
									
								}
								else {
									
									if(counter==4)
									{
										System.out.println("ON NE VA Y PASSER TOUTES LA JOURNEE AUSSI !!!");
										counter++;
										
									}
									else {
										
										if(counter==5)
										{
											System.out.println("M*****, C'EST PAS DIFFICILE DE FAIRE UN CHOIX ENTRE 1 ET 2 NON ???");
											counter++;
											
										}
										else
										{
											if(counter==6)
											{
												System.out.println("Bon je vais faire un choix pour vous");
												restart = 2;
												
											}
										}
									}
								}
							}
						}
					}
				}
			} while((restart != 1) && (restart != 2));
			
		// Restart mode			
		}while(restart!=2);
		
		System.out.println("A la prochaine ;)");
		
	}

}
