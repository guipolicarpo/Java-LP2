/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc35 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner ( System.in );
		
		int termos = 0, contador = 1;
		
		
		do {
			System.out.print("\nEntre com a quantidade de termos da sequencia: ");
			termos = ler.nextInt();
			
			if ( termos < 0 ) {
				System.out.println("\n\tErro! Valor invalido...");
			}
			
			if ( termos > 0 ) {
				while ( contador <= termos ) {
					
					System.out.print( contador + ", ");
					System.out.print( contador - (contador*2));
					
					if ( contador < termos ) {
						System.out.print( " , " );
					} else {
						System.out.print( ", ... " );
					}
					contador++;
				}
			}
			
		} while ( termos != 0 );
		
		System.out.println("\n\tFim do programa...\n");
		
	}
}

