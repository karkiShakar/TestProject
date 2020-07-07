package day10;

import java.util.Scanner;

public class MethodDemo1 {
	
	//method greet() with no arguments
	public void greet() {
		
		System.out.println("Hello");
		System.out.println("Good Morning");
	}
	//void method printInfo() with 2 arguments
	
	public void printInfo(String name, long mobileNo) {
		
		System.out.println("The name is " + name);
		System.out.println("The mobileNo is " + mobileNo);
		
	}

	public static void main(String[] args) {
		
		MethodDemo1 ob = new MethodDemo1();
		
		//method calling
		ob.greet();
		
		ob.printInfo("Shakar", 22544355);
		
		
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your name:");
		String name1 = input.next();
		
		
		System.out.println("Enter your Mobile no");
		long mobileNo1 = input.nextLong();
		
		
		
		ob.printInfo(name1, mobileNo1);
		
		
		System.out.println("Main End");
	}

}
