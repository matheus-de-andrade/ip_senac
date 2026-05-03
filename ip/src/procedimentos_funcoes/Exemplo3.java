package procedimentos_funcoes;

import java.util.Scanner;
import java.util.ArrayList;

public class Exemplo3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int opcao = 1;
		do {
			System.out.print("Deseja adicionar um número a lista?\n\n1- Sim\n2- Não");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1: {
				System.out.print("\nQual número você gostaria de adicionar? ");
				nums.add(teclado.nextInt());
				break;
			}
			case 2: {
				break;
			}
			default: {
				System.out.print("xxx Opção inválida xxx (Tente novamente)\n");
				opcao = 1;
				break;
			}
			}
		}while(opcao ==1);
		System.out.print("\n\n-- Informações --\n\nNúmero de itens da lista: " + nums.size() + "\nNúmeros de lista:\n\n");
		numsLista(nums);
		teclado.close();
		
	}
	
	static void numsLista(ArrayList<Integer> nums) {
		for(int i =0; i < nums.size(); i++) {
			System.out.print((i+1) + "º - " + nums.get(i)+ " \n");
		}
	}

}
