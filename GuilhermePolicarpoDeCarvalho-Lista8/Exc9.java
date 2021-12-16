/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;

public class Exc9 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		int g[] = new int[5];
		int pares = 0;
		
		for ( int i = 0 ; i < g.length ; i++ ) {
			System.out.print("Entre com um numero: ");
			g[i] = leia.nextInt();
			
			if ( g[i] % 2 == 0 ) {
				pares++;
			}
		}
		
		if ( pares == 0 ) {
			
			System.out.println("\n\tNao tem elementos pares\n");
			
		} else {
		
			int[] h = new int[pares];
			
			for ( int i = 0, j = 0 ; i < g.length ; i++ ) {
				
				if ( g[i] % 2 == 0 ) {
					
					h[j] = g[i];
					
					j++;
				}
			}
			
			
			System.out.print("\nElementos pares: ");
			
			for ( int i = 0 ; i < h.length ; i++ ) {
			
				System.out.print( h[i] + " ");
			}
			
		}
		
		System.out.println("\n\tFim do programa\n");
	}
}

