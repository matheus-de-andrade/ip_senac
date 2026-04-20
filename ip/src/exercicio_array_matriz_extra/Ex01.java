package exercicio_array_matriz_extra;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] quartos = new int[10];
		int numQuartos = 0;
		int quartos3 = 0;
		for(int i = 0; i < quartos.length; i++) {
			System.out.print("Quantos quartos a no apartamento " + (i + 1) + ": ");
			quartos[i] = teclado.nextInt();
			numQuartos += quartos[i];
			if(quartos[i] == 3) {
				quartos3++;
			}
		}
		System.out.print("\n-- Informações --\n\nNúmero de quartos: 10\nQuantidade total de quartos: " + numQuartos + "\nApartamentos com 3 quartos: " + quartos3);
		teclado.close();
	}

}
