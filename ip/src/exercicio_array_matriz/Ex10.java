package exercicio_array_matriz;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			int num = teclado.nextInt();
			while(num > nums[i]) {
				nums[i+1] = num;
			}	
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		teclado.close();
	}
}