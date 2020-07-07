package question11.vastika;

public class QuestionNo11 {
	
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		
		
		System.out.println("After swapping, Using Temp.....");
		System.out.println("First Number is "+ a);
		System.out.println("Second Number is "+ b);
		
		
		swapUsingTemp (a,b);
		swapWithoutTemp(a,b);	
	}
	
	



	
	private static void swapUsingTemp(int k, int l) {
		int temp;
		temp = k;
		k = l;
		l = temp;
		
		System.out.println("After swapping, Using Temp.....");
		System.out.println("First Number is "+ k);
		System.out.println("Second Number is "+ l);
		
	}
	
	private static void swapWithoutTemp(int p, int r) {
		
		p = p + r;
		
		r = p - r;
		
		p = p - r;
		
		System.out.println("After swapping, without Temp.....");
		System.out.println("First Number is "+ p);
		System.out.println("Second Number is "+ r);
				
	}
	
}
