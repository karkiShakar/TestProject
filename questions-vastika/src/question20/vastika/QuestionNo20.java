
package question20.vastika;

import java.util.Scanner;

public class QuestionNo20 {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the choices: ");
	String choice=input.nextLine();

	System.out.println("Enter First Number");

	int num1 = input.nextInt();

	System.out.println("Enter another Number");

	int num2 = input.nextInt();

	switch(choice) {
	case "Add":
	case "add":
	case "+":
		System.out.println("This is addition and result is "+(num1+num2));
		break;
	case "Sub":
	case"sub":
	case"-":
		System.out.println("This is subtraction"+(num1-num2));
		break;
	case "Mul":
	case "mul":
	case "*":
		System.out.println("This is multplication"+(num1*num2));
		break;
	case "Div":
	case "div":
	case "/":
			System.out.println("This is division"+(num1/num2));
			break;
	default:
				System.out.println("please enter the rigth choice");
				break;
		}
			
		
		
	}
}
