package strings;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Escreva uma frase: ");
		String frase = tc.nextLine();
		String[] contPalavras = frase.split(" ");
		System.out.print("-- Informações --\n\nNúmeros de palavras: " + contPalavras.length);
		for(int i = 0; i < contPalavras.length; i++) {
			System.out.print("\n" + (i+1) + "º - " + contPalavras[i]);
		}
		tc.close();
	}

}
