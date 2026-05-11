package procedimentos_funcoes;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			nums[i] = teclado.nextInt();
		}
		System.out.print("\n");
		mostrarArrpadrao(nums);
		System.out.print("\n");
		nums = mostrarArrordenada(nums);
		mostrarArrpadrao(nums);
	}
	
	static void mostrarArrpadrao(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	static int[] mostrarArrordenada(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = 0; j < nums.length - i - 1; j++) {
				if(nums[j] >= nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = 0; j < nums.length - i - 1; j++) {
				if((nums[j]/2) != (nums[j+1]/2)) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		return nums;
	}

}
