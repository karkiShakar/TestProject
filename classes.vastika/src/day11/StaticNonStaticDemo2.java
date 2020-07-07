package day11;

//import day10.StaticNonStaticDemo1;

public class StaticNonStaticDemo2 {
	// nonstatic is object member's data....instance variable, attribute, property,
	// datat
	String nonStaticVar = "This is not static variable";
	// class member
	static String staticVar = "This is static variable";

	// class level behaviour
	public static void greet() {

		System.out.println("Hello");
		System.out.println("Good Morning");
	}

	// void method printInfo() with 2 arguments
	// object member's behaviour
	public void printInfo(String name, long mobileNo) {

		System.out.println("The name is " + name);
		System.out.println("The mobileNo is " + mobileNo);

	}

	public static void main(String[] args) {
		// to use greet();....the method has to be static because main() is static

		greet();

		// better way to call greet() is :
		StaticNonStaticDemo2.greet();

		// printInfo() can only be used by creating object as it has no static method

		StaticNonStaticDemo2 ob1 = new StaticNonStaticDemo2();

		ob1.printInfo("Karki", 223344);

		// to call non static variable:

		System.out.println(ob1.nonStaticVar);

		// to call static variable:

		System.out.println(StaticNonStaticDemo2.staticVar);

	}
}
