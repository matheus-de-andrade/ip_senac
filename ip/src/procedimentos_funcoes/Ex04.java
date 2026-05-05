package procedimentos_funcoes;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] nums = new int[3][4];
		for(int i =0; i < nums.length; i++) {
			for(int j =0; j < nums[i].length; j++) {
				System.out.print("\nDigite um número: ");
				nums[i][j] = teclado.nextInt();
			}
		}
		int quantPares = calcularPares(nums);
		System.out.print("A quantidade de números pares é: " + quantPares);
		teclado.close();
	}
	
	static int calcularPares(int[][] nums) {
		int pares =0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				if((nums[i][j] %2) == 0) {
					pares++;
				}
			}
		}
		return pares;
	}

}
