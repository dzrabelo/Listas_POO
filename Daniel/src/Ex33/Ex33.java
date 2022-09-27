package Ex33;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char sexo;	
		
		System.out.println("Digite o sexo F ou M: ");
		sexo = ler.nextLine().charAt(0);
			
		
		while((sexo != 'M' && sexo != 'F')) {
			System.out.println("Digite o sexo F ou M: ");
			sexo = ler.nextLine().charAt(0);
		}
		System.out.println("Fim!");
		
		ler.close();

	}

}
