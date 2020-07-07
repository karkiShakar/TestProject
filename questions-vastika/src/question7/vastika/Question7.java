package question7.vastika;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Radius of Cylinder");

		int radius = input.nextInt();

		System.out.println("Enter Length of Cylinder");

		int length = input.nextInt();

		

		float areaCylinder = (float) (2*(Math.PI * radius*length));
		
		System.out.println("The Area of Cylinder  is " + areaCylinder);
		
	}

}
