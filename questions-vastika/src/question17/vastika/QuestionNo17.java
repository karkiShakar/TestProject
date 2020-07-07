package question17.vastika;

import java.util.Scanner;

public class QuestionNo17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a  year");

		int num1 = input.nextInt();

		if (num1 % 4 == 0) {
			if (num1 % 100 == 0) {
				if (num1 % 400 == 0) {
					System.out.println(num1 + " is Leap Year ");
				} else {
					System.out.println(num1 + " is not Leap Year ");
				}
			} else {
				System.out.println(num1 + " is a Leap Year ");
			}

		} else {

			System.out.println(num1 + " is not Leap Year ");

		}

	}
}
