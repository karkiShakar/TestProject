package day9;

public class NestedLoopDemo {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=i;j++) {
			System.out.println(i+" "+j);
		}
		System.out.println();
	}
	System.out.println("exit from nested loop");
}
}
