package day4;

public class OperatorDemo4 {
public static void main(String[] args) {
	//Increament /Decrement Operator
	//++ --
	// post increment i++ --- first operation then increment 
	//pre increment ++i--- first increment and operation 
	//a++ ++a a-- --a
	int a=3;
	System.out.println(a);
	++a;
	System.out.println(a);
	int x=5;
	System.out.println(x);//5
	System.out.println(x++);//5 first operation then increment operation is to print
	System.out.println(x);//6
	
	int i=4;
	int j=i++;
	System.out.println(i);//5
	System.out.println(j);//4
	
	int m=5;
	m=(m++)+(++m)+m+1;//5+7+7+1
	System.out.println(m);
	
}
}
