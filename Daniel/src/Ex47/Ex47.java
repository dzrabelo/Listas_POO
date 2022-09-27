package Ex47;

import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char opc = 'S';
		
		int N, i=1, f=0;
		
		while(opc != 'N') {
			
			System.out.println("Quantos Numeros deseja digitar? ");
			N = ler.nextInt();
			
			
			while(N > 20 || N < 0) {
				System.out.println("ERRO! Digite um numero menor que 50 e positivo");
				N = ler.nextInt();
			}
			
			i=N;
			
			
			while(i > 1) {
				
				
				N = N *(i-1); 
				

				i--;
									
			}
			
			
			System.out.printf("\nTotal: %d", N);
			
			
			System.out.println("\n\nDeseja continuar digite: 'S' ou 'N' para Sair ");
			opc = ler.next().charAt(0);
			
			
			
		}
			
		
		System.out.println("\n\nFim");

	}

}
