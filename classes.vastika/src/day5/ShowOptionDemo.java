package day5;

import javax.swing.JOptionPane;

public class ShowOptionDemo {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		Object[] obj= {"Apple","Ball"};
		//int initialValue=0;
		JOptionPane.showOptionDialog(null, "Select the option", "Temperature", a, b, null, obj, null);
	}

}
