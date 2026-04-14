package exercicio_array_matriz;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[10];
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("\nDigite o " + (i + 1) + "° nome: ");
			nomes[i] = teclado.nextLine();
		}
		System.out.print("\n");
		for(int i = 0; i < nomes.length; i++) {
			System.out.print(i + 1 + "° nome: " + nomes[i] + "\n");
		}
		System.out.print("\n");
		for(int i = nomes.length - 1; i >= 0; i--) {
			System.out.print((i + 1) + "° nome: " + nomes[i] + "\n");
		}
		teclado.close();
	}

}
