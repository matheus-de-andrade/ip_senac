package procedimentos_funcoes;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		numeros = preencherArray(numeros);
		imprimirArray(numeros);
		System.out.print("\nO total de pares");
	}
	static void imprimirArray(int[] numeros) {
		for(int i =0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "");
		}
		
	}
	static int[] preencherArray(int[] numeros) {
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("\nDigite o " + (i+1) + "º número: ");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();
		return numeros;
	}
}
