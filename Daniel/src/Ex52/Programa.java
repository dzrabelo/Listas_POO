package Ex52;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 

		 

		Produto[] listaProduto = new Produto[10]; 

		 

		for (int i=0; i<=2; i++) { 

		 

		Produto x = new Produto(); 

		 

		System.out.printf("Digite id do Produto: "); 

		x.id = ler.nextInt(); 

		 

		System.out.printf("Digite descrição do Produto: "); 

		x.descricao = ler.next(); 

		 

		System.out.printf("Digite valor do Produto: "); 

		x.valor = ler.nextDouble(); 

		 

		System.out.printf("Digite quantidade do Produto: "); 

		x.quantidade = ler.nextDouble(); 

		 

		listaProduto[i] = x; 

		} 

		 

		for (int i=0; i<=2; i++) { 

		 

		if (listaProduto[i].valor <= 100); 

		 

		            System.out.printf("\nProduto %d incluido com sucesso (%s, %.2f, %.2f)!", listaProduto[i].id, listaProduto[i].descricao, listaProduto[i].valor, listaProduto[i].quantidade); 

		} 

	}

}
