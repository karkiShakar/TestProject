package question4.vastika;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Principle Value");
		
		int principle = input.nextInt();
		
	System.out.println("Enter Time in years");
		
		int time = input.nextInt();
		
	System.out.println("Enter Rate ");
		
		int rate = input.nextInt();
		
		float interest = (principle*time*rate)/100;
		
		System.out.println("The interest is $"+interest);
	
		
		
	}

}
