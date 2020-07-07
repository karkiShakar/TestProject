package question5vastika;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Radius of Circle");

		int radius = input.nextInt();

		System.out.println("Enter Base of Triang;e");

		int base = input.nextInt();

		System.out.println("Enter Height of Triangle ");

		int height = input.nextInt();

		System.out.println("Enter length of Rectangle ");

		int length = input.nextInt();

		System.out.println("Enter Base of Rectangle ");

		int base2 = input.nextInt();

		float areaCircle = (float) (Math.PI * Math.pow(radius, 2));
		float areaTriangle = (base * height) / 2;
		float areaRectangle = (length * base2);

		System.out.println("The Area of Circle  is " + areaCircle);
		System.out.println("The Area of Triangle  is " + areaTriangle);
		System.out.println("The Area of Rectangle  is " + areaRectangle);

	}

}
