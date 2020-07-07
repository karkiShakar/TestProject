package question15.vastika;

import java.util.Scanner;

public class QuestionNo15 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ASCII code between 0-128");
		
		int num1 = input.nextInt();
		
		
		char equivAsci = (char)num1;
		
		System.out.println(equivAsci);
		
		
	}
}
