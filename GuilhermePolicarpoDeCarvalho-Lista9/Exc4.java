/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc4 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 0, m = 0, e = 0;
		
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
		
		do{
			System.out.print("Tamanho maximo dos elementos: ");
			e = ler.nextInt();
			
			if(e < 1){
				System.out.print("\nO valor precisa ser igual o maior a 1!\n");
			}
			
		}while(e < 1);
		
		int[][] d = new int[n][m];
		
		for(int linha = 0; linha < d.length; linha++){
			
			for(int coluna = 0; coluna < d[linha].length; coluna++){
				d[linha][coluna] = (int)(Math.random() * (e + 1));
				System.out.print(d[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}

