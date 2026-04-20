package exercicio_array_matriz_extra;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] paises = new String[10];
		int[] numMedalhas = new int[10];
		int maiorMedal = numMedalhas[0];
		String maiorPais = paises[0];
		for(int i = 0; i < paises.length; i++) {
			System.out.print("Nome do " + (i + 1) + "º país participante: ");
			paises[i] = teclado.nextLine();
			System.out.print("Medalhas obtidas por " + paises[i] + ":");
			numMedalhas[i] = teclado.nextInt();
			teclado.nextLine();
			if (numMedalhas[i] > maiorMedal) {
				maiorMedal = numMedalhas[i];
				maiorPais = paises[i];
			}
		}
		System.out.print("\n-- Informações --\n\n");
		for(int i = 0; i < paises.length; i++) {
			System.out.print("País: " + paises[i] + "\nNúmero de medalhas: " + numMedalhas[i] + "\n\n");
		}
		System.out.print("\nPaís com maior quantidade de medalhas: " + maiorPais + "(" + maiorMedal + ")");
		teclado.close();
	}

}
