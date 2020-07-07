package question13.vastika;

import java.util.Scanner;

public class QuestionNo13 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a negative number");
		
		String sign = input.nextLine();
		
		int number = Integer.parseInt(sign);
		
		if (number < 0) {
			System.out.println(sign);
			
		}
		
		
	}
}
