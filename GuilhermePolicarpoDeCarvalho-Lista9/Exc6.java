/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc6 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 0, m = 0, numero = 0, contador = 0;
		
		do{
			System.out.print("Entre com a dimensao de linhas: ");
			n = ler.nextInt();
			
			if(n < 1 || n > 25){
				System.out.print("\nO valor precisa ser de 1 a 25!\n");
			}
			
		}while(n < 1 || n > 25);
		
		do{
			System.out.print("Entre com a dimensao de colunas: ");
			m = ler.nextInt();
			
			if(m < 1 || n > 25){
				System.out.print("\nO valor precisa ser de 1 a 25!\n");
			}
			
		}while(m < 1 || n > 25);
		
		
		int[][] a = new int[n][m];
		
		System.out.printf("Entre com um numero para verificar se existe na matriz: ");
		numero = ler.nextInt();
		
		System.out.print("\nMATRIZ A\n");
		for(int linha = 0; linha < a.length; linha++){
			
			for(int coluna = 0; coluna < a[linha].length; coluna++){
				a[linha][coluna] = (int)(Math.random() * 100);
				System.out.print(a[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.print("\nProcurando o numero: " + numero + " \n");
		for(int linha = 0; linha < a.length; linha++){
			
			for(int coluna = 0; coluna < a[linha].length; coluna++){
				
				if(a[linha][coluna] == numero){
					System.out.print("Linha: " + linha + ", Coluna: " + coluna);
					contador++;
				}
			}
		}
		
		System.out.println("O numero foi encontrado: " + contador + " vez(es).");
		

	}
}
