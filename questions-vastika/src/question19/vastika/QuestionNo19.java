
package question19.vastika;

import java.util.Scanner;

public class QuestionNo19 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first side");
		
		int num1 = input.nextInt();
		
		System.out.println("Enter second side");
		
		int num2 = input.nextInt();
		
	System.out.println("Enter third side");
		
		int num3 = input.nextInt();
		
		
	
		if (num1 == num2 && num1 == num3) {
			System.out.println(" It is equilateral triangle " );
			
		}else if (num2==num1 || num2==num3 || num1==num3) {
				System.out.println(" It is isosceles triangle " );
		
		}else {
			System.out.println("It is normal triangle");
			
		}
			
		
		
	}
}
