package strings;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Escreva uma frase: ");
		String frase = tc.nextLine();
		frase = frase.replace("." , " ");
		frase = frase.replace("," , " ");
		System.out.print("Informe a palavra para procurar: ");
		String palavraChave = tc.nextLine();
		String[] palavras = frase.split(" ");
		int contador = 0;
		for(int i = 0; i < palavras.length; i++) {
			if(palavras[i].equalsIgnoreCase(palavraChave)) {
				contador++;
			}
		}
		System.out.print("-- Informações --\n\nFrase: " + frase + "\npalavra chave: " + palavraChave + "\nQuantidade de ocorrências: " + contador);
		tc.close();
	}

}
