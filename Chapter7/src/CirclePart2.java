/*

Program:.java          Last Date of this Revision: May 15, 2022

Author: Dmitri Volcovschi
School: CHHS
Course: Computer Programming 20


*/ 




public class CirclePart2 {

	public static void main(String[] args) 
	{

		ReviewCircle spot = new ReviewCircle(9); //overloads constructor to 9
		

		System.out.println("Circle radius: " + spot.getRadius()); //displays radius of circle
		System.out.println("Circle circumfrance: " + spot.circumference()); //displays circumfrance of circle
		

	}

}
/*
Circle radius: 9.0
Circle circumfrance: 56.52
*/
