/*

Program: Exercise6.java          Last Date of this Revision: March 15, 2022

Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 

*/

import java.util.Scanner;

public class Exercise6 {


 public static void main(String args[])
    {
       @SuppressWarnings("resource")
	Scanner userinput = new Scanner(System.in);
       
       System.out.println("Enter three digits: ");
       
       int digit = userinput.nextInt();
       
       int first = digit / 100;
       
       int second = (digit % 100) / 10;
       
       int third = digit % 10;
       
       System.out.println("The hundreds place digit is: " +first);
       
       System.out.println("The tens place digit is: " +second);
       
       System.out.println("The ones place digit is: " +third);

       
    }

}

/* Screen Dump
 
Enter three digits: 
256
The hundreds place digit is: 2
The tens place digit is: 5
The ones place digit is: 6

 .
 */