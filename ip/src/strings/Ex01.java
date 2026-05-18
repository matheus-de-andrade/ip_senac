package strings;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = teclado.nextLine();
		char[] letrasPalavra = palavra.toCharArray();
		System.out.print("-- Informações --\n\nNúmero de letras: " + letrasPalavra.length + "\n");
		for(int i =letrasPalavra.length -1; i >= 0; i--) {
			System.out.print(letrasPalavra[i]);
		}
		teclado.close();
	}

}
