/*
Program: AccountSetup.java          Last Date of this Revision: April 21, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/

import java.util.Scanner;
import java.lang.String;

public class AccountSetup {
	
	 public static void main(String[]args) {
		 
	 String password, username;
	 
	 int passwordLength;
	 
	 Scanner input = new Scanner(System.in);
	 
	
	 System.out.print("Enter a username:  ");
	 
	 username = input.next();
	 
	 System.out.print("Enter a password that is at least 8 characters:  ");
	 
	 password = input.next();
	 
	 passwordLength = password.length();
	 
	 
	 while (passwordLength < 8) {
		 
	 System.out.print("Enter a password less that's at least 8 characters:  ");
	 
	 password = input.next();
	 
	 passwordLength = password.length();
	 }
	 input.close(); 
	 
	 System.out.println("Your username is " + username.toLowerCase() + " and your password is "
	 + password.toLowerCase()); 
	 
	 }
	 
	}

/*

Enter a username:  DmitriV
Enter a password that is at least 8 characters:  Programmer7
Your username is dmitriv and your password is programmer7

*/
