package day7;

import java.util.Scanner;

public class SwitchCaseDemo2 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Enter the choices");
	char choice =input.next().charAt(0);
	switch(choice) {
	case '+':
		System.out.println("This is addition");
		break;
	case '-':
		System.out.println("This is subtraction");
		break;
	case '*':
	System.out.println("This is multiplication");
		break;
	case '/':
		System.out.println("This is division");
		break;
	default:
		System.out.println("you have enter the wrong character");
			break;
			
	

	}
	
}
}
