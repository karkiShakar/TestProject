package day11;

public class ObjectDemo3 {
public static void main(String[] args) {
	System.out.println(new ObjectDemo3().hashCode());
	
	ObjectDemo3 object1  = new ObjectDemo3();
	
	System.out.println(object1.hashCode());
	
	ObjectDemo3 object2;
	
	object2 = new ObjectDemo3();
	
	System.out.println(object2.hashCode());
	
	System.out.println("from compiler "+object2);
	
	System.out.println("day11.ObjectDemo3@"+Integer.toHexString(object2.hashCode()));
}
}
