package Ex48;

import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num=0, i=0;
		
		System.out.printf("Digite um numero: ");
		num = ler.nextInt();
		
		i=num;
		num+=20;
		
		
		while(i != num) {
			
			
			System.out.printf(" %d ", i);
			
			i++;
		}

	}

}
