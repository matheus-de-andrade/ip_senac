package strings;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Escreva um pequeno texto: ");
		String frase = tc.nextLine();
		String[] palavrasSeparadas = frase.split(" ");
		for(int i = 0; i < palavrasSeparadas.length; i++) {
			System.out.print(palavrasSeparadas[i] + "\n");
		}
		tc.close();
	}

}
