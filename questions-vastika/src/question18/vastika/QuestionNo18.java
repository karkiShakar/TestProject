package question18.vastika;

import java.util.Scanner;

public class QuestionNo18 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		int num1 = input.nextInt();
		
		System.out.println("Enter second number");
		
		int num2 = input.nextInt();
		
	System.out.println("Enter third number");
		
		int num3 = input.nextInt();
		
		
	
		if (num1>num2 && num1>num3) {
			System.out.println(num1 +" is the largest " );
			
		}else if (num2>num1 && num2>num3) {
				System.out.println(num2 +" is the largest " );
		
		}else {
			System.out.println(num3 +" is the largest " );
			
		}
			
		
		
	}
}
