/*


Program: Exercise5.java          Last Date of this Revision: March 15, 2022

Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 

*/


import java.util.Scanner;
 
public class Exercise5 
{
    

	public static void main(String args[])
    {       try (Scanner userinput = new Scanner(System.in)) {
      System.out.println("Enter your change in cents: ");
       
       int change = userinput.nextInt();
       
       int quarters = change / 25;
       
       int dimes = ((change % 25) / 10);
       
       int nickels = (((change % 25)%10)/ 5);
       
       int pennies = ((((change % 25)%10)/ 1));
       
       System.out.println("The minimum number of coins is: " + change);
       
       System.out.println("Quarters: " + quarters);
       
       System.out.println("Dimes: " + dimes);
       
       System.out.println("Nickels: " + nickels);
       
       System.out.println("Pennies: " + pennies);
   }
    }
   
}

/* Screen Dump

Enter your change in cents: 
212
The minimum number of coins is: 212
Quarters: 8
Dimes: 1
Nickels: 0
Pennies: 2

*/