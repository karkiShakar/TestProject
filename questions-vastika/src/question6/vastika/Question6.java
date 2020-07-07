package question6.vastika;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Celsius Temp");

		int cel = input.nextInt();

		System.out.println("Enter Fahrenheight Temp");

		int fah = input.nextInt();
		
		float tempCel = ((fah-32)*5)/9;
		
		float tempFah = ((cel*9)/5)+32;
		
		
		System.out.println(cel + " degCelcius is = " + tempFah + " degFahrenheight.");
		System.out.println(fah + " degFahrenheight is = " + tempCel + " degCelcius.");
		
	}

}
