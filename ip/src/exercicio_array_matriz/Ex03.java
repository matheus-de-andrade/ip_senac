package exercicio_array_matriz;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			System.out.print("\nDigite o " + (i + 1) + "° número: ");
			nums[i] = teclado.nextInt();
		}
		System.out.print("\nDigite um número para procurar");
		int numBusca = teclado.nextInt();
		int achado = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == numBusca) {
				achado++;
			}
		}
		if(achado != 0) {
			System.out.print("Achei o número " + achado + (" vezes"));
		}
		else {
			System.out.print("Não achei o número ):");
		}
		teclado.close();

	}

}
