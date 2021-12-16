public class OperadorTernario {
	
	public static void main (String[] args) {
		String mensagem = "O número é: ";
		int numero = 11;
		numero %= 2;
		
		System.out.println(mensagem += (numero == 0) ? "Par" : "Impar");
	}
}

