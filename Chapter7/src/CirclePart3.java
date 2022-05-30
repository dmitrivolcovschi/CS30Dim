/*
 
Program:.java          Last Date of this Revision: May 19, 2022
 
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Programming 20
 
 
*/


public class CirclePart3 {

	public static void main(String[] args)
	{

		ReviewCircle spot = new ReviewCircle(5); //overload constructor to 5
		
		System.out.println("Circle radius: " + spot.getRadius()); //displays radius of circle
		System.out.println("Circle area: " + spot.area()); //displays area of circle
		ReviewCircle.displayareaformula(); //grabs formula of area of a circle from ReviewCircle class

	}

}
/*
Circle radius: 5.0
Circle area: 78.5
The formula for the area of a circle is: a = Pi * r * r
*/