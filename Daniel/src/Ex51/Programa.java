package Ex51;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 

	    Cliente[] listaPessoa = new Cliente[5]; 

	        for (int i=0; i<=4; i++) { 

	        	Cliente p = new Cliente(); 

	            System.out.printf("Digite o id da pessoa: "); 

	            p.id = ler.nextInt(); 

	            System.out.printf("Digite o nome da pessoa: "); 

	            p.nome = ler.next(); 

	            System.out.printf("Digite a idade da pessoa: "); 

	            p.idade = ler.nextInt(); 

	            System.out.printf("Digite o email da pessoa: "); 

	            p.email = ler.next(); 

	            listaPessoa [i] = p;             

	       } 

	       for (int i=0; i<=4; i++) { 

	        	if (listaPessoa[i].idade >=18) 

	            System.out.printf("\nPessoa %d criada com sucesso (%s, %d, %s)!", listaPessoa[i].id, listaPessoa[i].nome, listaPessoa[i].idade, listaPessoa[i].email); 
	       }

	}

}
