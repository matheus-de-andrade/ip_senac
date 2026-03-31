package exercicio_estrutura_repeticao;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double num1 = teclado.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = teclado.nextDouble();
		while (num2 == 0) {
			System.out.print("Valor inválido, tente outro número: ");
			num2 = teclado.nextDouble();
		}
		System.out.print(num1 + " / " + num2 + " = " + num1/num2);
		teclado.close();
}
	
}