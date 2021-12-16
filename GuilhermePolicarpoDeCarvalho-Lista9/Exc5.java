/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc5 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 0, m = 0;
		
		do{
			System.out.print("Entre com a dimensao de linhas: ");
			n = ler.nextInt();
			
			if(n < 1){
				System.out.print("\nO valor precisa ser igual o maior a 1!\n");
			}
			
		}while(n < 1);
		
		do{
			System.out.print("Entre com a dimensao de colunas: ");
			m = ler.nextInt();
			
			if(m < 1){
				System.out.print("\nO valor precisa ser igual o maior a 1!\n");
			}
			
		}while(m < 1);
		
		
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int[][] c = new int[n][m];
		
		System.out.print("\nMATRIZ A\n");
		for(int linha = 0; linha < a.length; linha++){
			
			for(int coluna = 0; coluna < a[linha].length; coluna++){
				a[linha][coluna] = (int)(Math.random() * 100);
				System.out.print(a[linha][coluna] + " ");
				
				c[linha][coluna] = a[linha][coluna];
			}
			System.out.println();
		}
		
		System.out.print("\nMATRIZ B\n");
		for(int linha = 0; linha < b.length; linha++){
			
			for(int coluna = 0; coluna < b[linha].length; coluna++){
				b[linha][coluna] = (int)(Math.random() * 100);
				System.out.print(b[linha][coluna] + " ");
				
				c[linha][coluna] += b[linha][coluna];
			}
			System.out.println();
		}
		
		System.out.print("\nMATRIZ C\n");
		for(int linha = 0; linha < c.length; linha++){
			
			for(int coluna = 0; coluna < c[linha].length; coluna++){
				System.out.print(c[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}

