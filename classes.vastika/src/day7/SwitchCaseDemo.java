package day7;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		//Object[] y=JOptionPane.showInternalInputDialog(null, "Enter the choices", "title", 1, "icon", "1", "1");
		String x= JOptionPane.showInputDialog("Enter the choice");
		int choice=Integer.parseInt(x);
	if(x!=null) {
		switch(choice) {
		case 1:
			JOptionPane.showMessageDialog(null, "This is addition");
			break;
	
		case 2:
			JOptionPane.showMessageDialog(null, "This is subtraction");
			break;
		
		case 3:
			JOptionPane.showMessageDialog(null, "This is multilication");
			break;
		case 4:
	
			JOptionPane.showMessageDialog(null, "This is division");
			break;
	default:
		JOptionPane.showMessageDialog(null, "Please enter the right choice");
		break;	
		}
	  }
	}

}
