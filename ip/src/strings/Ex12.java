package strings;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("Digite seu nome completo: ");
		String nomeCompleto = tc.nextLine();
		String[] nomeSep = nomeCompleto.split(" ");
		nomeSep[nomeSep.length - 1] =nomeSep[nomeSep.length - 1].toUpperCase();
		System.out.print(nomeSep[nomeSep.length - 1] + ",");
		for(int i = 0; i <= nomeSep.length - 2; i++) {
			System.out.print(" " + nomeSep[i]);
		}
		System.out.print(".");
		tc.close();
	}

}
