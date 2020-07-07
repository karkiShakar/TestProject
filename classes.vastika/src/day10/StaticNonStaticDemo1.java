package day10;

public class StaticNonStaticDemo1 {
public static void  greet() {
		
		System.out.println("Hello");
		System.out.println("Good Morning");
	}
	//void method printInfo() with 2 arguments
	
	public void printInfo(String name, long mobileNo) {
		
		System.out.println("The name is " + name);
		System.out.println("The mobileNo is " + mobileNo);
		
	}
	
	public static void main(String[] args) {
		//to use greet();....the method has to be static because main() is static
		
		greet();
		
		//printInfo() can only be used by creating object as it has no static method
		
		StaticNonStaticDemo1 ob1  = new StaticNonStaticDemo1();
		
		
		ob1.printInfo("Karki", 223344);
		
		
	}
}
