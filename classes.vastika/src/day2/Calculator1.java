package day2;
import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a:");
	int a= input.nextInt();
	System.out.println("Enter b:");
	int b= input.nextInt();
	
	
	int sum =a+b;
	int sub=a-b;
	int mul=a*b;
	int dev=a/b;
System.out.println("Sum of "+a+" and "+b+" is: "+sum);
System.out.println("Sub of "+a+" and "+b+" is: "+sub);	
System.out.println("mul of "+a+" and "+b+" is: "+mul);
System.out.println("div of "+a+" and "+b+" is: "+dev);
	}

}
