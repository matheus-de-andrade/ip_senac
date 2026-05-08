package procedimentos_funcoes;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] nums = new int[3][3];
		for(int i =0; i < nums.length; i++) {
			for(int j =0; j < nums[i].length; j++) {
				System.out.print("Digite um número: ");
				nums[i][j] = teclado.nextInt();
			}
		}
		calcularMenorNum(nums);
		teclado.close();
	}
	
	static void calcularMenorNum(int[][]nums) {
		int menorNum = nums[0][0];
		int indI =0;
		int indJ =0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				if(nums[i][j] < menorNum) {
					menorNum = nums[i][j];
					indI = i;
					indJ = j;
				}
			}
		}
		System.out.print("\n-- Informações --\n\nMenor número: " + menorNum + "\nIndice linha: " + indI + "\nIndice coluna: " + indJ);
	}
}
