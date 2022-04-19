/*
Program: Page83.java          Last Date of this Revision: April 6, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/



public class Page83 {
	

  public static void main( String args[]  ) {
	   
  int min = 0;
  int max = 10000;
  
  System.out.println("Random value in int from "+min+" to "+max+":");  
  
  int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
 
  System.out.println(random_int);
  
  }
  
}

/*

Random value in int from 0 to 10000:
203

*/

