package Ex46;

import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int N, num, MaiorVal=0, MenorVal=1000, Soma=0, media=0, i=1;
		float porcent=0, porcentNeg=0;
		char opc = 'S';
		
		while(opc != 'N') {
			
			System.out.println("Quantos Numeros deseja digitar? ");
			N = ler.nextInt();
			
			
			while(N > 20 || N < 0) {
				System.out.println("ERRO! Digite um numero menor que 50 e positivo");
				N = ler.nextInt();
			}
			
			i=1;
			float v[] = new float[N];
			
			while(i <= N) {
				
				System.out.printf("Digite um numero inteiro: ");
				num = ler.nextInt();
				
				Soma+=num;//Soma dos valores
			

				if(num > 0) {
					porcent += num;
				}
				
				if(num < 0) {
					porcentNeg += num;
				}
				
				if(MaiorVal < num) {
					MaiorVal = num;
				}
				
				if(num < MenorVal) {
					MenorVal = num;
				}
					
				
				i++;
				
			}
			media = Soma/N; //Média 
			System.out.printf("\nMaior valor: %d",MaiorVal);
			System.out.printf("\nMenor valor: %d",MenorVal);
			System.out.printf("\nSoma dos Valores: %d", Soma);
			System.out.printf("\nMedia: %d", media);
			System.out.printf("\nPorcentagem: %.2f", porcent/100);
			System.out.printf("\nPercentual negativo: %.2f", porcentNeg/100);
			
			System.out.println("\n\nDeseja continuar digite: 'S' ou 'N' para Sair ");
			opc = ler.next().charAt(0);
			
			
			
		}
			
		
		System.out.println("\n\nFim");

	}

}
