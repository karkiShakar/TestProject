package day8;

import java.util.Scanner;

public class WhileLoopDemo2 {
public static void main(String[] args) {
	boolean flag=true;
	
	Scanner inpput =new Scanner(System.in);

	
	while(flag) {
		System.out.print("Enter the name: ");
		String name =inpput.nextLine();
		
		
		System.out.println("Name is: "+name);
		if(name.equals("lakpa")) {
			flag=false;
		}
		System.out.println("exit fro the loop");
		inpput.close();
	}
}
}
