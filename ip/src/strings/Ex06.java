package strings;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = tc.next();
		palavra = palavra.toUpperCase();
		palavra.replaceAll(" ", "");
		char[] letras = palavra.toCharArray();
		int numVogais = contanums(letras);
		System.out.print("-- Informações --\n\nNúmero de caracteres: " + letras.length + "\nPalavra(em maiusculo): " + palavra.toUpperCase() + "\nNúmero de vogais: " + numVogais);
		tc.close();

	}
	
	static int contanums (char[] letras) {
		int contador = 0;
		for(int i = 0; i < letras.length; i++) {
			if(letras[i] == 'A' || letras[i] == 'E' || letras[i] == 'I' || letras[i] == 'O' || letras[i] == 'U') {
				contador++;
			}
		}
		return contador;
	}

}
