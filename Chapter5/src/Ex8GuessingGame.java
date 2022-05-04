/*
Program: Ex8GuessingGame.java          Last Date of this Revision: April 27, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/

import java.util. Random;
import java.util. Scanner;

public class Ex8GuessingGame {
	
public static void main(String[] args) {
	
	 Random randomNumber = new Random();
	 
	  Scanner kbd = new Scanner(System.in);
	  
	  int computerValue = randomNumber.nextInt(20);
	  
	  int numberOfTries = 0;
	  
	  int success = 0;
	  
	  int guess = 0;	
	


 while (success == 0)
	
 {
	 
	 System.out.println("Enter a number between 1 and 20: ");
     guess = kbd.nextInt();
     numberOfTries++;

        if (guess < 1 || guess > 20){
           System.out.println("Try again.");
        }

        else if (guess == computerValue){
           success++;
           System.out.println("You won!");

        }
        else if (guess < computerValue){
           System.out.println("Try again.");
        }
        else if (guess > computerValue){
           System.out.println("Try again.");
 }
 }



}
}

/*
 
Enter a number between 1 and 20: 
13
Try again.

Enter a number between 1 and 20: 
11
Try again.

Enter a number between 1 and 20: 
17
Try again.

Enter a number between 1 and 20: 
4
Try again.

Enter a number between 1 and 20: 
5
Try again.

Enter a number between 1 and 20: 
9
You won!
 
*/
 