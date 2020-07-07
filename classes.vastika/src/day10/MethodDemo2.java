package day10;

public class MethodDemo2 {
	
	public String greet() {
		
		String message = "Hello, Good Morning";
		
		return message;
	}
public int findMax (int a, int b) {
	int max = a;
	
	if(b>max) {
		max = b;
	}else {
		max = a;
	}
	return max;
}
	public static void main(String[] args) {
		
		MethodDemo2 obj = new MethodDemo2();
		
		
		String out = obj.greet();
		System.out.println(out);
		
		int maximum  = obj.findMax(55, 22);
		
		System.out.println("Max is "+maximum);
		
	}
}
