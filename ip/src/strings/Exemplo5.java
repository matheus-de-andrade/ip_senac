package strings;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = tc.nextLine();
		palavra = palavra.toLowerCase();
		String palavraInvert = "";
		char[] letrasPalavra = palavra.replace(" ", "").toCharArray();
		System.out.print("--Informações--\n\nPalavra: " + palavra + "\nPalavra invertida: ");
		for(int i = letrasPalavra.length - 1; i >= 0; i--) {
			System.out.print(letrasPalavra[i]);
			palavraInvert = palavraInvert + letrasPalavra[i];
		}
		if(palavra.equalsIgnoreCase(palavraInvert)) {
			System.out.print("\nÉ um Palíndromo\n");
		}
		else {
			System.out.print("\nNão é um Palíndromo\n");
		}
		int contVogal = 0;
		for(int i = 0; i < letrasPalavra.length; i++) {
			if(letrasPalavra[i] == 'a' || letrasPalavra[i] == 'e' || letrasPalavra[i] == 'i' || letrasPalavra[i] == 'o' || letrasPalavra[i] == 'u') {
				contVogal++;
			}
		}
		System.out.print("Quantidade de vogais: " + contVogal);
		

	}

}
