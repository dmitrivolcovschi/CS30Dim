/*
 
Program:.java          Last Date of this Revision: May 28, 2022
 
  
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Programming 20
 
 
*/

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) 
	{
	
		System.out.println("Enter the number of students in the class: "); 
		
		Scanner input = new Scanner(System.in); 
 
		int studentNum = input.nextInt(); 
 
		String[] names = new String[studentNum]; 
 
		for(int i = 0; i < studentNum; i++) 
		{
			System.out.println("Enter the student's name: "); 
 
			String nameE = input.next(); 
 
			names[i] = nameE; 
		}
 
		System.out.println("\nStudent Roster: "); 
 
		for (String element: names)
		{
			System.out.println(element); 
		}
		
		input.close();
 
		
	}

}
/*
Enter the number of students in the class: 
10
Enter the student's name: 
Dmitri
Enter the student's name: 
Luke
Enter the student's name: 
Jakob
Enter the student's name: 
Tristian
Enter the student's name: 
Skyler
Enter the student's name: 
Nick
Enter the student's name: 
Cayl
Enter the student's name: 
Adin
Enter the student's name: 
Polo
Enter the student's name: 
Chloe

Student Roster: 
Dmitri
Luke
Jakob
Tristian
Skyler
Nick
Cayl
Adin
Polo
Chloe
*/