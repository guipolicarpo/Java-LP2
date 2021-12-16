/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc7 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 0, m = 0, maior = 0, menor = 0, linhaMaior = 0, colunaMaior = 0, linhaMenor = 0, colunaMenor = 0;
		
		do{
			System.out.print("Entre com a dimensao de linhas: ");
			n = ler.nextInt();
			
			if(n < 1){
				System.out.print("\nO valor precisa ser maior que 1!\n");
			}
			
		}while(n < 1);
		
		do{
			System.out.print("Entre com a dimensao de colunas: ");
			m = ler.nextInt();
			
			if(m < 1){
				System.out.print("\nO valor precisa ser maior que 1!\n");
			}
			
		}while(m < 1);
		
		
		int[][] e = new int[n][m];
		
		for(int linha = 0; linha < e.length; linha++){
			
			for(int coluna = 0; coluna < e[linha].length; coluna++){
				e[linha][coluna] = (int)(Math.random() * 100);
				System.out.print(e[linha][coluna] + " ");
			}
			
			System.out.println();
		
		}
		
		maior = menor = e[0][0];
		
		System.out.print("\nElementos maior e menor: \n");
		for(int linha = 0; linha < e.length; linha++){
			
			for(int coluna = 0; coluna < e[linha].length; coluna++){
				if(e[linha][coluna] > maior){
					maior = e[linha][coluna];
					linhaMaior = linha;
					colunaMaior = coluna;
				}
				
				if(e[linha][coluna] < menor){
					menor = e[linha][coluna];
					linhaMenor = linha;
					colunaMenor = coluna;
				}
			}		
			
		}
		
		System.out.println("Maior elemento: " + maior + " na posicao [" + linhaMaior + "][" + colunaMaior + "]");
		System.out.println("Menor elemento: " + menor + " na posicao [" + linhaMenor + "][" + colunaMenor + "]");
		
		
		

	}
}

