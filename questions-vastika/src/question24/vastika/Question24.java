package question24.vastika;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");

		int num = input.nextInt();

		int fact = 1;

		for (int i = 2; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

}
