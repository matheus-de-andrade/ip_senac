package procedimentos_funcoes;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantos números serão lidos? ");
		int[] nums = new int[teclado.nextInt()];
		for(int i = 0; i < nums.length; i++) {
			System.out.print("\nDigite o " + (i+1) + "º número: ");
			nums[i] = teclado.nextInt();
		}
		System.out.print("\n--Informações--\nQuantidade de números: " + nums.length);
		maiorNum(nums);
		menorNum(nums);
		mediaNum(nums);
		teclado.close();
	}
	
	static void maiorNum(int[] nums) {
		int maiorNum = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > maiorNum) {
				maiorNum = nums[i];
			}
		}
		System.out.print("\nMaior número: " + maiorNum);
	}
	
	static void menorNum(int[] nums) {
		int menorNum = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < menorNum) {
				menorNum = nums[i];
			}
		}
		System.out.print("\nMenor número: " + menorNum);
	}
	
	static void mediaNum(int[] nums) {
		double media = 0;
		for(int i = 0; i < nums.length; i++) {
			media += nums[i];
		}
		media = media / nums.length;
		System.out.print("\nMédia geral: " + media);
	}

}
