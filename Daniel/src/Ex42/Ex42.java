package Ex42;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int N, num=1, den=2,x=0;
		float soma=0, somaden=0;
				
				System.out.println("Entre com o valor menor que 50 positivo, para exibir a soma da sequencia: ");
				N = ler.nextInt();
				
				while(N > 50 || N < 0) {
					System.out.println("ERRO! Digite um numero menor que 50 e positivo");
					N = ler.nextInt();
				}
				
				
				while(x < N){
					
					
					System.out.printf("%d / %d  ,  ", num, den);
					num++;
					den++;
					
					
					
					x++;
					
				}
				
				soma+=num;
				somaden+=den;
				
				System.out.println("\n\nVALOR TOTAL DA SOMA: ");
				System.out.printf("Total = %.0f / %.0f", soma, somaden);

	}

}
