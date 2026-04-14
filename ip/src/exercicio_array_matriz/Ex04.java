package exercicio_array_matriz;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] nums = new int[10];
		int i = 0;
		int numMaior = -1;
		while(i < nums.length) {
			System.out.print("Digite o " + (i + 1) + "° número positivo: ");
			nums[i] = teclado.nextInt();
			if(nums[i] > 0) {
				i++;
				if (numMaior < nums[i]) {
					numMaior = nums[i];
				}
			}
			else {
				System.out.print("Opção inválida, tente de novo");
			}
		}

	}

}
