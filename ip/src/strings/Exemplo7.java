package strings;

import java.util.Scanner;

public class Exemplo7 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Escreva uma frase: ");
		String frase = tc.nextLine();
		frase = frase.replace("  ", " ");
		String[] palavrasSep = frase.split(" ");
		for(int i =0; i < palavrasSep.length; i++) {
			System.out.println(palavrasSep[i]);
		}
		
		tc.close();
	}

}
