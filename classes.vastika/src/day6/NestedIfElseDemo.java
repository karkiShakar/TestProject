package day6;

public class NestedIfElseDemo {
public static void main(String[] args) {
	int a=5;
	int b=6;
	int c=7;
	if(a>b) {
		if(a>c) {
			System.out.println("a is the largest one");
		}else {
			System.out.println("c is largest one");
		}
	}else {
		System.out.println("a is smaller than b greater than c.");
	}
System.out.println("more code");
System.out.println("exit");
}

}
