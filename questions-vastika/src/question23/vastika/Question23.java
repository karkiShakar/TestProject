package question23.vastika;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");

		int num = input.nextInt();

		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum = sum + i;

		}
		System.out.println("Sum of 1 to " + num + " is " + sum);
	}

}
