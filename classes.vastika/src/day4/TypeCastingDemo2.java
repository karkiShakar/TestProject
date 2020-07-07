package day4;

public class TypeCastingDemo2 {
public static void main(String[] args) {
	//implicit typeCasting--by compiler
	byte b=100;
	short s=b;
	int i=s;
	long l=i;
	float f=l;
	double d=f;
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println("============");
	}
}
