package day6;

import javax.swing.JOptionPane;

public class ElseIfDemo1 {
public static void main(String[] args) {
	int marks=Integer.parseInt(JOptionPane.showInputDialog("Enter the marks"));
	if(marks>=90&& marks<=100) {
	System.out.println("Distinction");
	}else if(marks>=80&&marks<=89) {
	System.out.println("First Division.");
	}else if(marks>=70&&marks<=79) {
	System.out.println("Second Division.");
	}else if(marks>=60&&marks<=69) {
		System.out.println("Third Division");
	}else {
		System.out.println("Fail good luck next time. ");
	}
	}
}
