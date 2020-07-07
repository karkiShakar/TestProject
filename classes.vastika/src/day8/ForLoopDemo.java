package day8;

import java.util.Scanner;

public class ForLoopDemo {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value");
	int n=input.nextInt();
	
	int total=0;
	for(int i=1;i<=n;i++) {
	
		total+=i;
	System.out.println(i);
	}
	System.out.println("total is: "+total);
	System.out.println("Exited fro for loop...");
	input.close();
}
}
