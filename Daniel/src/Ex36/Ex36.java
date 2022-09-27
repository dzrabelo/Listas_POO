package Ex36;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	       
        int num, num2, t, i;
       
        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
        
        System.out.printf("Digite o número que deseja começar a contagem ");
        num2 = ler.nextInt();
        
        while(num <= 0) {
            System.out.printf("Erro, número negativo! Digite um número positivo: ");
            num = ler.nextInt();
       
        }
        
      
       
	        for (i=num2; i>=1; i--) {
	           
	            t = num * i;
	            System.out.printf("\n%d X %d = %d", num, i, t);
	        }

	}

}
