/*


Program: Digits.java          Last Date of this Revision: March 16, 2022

Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 

*/


import java.util.Scanner;

public class Digits {


 public static void main(String args[])
    {
       @SuppressWarnings("resource")
	Scanner userinput = new Scanner(System.in);
       
       System.out.println("Enter two digits: ");
       
       int digit = userinput.nextInt();
      
       int first = digit / 10;
       
       int second = digit %10;
       
       
       System.out.println("The tens place digit is: " +first);
       
       System.out.println("The ones place digit is: " +second);

       
    }

}

/* Screen Dump
 .
Enter two digits: 
23
The tens place digit is: 2
The ones place digit is: 3

 
 */