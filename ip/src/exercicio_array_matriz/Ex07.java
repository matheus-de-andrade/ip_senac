package exercicio_array_matriz;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] tabela = new int[3][3];
		for(int i =0; i < 3; i++) {
			for(int j =0; j < 3; j++) {
				System.out.print("\nDigite um número: ");
				tabela[i][j] = teclado.nextInt();
				for(int x =0; x < 3; x++) {
					for(int y =0; y < 3; y++) {
						System.out.print("[ " + tabela[x][y] + " ]");
					}
					System.out.print("\n");
				}
				
			}
		}
		System.out.print("\nDigite um número para multiplicar essa tabela: ");
		int numMult = teclado.nextInt();
		for(int i = 0; i < tabela.length; i++) {
			for(int j = 0; j < tabela[i].length; j++) {
				tabela[i][j] *= numMult;
			}
		}
		for(int i = 0; i < tabela.length; i++) {
			for(int j = 0; j < tabela[i].length; j++) {
				System.out.print("[ " + tabela[i][j] + " ]");
			}
			System.out.print("\n");
		}
		teclado.close();
	}
}