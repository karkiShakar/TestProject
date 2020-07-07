
package question21.vastika;

import java.util.Scanner;

public class QuestionNo21 {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
	System.out.println("Enter First Number");

	int num1 = input.nextInt();

	switch(num1) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturaday");
		break;
	case 7:
		System.out.println("Sunday");
		break;

		default:
				System.out.println("please enter the rigth choice");
				break;
				
	}
	}
}
