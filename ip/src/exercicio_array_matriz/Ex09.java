package exercicio_array_matriz;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] tabela = new int[4][4];
		int menorNum = 1000000000;
		int indiceLinha = 0;
		int indiceColuna = 0;
		for(int i = 0; i < tabela.length; i++) {
			for(int j = 0; j < tabela[i].length; j++) {
				System.out.print("\nDigite um número: ");
				tabela[i][j] = teclado.nextInt();
				if(menorNum > tabela[i][j]) {
					menorNum = tabela[i][j];
					indiceLinha = i;
					indiceColuna = j;
				}
			}
		}
		System.out.print("\n-- Informações --\n\n Tabela: \n");
		for(int i = 0; i < tabela.length; i++) {
			for(int j = 0; j < tabela[i].length; j++) {
				System.out.print("[ " + tabela[i][j] + " ]");
			}
			System.out.print("\n");
		}
		System.out.print("Menor número: " + menorNum + "\nPosição(Linha): " + indiceLinha + "\nPosição(Coluna): " + indiceColuna);
		teclado.close();
	}

}
