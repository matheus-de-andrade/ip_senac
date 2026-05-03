package procedimentos_funcoes;

import java.util.Scanner;
import java.util.Arrays;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			nums[i] = teclado.nextInt();
		}
		Arrays.sort(nums);
		System.out.print("\n");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		numerosPares(nums);
		numerosImpares(nums);
		int somaNums = somarLista(nums);
		System.out.print("\n\nSoma dos números: " + somaNums);
		teclado.close();
	}
	static void numerosPares(int[] nums) {
		System.out.print("\n\nNúmeros pares: ");
		for(int i =0; i < nums.length; i++) {
			if((nums[i]) % 2 ==0) {
				System.out.print(nums[i] + " ");
			}
		}
	}
	static void numerosImpares(int[] nums) {
		System.out.print("\n\nNúmeros ímpares: ");
		for(int i = 0; i < nums.length; i++) {
			if((nums[i] % 2)!=0) {
				System.out.print(nums[i] + " ");
			}
		}
	}
	static int somarLista (int[] nums) {
		int somaNum = 0;
		for(int i = 0; i < nums.length; i++) {
			somaNum += nums[i];
		}
		return somaNum;
	}
}
