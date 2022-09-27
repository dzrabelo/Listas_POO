package Ex05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit;

		System.out.print("Conversor de temperatura: Graus Celsius ->Fahrenheit\n\n");
		System.out.printf("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();

		Fahrenheit = ( 9 * Celsius + 160 ) / 5;
                            System.out.print(" A medida convertida é " + Fahrenheit + "ºF");

	}

}
