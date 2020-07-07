package day4;

public class OperatorDemo5 {
public static void main(String[] args) {
	//Ternary operatr
	//?
	//veryuseful 
	
	int a=5;
	int b=6;
	
	if(a>b) {
		
		
		System.out.println("a is greater than b");
	}
	else
	{
		System.out.println("b is greater then a");
	}
	System.out.println("=======================");
	//but we can write the same operation using ternary operator ? nad is very useful
	//we used 99%of the time because it is very handy 
	String s=(a>b)?"a is greater then b":"b is greater then a";
	System.out.println(s);
	System.out.println("=====================");

	String s1=(a<b)?"a is less than b":"b is less then a";
	System.out.println(s1);
	System.out.println("=====================");
	boolean r=(a>b)?true:false;
	System.out.println(r);
}
}
