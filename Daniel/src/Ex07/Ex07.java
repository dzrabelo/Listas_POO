package Ex07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        double cotacao_dolar, valor_dolar,valor_real;

         System.out.printf("Conversor de dólar em real\n\n");

 System.out.printf("Digite a cotação do dolar: ");
 cotacao_dolar = entrada.nextDouble();

 System.out.printf("Digite o valor em dolar: ");
 valor_dolar = entrada.nextDouble();

 valor_real = cotacao_dolar * valor_dolar;

 System.out.printf("O Valor em reais é " + valor_real + "\n");

	}

}
