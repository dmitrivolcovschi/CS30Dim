/*
 
Program:.java          Last Date of this Revision: June 4, 2022
 
  
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Programming 20
 
 
*/


import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number that is 10 or higher: ");
		int numel = input.nextInt();
		input.close();
		int y = numel - 10;
		int [] num = new int[numel];
		
		for(int x = y; x < numel; x++)
		{
			num[x] = x;
		}
		
		System.out.println("Countdown");
		
		for(int x = numel - 1; x>=y; x--) 
		{
			System.out.println(num[x]);
		}
 

	}

}
/*
 
Enter a number that is 10 or higher: 
15
Countdown
14
13
12
11
10
9
8
7
6
5

*/