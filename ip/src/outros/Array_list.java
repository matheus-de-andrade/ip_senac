package outros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_list {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		ArrayList<String> compras = new ArrayList<String>();
		System.out.print("liste abaixo suas compras: ");
		int opcao;
		do {
			System.out.print("\nDeseja adicionar um item?\n\n1 - Sim\n2 - Não\n");
			opcao = tc.nextInt();
			switch(opcao) {
			case 1: {
				tc.nextLine();
				System.out.print("\nNome do item: ");
				compras.add(tc.nextLine());
				break;
			}
			case 2: {
				System.out.print("\nLista finalizada\nQuantidade de itens na lista: " + compras.size());
				System.out.print("\nLista de compras:\n\n");
				for(int i = 0; i < compras.size(); i++) {
					System.out.print((i+1) + "° - " + compras.get(i) + "\n");
				}
				System.out.print("|--------------------------------------|");
				break;
			}
			default:{
				opcao = 1;
				System.out.print("\n\nOpss!! Opção inválida, tente novamente\n");
				break;
			}
			}
		}while(opcao == 1);
		tc.close();
	}

}
