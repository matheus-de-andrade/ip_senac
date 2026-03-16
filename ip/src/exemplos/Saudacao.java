package exemplos;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe seu nome:");
		String nome = teclado.nextLine();
		
		System.out.println("Olá " + nome + ",seja bem vindo!!");
		teclado.close();
	}

}
