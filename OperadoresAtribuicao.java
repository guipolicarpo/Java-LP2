public class OperadoresAtribuicao {
	
	public static void main (String[] args) {
		int a, b, c;
		
		a= 4;
		b= 2;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		c= a;	
		System.out.println("C = A = " + c);
		
		c += a;	
		System.out.println("C += A = " + c);
		
		c -= b;	
		System.out.println("C -= B = " + c);
		
		c *= b;	
		System.out.println("C *= B = " + c);
		
		c /= a;	
		System.out.println("C /= A = " + c);
		
		c %= b;	
		System.out.println("C %= B = " + c);					
	}
}

