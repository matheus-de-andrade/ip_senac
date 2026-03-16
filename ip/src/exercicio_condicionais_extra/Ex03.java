package exercicio_condicionais_extra;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um ano: ");
		int ano = teclado.nextInt();
		if ((ano % 4) == 0) {
			System.out.print("É um ano bissexto!!");
		}
		else {
			System.out.print("Não é um ano bissexto");
		}
		teclado.close();
	}

}
