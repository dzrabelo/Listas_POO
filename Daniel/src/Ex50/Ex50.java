package Ex50;

import java.util.Scanner;

public class Ex50 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num=0, numf=0, i=0;
		
		System.out.printf("Digite um numero inicial: ");
		num = ler.nextInt();
		
		do {
		
		System.out.printf("Digite um numero final tem que ser maior que o inicial: ");
		numf = ler.nextInt();
		
		}while(num > numf);
		
		i=num;
		
		while(i != numf) {
			
			if(i%2==0 && i>10) {
				System.out.printf(" %d ", i);
			}
			
			i++;
		}

	}

}
