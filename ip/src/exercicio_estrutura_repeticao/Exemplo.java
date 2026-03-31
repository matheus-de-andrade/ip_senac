package exercicio_estrutura_repeticao;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número para a tabuada: ");
		int num = teclado.nextInt();
		System.out.println(num + " X 1 = " + 1 * num);
		System.out.println(num + " X 2 = " + 2 * num);
		System.out.println(num + " X 3 = " + 3 * num);
		System.out.println(num + " X 4 = " + 4 * num);
		System.out.println(num + " X 5 = " + 5 * num);
		System.out.println(num + " X 6 = " + 6 * num);
		System.out.println(num + " X 7 = " + 7 * num);
		System.out.println(num + " X 8 = " + 8 * num);
		System.out.println(num + " X 9 = " + 9 * num);
		System.out.println(num + " X 10 = " + 10 * num);
		System.out.println("\n------------------------------------\n");
		for (int i = 1; i < 11; i++) {
			System.out.println(num + " * " + i + " = " + i * num);
		}
		teclado.close();
	}

}
