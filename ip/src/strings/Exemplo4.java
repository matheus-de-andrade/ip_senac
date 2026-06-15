package strings;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		boolean validadeNome = false;
		while(validadeNome == false) {
		System.out.print("\n\nDigite seu nome: ");
		String nome = tc.nextLine();
		nome = nome.toLowerCase();
		if(nome.isBlank()) {
			System.out.print("Nome inválido");
		}
		else if(nome.length() < 3) {
			System.out.print("Nome inválido");
		}
		else if(nome.indexOf("admin") != -1) {
			System.out.print("Nome inválido");
		}
		else {
			System.out.print("Nome válido\n\nNome: " + nome.replace(nome.substring(0,1), nome.substring(0,1).toUpperCase()));
			validadeNome = true;
		}
		}
		tc.close();
	}

}
