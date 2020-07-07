package question9.vastika;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
	

			Scanner input = new Scanner(System.in);

			System.out.println("Enter Radius of Circle");

			int radius = input.nextInt();

			System.out.println("Enter Base of Triang;e");

			int base = input.nextInt();

			System.out.println("Enter one side of Triangle ");

			int side1 = input.nextInt();
			
			System.out.println("Enter Another side of Triangle ");

			int side2 = input.nextInt();


			System.out.println("Enter length of Rectangle ");

			int length = input.nextInt();

			System.out.println("Enter Base of Rectangle ");

			int base2 = input.nextInt();

			float periCircle = (float) (Math.PI * radius * 2);
			float perTriangle = side1+base+side2;
			float periRectangle = 2*(length + base2);

			System.out.println("The Area of Circle  is " + periCircle);
			System.out.println("The Area of Triangle  is " + perTriangle);
			System.out.println("The Area of Rectangle  is " + periRectangle);

		}


}
