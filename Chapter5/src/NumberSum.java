/*
Program: NumberSum.java          Last Date of this Revision: April 19, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/


import java.util.Scanner;
public class NumberSum {

public static void main(String[] args) {
	
int num, sum=0,num1=0;

Scanner input=new Scanner(System.in);

System.out.println("Enter a number: ");

num=input.nextInt();

input.close();

do {
	
System.out.println(num1);

num1+=1;

sum+=num1;

}while(num1<=num);

System.out.println(sum);



}
	
}

/* Screen Dump

Enter a number: 
6
0
1
2
3
4
5
6
28

*/