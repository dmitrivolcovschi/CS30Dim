/*
Program: Ex5Grade.java          Last Date of this Revision: April 11, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/

//

import java.util.Scanner;

public class Ex5Grade {


static Scanner userinput = new Scanner(System.in);

public static void main(String args[]) {

       System.out.println("Enter the percentage: ");
       
       int grade = userinput.nextInt();
       
       if (grade > 90)
       {
           System.out.println("The corresponding letter grade is: A");
       }
       else if ((grade < 89)&&(grade > 80))
       {
           System.out.println("The corresponding letter grade is: B ");
       }
       else if ((grade < 79)&&(grade > 70))
       {
           System.out.println("The corresponding letter grade is: C ");
       }
       else if ((grade < 69)&&(grade > 60))
       {
           System.out.println("The corresponding letter grade is: D ");
       }
       else 
       {
           System.out.println("The corresponding letter grade is: F ");
       }
    }
    
}


/*

Enter the percentage: 
75
The corresponding letter grade is: C 

*/