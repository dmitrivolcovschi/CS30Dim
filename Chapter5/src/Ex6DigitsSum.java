/*
Program: Ex6DigitsSum.java          Last Date of this Revision: April 24, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/

import java.util.Scanner;
public class Ex6DigitsSum {

  public static void main(String[] args)
    {
      @SuppressWarnings("resource")
      
	Scanner in = new Scanner(System.in);
      
      System.out.print("Enter a positive integer: ");
      
      int digits = in.nextInt();
      
	  System.out.println("The sum of the digits is: " + sumDigits(digits));
    }

 public static int sumDigits(long n) {
	 
		int result = 0;
		
		while(n > 0) {
			
			result += n % 10;
			
			n /= 10;
		}
		
		return result;
	}
	
 }


/*

Enter a positive integer: 892
The sum of the digits is: 19

*/