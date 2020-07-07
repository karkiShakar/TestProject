package day11;

public class Test {
public static void main(String[] args) {
	
	StaticNonStaticDemo2 obj2  = new StaticNonStaticDemo2();
	
	obj2.printInfo("shakar", 2345);
	
	StaticNonStaticDemo2.greet();
	
	System.out.println(obj2.nonStaticVar);
	
	System.out.println(StaticNonStaticDemo2.staticVar);
}
}
