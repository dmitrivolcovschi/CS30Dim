/*
Program: Page80.java          Last Date of this Revision: April 4, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/


import java.util.Scanner;

public class Page80 {

 public static void main(String[] args) {
 
	 int windSpeed; 
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter speed of wind in mph: ");
 
 windSpeed = input.nextInt();
 
 input.close();
 
 if (windSpeed > 155) {
	 
 System.out.println("Category 5: greater than 155 mph or 135 kt or 249 km/hr");
 
 } else {
 if (windSpeed > 131) {
	 
 
 System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr.");
 
 } else {
	 
 }
 if (windSpeed > 111) {
	 
 System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr.");
 } else {
	 
 if (windSpeed > 96) {
	 
 System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr.");
 
 } else {
	 
 if (windSpeed > 74) {
	 
 System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr.");
 
 } else {
	 
 System.out.println("No hurricane.");
 
 
 }
 
 
 }
 
 
 }
 
 }
 
 }
 
 
}

/*
Enter speed of wind in mph: 155
Category 5: greater than 155 mph or 135 kt or 249 km/hr

Enter speed of wind in mph: 131
Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr.

Enter speed of wind in mph: 111
Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr.

Enter speed of wind in mph: 96
Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr.

Enter speed of wind in mph: 74
Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr.

Enter speed of wind in mph: 0-74
No hurricane.

*/