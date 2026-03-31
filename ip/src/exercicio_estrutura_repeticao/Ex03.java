package exercicio_estrutura_repeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número entre 1 e 10 para tabuada: ");
		int num = teclado.nextInt();
		while (num < 1 && num > 10) {
			System.out.print("Número inválido, tente um número entre 1 e 10");
			num = teclado.nextInt();
		}
		for(int i = 1; i <=10; i++) {
			System.out.print( num + " * " + i + " = " + num * i);
		}
		teclado.close();
	}

}
