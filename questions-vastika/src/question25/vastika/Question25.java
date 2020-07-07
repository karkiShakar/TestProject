package question25.vastika;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students:");

		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Enter a number ");

			int num1 = input.nextInt();

			int fact = fact * i;

		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

}
