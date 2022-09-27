package Ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
	      int base , altura, soma;
	       System.out.printf("Digite a altura: ");
	      altura = ler.nextInt();

	      System.out.printf("Digite a base : ");
	      base = ler.nextInt();

	      soma = base+ altura;

	      System.out.printf("A soma é : %d", soma);

	}

}
