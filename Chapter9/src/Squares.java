/*
 
Program:.java          Last Date of this Revision: June 1, 2022
 
  
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Programming 20
 
 
*/

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number 5 or higher: ");
		int numel = input.nextInt();
		input.close();
		int y = numel - 5;
		int [] num = new int[numel];
		
		for(int x = y; x < numel; x++)
		{
			num[x] = x;
		}
		
		System.out.println("Here is the square of 5 numbers before " + numel + ":");
		
		for(int x = numel - 1; x>=y; x--) 
		{
			System.out.println(num[x] * num[x]);
		}
		
	}

}
/*
Enter a number 5 or higher: 
6
Here is the square of 5 numbers before 6:
25
16
9
4
1

*/