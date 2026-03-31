package exercicio_estrutura_repeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		double numpar = 0;
		double num;
		do {
			System.out.print("Digite o " + i + "° número: ");
			num = teclado.nextDouble();
			if (num % 2 == 0) {
				numpar++;
			}
			i++;
		}while(i <= 10);
		System.out.print("A quantidade de números pares é de: " + numpar);
		teclado.close();
	}

}
