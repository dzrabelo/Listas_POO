package Ex41;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int N, soma=0, i=0,x=0, NumAnt=2, NumSeq=1;
		
		System.out.printf("Entre com o valor menor que 100 para exibir a soma da sequencia: ");
		N = ler.nextInt();
		
		while(N > 100) {
			System.out.println("ERRO! Digite um numero menor que 100");
			N = ler.nextInt();
		}
		
		
		while(x < N){
			
	
			System.out.printf("%d ", NumAnt);
			soma += NumAnt;
			NumSeq +=2;
			NumAnt += NumSeq;
			
			
			x++;
			
		}
		
		System.out.println("\n\nVALOR TOTAL DA SOMA: ");
		System.out.printf("Total = %d", soma);
	  }

	}
