package Ex44;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, MaiorVal=0, Soma=0,media=0,i=1;
		
		while(i <= 10) {
			
			System.out.printf("Digite um numero inteiro: ");
			num = ler.nextInt();
			Soma+=num;
		
			
			if(MaiorVal < num) {
				MaiorVal = num;
			}
				
				
			
			i++;
			
		}
		media = Soma/10;
		System.out.printf("\nMaior valor: %d",MaiorVal);
		System.out.printf("\nSoma dos Valores: %d", Soma);
		System.out.printf("\nMedia: %d", media);
		}

	}
