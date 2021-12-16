/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc2 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[][] b = new int[3][6];
		
		for(int coluna = 0; coluna < b.length; coluna++){
			
			for(int linha = 0; linha < b[coluna].length; linha++){
				b[coluna][linha] = (int)(Math.random() * 100);
				System.out.print(b[coluna][linha] + " ");
			}
			System.out.println();
		}
		
	}
}

