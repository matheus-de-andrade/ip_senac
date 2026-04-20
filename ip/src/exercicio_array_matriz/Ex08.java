package exercicio_array_matriz;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat("00");
		int[][] matrizA = new int[3][3];
		int[][] matrizB = new int[3][3];
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print("\nInforme um valor inteiro para a matriz A: ");
				matrizA[i][j] = teclado.nextInt();
			}
		}
		System.out.print("\n");
		for(int i = 0; i < matrizB.length; i++) {
			for(int j = 0; j < matrizB[i].length; j++) {
				System.out.print("\nInforme um valor inteiro para a matriz B");
				matrizB[i][j] = teclado.nextInt();
			}
		}
		System.out.print("\n--Informações--\n\nTabela A:\n");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				System.out.print("[ " + formata.format(matrizA[i][j]) + " ]");
			}
			System.out.print("\n");
		}
		System.out.print("\nTabela B:\n");
		for(int i = 0; i < matrizB.length; i++) {
			for(int j = 0; j < matrizB[i].length; j++) {
				System.out.print("[ " + formata.format(matrizB[i][j]) + " ]");
			}
			System.out.print("\n");
		}
		System.out.print("\nTabela de resultado:\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("[ " + formata.format(matrizA[i][j] + matrizB[i][j])+ " ]");
			}
			System.out.print("\n");
		}
		teclado.close();
	}

}
