package exercicio_array_matriz;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] nums = new int[10];
		int i = 0;
		int numMaior = -1;
		int indMaior = 0;
		long numMenor = 10000000000L;
		int indMenor = 0;
		while(i < nums.length) {
			System.out.print("Digite o " + (i + 1) + "° número positivo: ");
			nums[i] = teclado.nextInt();
			if(nums[i] > 0) {
				if (numMaior < nums[i]) {
					numMaior = nums[i];
					indMaior = i;
				}
				if (numMenor > nums[i]) {
					numMenor = nums[i];
					indMenor = i;
				}
				i++;
			}
			else {
				System.out.print("Opção inválida, tente de novo");
			}
			System.out.print("\nO número maior é: " + numMaior + " aparencendo no indice " + indMaior);
			System.out.print("\nO número menor é: " + numMenor + " aparencendo no indice " + indMenor);
		}
		teclado.close();
	}

}
