package exercicio_array_matriz;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] listaNomes = new String[5];
		for(int i = 0; i < listaNomes.length; i++) {
			System.out.print("Informe o nome: ");
			listaNomes[i] = teclado.nextLine();
		}
		for(int i = 0; i < listaNomes.length; i++) {
			System.out.print( listaNomes[i] + "\n");
		}
		teclado.close();

	}

}
