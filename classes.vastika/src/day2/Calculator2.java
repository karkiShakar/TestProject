package day2;

import javax.swing.JOptionPane;

public class Calculator2 {
public static void main(String[] args) {
	int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));
	int sum =a+b;
	int sub=a-b;
	int mul=a*b;
	int div=a/b;
	
	JOptionPane.showMessageDialog(null, "Sum of "+a+" and "+b+" is: "+sum);
	JOptionPane.showMessageDialog(null, "Sub of "+a+" and "+b+" is: "+sub);
	JOptionPane.showMessageDialog(null, "Mul of "+a+" and "+b+" is: "+mul);
	JOptionPane.showMessageDialog(null, "Div of "+a+" and "+b+" is: "+div);

}
}
