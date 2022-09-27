package Ex37;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,y;
		for(x = 1; x <= 20; x++) {
			System.out.printf("Tabuado do %d\n", x);
			for(y = 1; y <= 10; y++) {
				System.out.printf("%d X %d = %d\n", y, x, (y*x));
			}
		System.out.println("Aperte Enter para continuar\n");
		ler.nextLine();
		}

	}

}
