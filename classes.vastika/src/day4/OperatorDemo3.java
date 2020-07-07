package day4;

public class OperatorDemo3 {
public static void main(String[] args) {
	//4.Logical Operator && || !
	System.out.println(true&&true);//true
	System.out.println(true&&false);//false
	System.out.println(false&&true);//false
	System.out.println(false&&false);//false
	System.out.println("===================");
	
	//Note Short-circuit logical operation takes place 
	System.out.println(true||true);//true
	System.out.println(true||false);//true
	System.out.println(false||true);//true
	System.out.println(false||false);//fasle
	System.out.println("===================");
	
	System.out.println(!true);//fasle
	System.out.println(!false);//true
}
}
