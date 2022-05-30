/*
 
Program:.java          Last Date of this Revision: May 23, 2022
 
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Programming 20
 
 
*/

public class CirclePart4 {

	public static void main(String[] args) 
	{

		ReviewCircle spot1 = new ReviewCircle(3); //overload first constructor to 3
		ReviewCircle spot2 = new ReviewCircle(4); //overloads second constructor to 4
		
		if (spot1.equals(spot2)) { //if else statement to determine if both the objects are equal or not
			System.out.println("Objects are equal.");
		} else {
			System.out.println("Objects are not equal.");
		}
		System.out.println(spot1); //displays spot1
		System.out.println(spot2); //displays spot2
		
		}

	

}
/*
Objects are not equal.
Circle has radius 3.0
Circle has radius 4.0

*/