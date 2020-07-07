package day11;

public class ObjectDemo2 {
	String name;
	int age;
	
public static void main(String[] args) {
	//printing object IDs of diff types of object creation
	System.out.println(new ObjectDemo2());
	
	ObjectDemo2 objec1 = new ObjectDemo2();
	
	System.out.println(objec1);
	
	ObjectDemo2 objec2;
	
	objec2  = new ObjectDemo2();
	
	System.out.println(objec2);
	
	
}
}
