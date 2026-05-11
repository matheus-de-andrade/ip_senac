package procedimentos_funcoes;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Informe o " + (i+1) + "º número: ");
			nums[i] = teclado.nextInt();
		}
		do {
			System.out.print("\nVocê deseja ordenar esses números em qual ordem?\n\n1-Crescente\n2- Decrescente\n\n");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:{
				ordenarCrescente(nums);
				break;
			}
			case 2:{
				ordenarDecrescente(nums);
				break;
			}
			default:{
				System.out.print("Opção inválida, tente novamente...");
				opcao = 0;
				break;
			}
			}
		}while(opcao == 0);
		teclado.close();
	}
	
	static void ordenarCrescente(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = 0; j < nums.length - i - 1; j++) {
				if(nums[j] >= nums[j + 1]) {
					int numant = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = numant;
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	static void ordenarDecrescente(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = 0; j < nums.length - i - 1; j++) {
				if(nums[j] <= nums[j + 1]) {
					int numant = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = numant;
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
