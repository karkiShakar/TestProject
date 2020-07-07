package question8.vastika;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Pounds of Mass");

		int pounds = input.nextInt();

		
		

		float kilogram = (float) (pounds*0.454);
		
		
				
		System.out.println("The Kilogram equivalent mass is " + kilogram);
		
	}

}
