public class OperadoresComparacao {
	
	public static void main (String[] args) {
		int a=4, b=4;
		boolean c;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		c= (a==b);	
		System.out.println("A == B? = " + c);
		
		c= (a>b);	
		System.out.println("A > B? = " + c);
		
		c= (a>=b);	
		System.out.println("A >= B? = " + c);	
		
		c= (a<b);	
		System.out.println("A < B? = " + c);
		
		c= (a<=b);	
		System.out.println("A <= B? = " + c);
		
		c= (a!=b);	
		System.out.println("A ! B? = " + c);				
	}
}

