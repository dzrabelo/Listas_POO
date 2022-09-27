package Ex38;

public class Ex38 {

	public static void main(String[] args) {
		int soma = 0, ant = 0;
		for(int x = 1; x <= 100; x++) {
			soma = x + ant;
			System.out.printf("%d + %d = %d\n",x, ant, soma);
			ant = soma;
		}
		System.out.printf("A Soma dos intervalos entre 1 e 100 é = %d\n", soma);

	}

}
