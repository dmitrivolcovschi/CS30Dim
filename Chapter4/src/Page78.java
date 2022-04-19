/*
Program: Page78.java          Last Date of this Revision: April 1, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/


import java.util.Scanner;

public class Page78 {
	
	public static void main(String[] args) {
		
		final double Good_Surf = 6.0;
		
		double wave;
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the wave height: ");
		wave = input.nextDouble();
		
		
	    if (wave > Good_Surf) {
	    	
			System.out.println("Great day for surfing!");
			
		} else if (wave <= 6.0 && Good_Surf >= 3.0) {
			
			System.out.println("Go body boarding!");
			
		} else if (wave <= 3.0 && Good_Surf >= 0.0) {
			
			System.out.println("Go for a swim.");
			
		} else {
			
			System.out.println("Whoa! What kind of surf is that?");
			
		}
			
		input.close();
		
	} 
}

/*

Enter the wave height: 6
Go body boarding!

*/