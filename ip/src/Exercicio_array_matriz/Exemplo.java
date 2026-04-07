package Exercicio_array_matriz;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] listaNomes = new String[5];
		for(int i = 0; i < listaNomes.length; i++) {
			System.out.print("Informe o nome: ");
			listaNomes[i] = teclado.nextLine();
		}
		for(int i = listaNomes.length -1; i >=0; i--) {
			System.out.print("\n\n" + listaNomes[i] + "\n");
		}
		teclado.close();
	}

}
