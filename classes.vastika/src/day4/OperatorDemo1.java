package day4;

public class OperatorDemo1 {
	public static void main(String[] args) {
		//1.Arithmetic Operator +,-,/,%
		//Priority + - (low) * / % (high)
		//Associativity left to right
		
		
		int a = 4+5 -4/2+3*4-7%3;
		System.out.println(a);
		
		//2.Assignment Operator = += -= *= %=
		//Associativity Right to Left
		int i=4;
		System.out.println(i);
		//i=i+4;
		i+=4;//this is called shorted assignment operator
		System.out.println(i);
	}

}
