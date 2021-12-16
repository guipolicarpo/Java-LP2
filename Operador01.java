public class Operador01 {
	
	public static void main (String[] args) {
		int numero = 2, saida = 0;
		
		System.out.println( "Numero = " + numero);
		
		saida = numero++;
		//saida = ++numero;
		
		System.out.println( "Saida = " + saida);
		System.out.println( "Numero = " + numero);
	}
}

