package question2.vastika;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Num");
		
		int num1  = input.nextInt();
		
		System.out.println("Enter Second Num");
		
		int num2  = input.nextInt();

		int sum = num1 + num2;
		
		float avg = sum/2;
		
		
		System.out.println("Sum of "+ num1 + "and "+ num2 +"is " +sum);
		
		System.out.println("Average of "+ num1 + "and "+ num2 +"is " +avg);

		

	}

}
