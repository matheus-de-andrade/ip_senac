package exercicio_estrutura_repeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		double numneg = 0;
		double num;
		do {
			System.out.print("Digite o " + i + "° número: ");
			num = teclado.nextDouble();
			if (num < 0) {
				numneg++;
			}
			i++;
		}while(i <= 10);
		System.out.print("A quantidade de números negativos é de: " + numneg);

	}
}