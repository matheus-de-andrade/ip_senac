package procedimentos_funcoes;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] nums = new int[4][4];
		for(int i = 0; i < nums.length; i++) {
			for(int j =0; j < nums[i].length; j++) {
				System.out.print("Digite um número: ");
				nums[i][j] = teclado.nextInt();
			}
		}
		int somaDiagon = calcularDiagon(nums);
		System.out.print("A soma dos números na diagonal da matriz é: " + somaDiagon);
		teclado.close();
	}
	
	static int calcularDiagon(int[][] nums) {
		int somaDiagon = 0;
		for(int i =0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				if(i == j) {
					somaDiagon += nums[i][j];
				}
			}
		}
		return somaDiagon;
	}

}
