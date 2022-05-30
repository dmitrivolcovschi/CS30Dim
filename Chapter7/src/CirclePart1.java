/*
 
Program:.java          Last Date of this Revision: May 8, 2022
 
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Programming 20
 
 
*/



public class CirclePart1 {

	public static void main(String[] args) 
	{

		ReviewCircle spot = new ReviewCircle(); //calling class
		
		spot.setRadius(3); //sets radius to 3
		System.out.println("Circle radius: " + spot.getRadius()); //displays radius of circle
		System.out.println("Circle circumfrance: " + spot.circumference()); //displays circumfrance of circle
		

	}
}
/*
Circle radius: 3.0
Circle circumference: 18.84
*/