/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc3 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v;
		
		System.out.printf("Quantidade de vetores: ");
		v = ler.nextInt();
		
		int a[] = new int[v];
		
		int w = 0;
		
		while(w <= v-1){
			
			System.out.printf("\nValor do vetor " + w + ": ");
			a[w] = ler.nextInt();
			
			w++;
		}
		
		System.out.print("\n{");
		for(int c = 0; c <= v-1; c++){
			System.out.print(a[c] + ", ");
		}
		System.out.print("}");
		
	}
}

