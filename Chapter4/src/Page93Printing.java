/*
Program: Page93Printing.java          Last Date of this Revision: April 8, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/


import java.util.Scanner;

public class Page93Printing {
	
	 public static void main(String args[]) {
		
		 try (Scanner userinput = new Scanner(System.in)) {


       System.out.println("Enter the number of copies to be printed:");
       
       double paper = userinput.nextInt();
       
       if (paper < 99)
       {
           System.out.println("Price per copy is $0.30" );
           System.out.println("Total cost is: $" + (paper*3)/10 );
       }
       else if ((paper < 499)&&(paper > 100))
       {
           System.out.println("Price per copy is $0.28" );
           System.out.println("Total cost is: $" + (paper*28)/100 );
       }
        else if ((paper < 749)&&(paper > 500))
       {
           System.out.println("Price per copy is $0.27" );
           System.out.println("Total cost is: $" + (paper*27)/100 );
       }
         else if ((paper < 1000)&&(paper > 750))
       {
           System.out.println("Price per copy is $0.26" );
           System.out.println("Total cost is: $" + (paper*26)/100 );
       }
       else 
       {
    	   
           System.out.println("Price per copy is $0.25" );
           System.out.println("Total cost is: $" + (paper*25)/100 );
       
       }
     }
       
	 }
	 
}


/*
 
 Enter the number of copies to be printed:
1001
Price per copy is $0.25
Total cost is: $250.25

*/
