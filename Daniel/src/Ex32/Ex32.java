package Ex32;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, num2;
		
		System.out.println("Digite um numero: ");
		num = ler.nextInt();
		
		System.out.println("Digite um segundo numero maior que o primeiro: ");
		num2 = ler.nextInt();
		
		if(num < num2) {
			
			System.out.printf("Você Digitou corretamente num: %d num2: %d ",num, num2);
			
		}else{
			
			System.out.println("Digite um segundo numero maior que o primeiro ");
			num2 = ler.nextInt();
			System.out.printf("Você digitou: num: %d, num2 %d", num, num2);
		}

	}

}
