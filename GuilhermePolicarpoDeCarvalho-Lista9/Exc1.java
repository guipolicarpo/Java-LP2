/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc1 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[][] a = new int[4][5];
		
		for(int linha = 0; linha < 4; linha++){
			
			for(int coluna = 0; coluna < 5; coluna++){
				System.out.printf("Entre com um numero: ");
				a[linha][coluna] = ler.nextInt();
			}
		}
		
		for(int linha = 0; linha < 4; linha++){
			
			for(int coluna = 0; coluna < 5; coluna++){
				System.out.print("\n" + a[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}

