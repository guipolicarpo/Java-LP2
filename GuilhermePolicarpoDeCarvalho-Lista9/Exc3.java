/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc3 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 0;
		
		do{
			System.out.print("Entre com a dimensao da matriz quadrada: ");
			n = ler.nextInt();
			
			if(n < 1 || n > 20){
				System.out.print("\nO valor precisa ser de 1 a 20!\n");
			}
			
		}while(n < 1 || n > 20);
		
		int[][] c = new int[n][n];
		
		for(int linha = 0; linha < c.length; linha++){
			
			for(int coluna = 0; coluna < c[linha].length; coluna++){
				c[linha][coluna] = (int)(Math.random() * 100);
				System.out.print(c[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}

